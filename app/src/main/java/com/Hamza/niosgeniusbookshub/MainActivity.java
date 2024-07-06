package com.Hamza.niosgeniusbookshub;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.Fragments.HomeFragments;
import com.Hamza.niosgeniusbookshub.Fragments.SavedPDF;
import com.Hamza.niosgeniusbookshub.Fragments.privacyFragment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.io.File;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    SmoothBottomBar bottomBar;
    private ProgressBar progressBar;
    FirebaseRemoteConfig mFirebaseRemoteConfig;
    private long downloadId;
    TextView progressText;
    ConstraintLayout progress;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // In your Application class or MainActivity onCreate()
        check_version();

        progressBar =findViewById(R.id.progressBar);
        progressText = findViewById(R.id.progressText);
        progress = findViewById(R.id.progress);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        FirebaseApp.initializeApp(getApplicationContext());


        bottomBar = findViewById(R.id.bottomBar);

        //by default smoothbar at home
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, new HomeFragments());
        fragmentTransaction.commit();
        bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override

            public boolean onItemSelect(int i) {
                if (i == 0) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, new HomeFragments());
                    fragmentTransaction.commit();
                }
                if (i == 1) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, new SavedPDF());
                    fragmentTransaction.commit();

                }
                if(i==2){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, new privacyFragment());
                    fragmentTransaction.commit();
                }
                return false;
            }
        });



    }
    private void showDialog() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure want to Exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User canceled the delete operation

                    }
                });

        builder.create().show();
    }    @Override
    public void onBackPressed() {
        showDialog();

    }

    public void check_version(){
         mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);
        mFirebaseRemoteConfig.fetchAndActivate()
                .addOnCompleteListener(this, new OnCompleteListener<Boolean>() {
                    @Override
                    public void onComplete(@NonNull Task<Boolean> task) {
                        if (task.isSuccessful()) {
                            checkForUpdate();

                        } else {
                            Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    private void checkForUpdate() {
        String latestVersion = "old";
               latestVersion = mFirebaseRemoteConfig.getString("latest_version");
        String currentVersion = getCurrentVersion();
        if (!latestVersion.equals(currentVersion) && !latestVersion.equals("old")) {
            promptUpdate();
        }
    }


    private String getCurrentVersion() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0";
        }
    }
    private void promptUpdate() {
        new AlertDialog.Builder(this)
                .setTitle("New Update Available")
                .setMessage("A new version of the app is available. Please update to continue.")
                .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        downloadAPK();
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

//     Download apk from firebase

    private void downloadAPK() {
        progressBar.setVisibility(View.VISIBLE);
        progressText.setVisibility(View.VISIBLE);
        progress.setVisibility(View.VISIBLE);

        String apkUrl = mFirebaseRemoteConfig.getString("update_url");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(apkUrl));
        request.setTitle("App Update");
        request.setDescription("Downloading the update...");
        request.setDestinationInExternalFilesDir(this, Environment.DIRECTORY_DOWNLOADS, "yourapp.apk");

        DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        downloadId = manager.enqueue(request);

        registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
        startDownloadProgressUpdater();
    }

    private void startDownloadProgressUpdater() {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(downloadId);
                Cursor cursor = manager.query(query);
                if (cursor != null && cursor.moveToFirst()) {
                    int totalSizeIdx = cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES);
                    int downloadedSizeIdx = cursor.getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR);
                    int totalSize = cursor.getInt(totalSizeIdx);
                    int downloadedSize = cursor.getInt(downloadedSizeIdx);
                    if (totalSize > 0) {
                        int progress = (int) ((downloadedSize * 100L) / totalSize);
                        progressBar.setProgress(progress);
                        progressText.setText("Downloading : "+progress +" %");
                    }
                    cursor.close();
                }
                handler.postDelayed(this, 500);
            }
        });
    }

    private BroadcastReceiver onComplete = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            progressBar.setVisibility(View.GONE);
            progressText.setVisibility(View.GONE);
            progress.setVisibility(View.GONE);
            File apkFile = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "yourapp.apk");
            if (apkFile.exists()) {
                promptInstall(apkFile);
            } else {
                Toast.makeText(MainActivity.this, "Download failed", Toast.LENGTH_SHORT).show();
            }
        }
    };
    private void promptInstall(File apkFile) {
        if (apkFile.exists()) {
            Uri apkUri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", apkFile);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(apkUri, "application/vnd.android.package-archive");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Ensure the installation activity starts properly
            startActivity(intent);
        } else {
            Toast.makeText(this, "APK file does not exist", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(onComplete);
    }
}