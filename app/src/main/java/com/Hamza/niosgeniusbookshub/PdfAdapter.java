package com.Hamza.niosgeniusbookshub;

import static android.content.ContentValues.TAG;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Hamza.niosgeniusbookshub.Categories.tenth_categories;
import com.airbnb.lottie.utils.Utils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class PdfAdapter extends RecyclerView.Adapter<PdfAdapter.PdfViewHolder> {
    private List<PdfModal> pdfList;
    Context context;
    private RewardedAd rewardedAd;
    private InterstitialAd mInterstitialAd;


    public PdfAdapter(Context context, List<PdfModal> pdfList) {
        this.pdfList = pdfList;
        this.context = context;
        loadreward();
    }

    @NonNull
    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pdf_item, parent, false);
        return new PdfViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {
        PdfModal pdf = pdfList.get(position);


        // Bind data to the ViewHolder
        holder.nameTextView.setText(pdf.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show((Activity) context);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            Toast.makeText(context, "Add success", Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    // If the interstitial ad is not loaded, launch ViewPdf activity directly
                    Toast.makeText(context, "Add success", Toast.LENGTH_SHORT).show();


                }
            }
        });
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    // If the interstitial ad is not loaded, launch ViewPdf activity directly
                    Intent intent = new Intent(context, ViewPdf.class);
                    intent.putExtra("url", pdf.getUrl());
                    context.startActivity(intent);
            }
        });

        holder.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rewardedAd != null) {
                    Activity activityContext = (Activity) context;
                    rewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                            loadreward();
                        }
                    });
                    rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdClicked() {
                            super.onAdClicked();
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            new DownloadPdfTask(context).execute(pdf.getUrl(),pdf.getName());

                            loadreward();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            super.onAdFailedToShowFullScreenContent(adError);
                            new DownloadPdfTask(context).execute(pdf.getUrl(),pdf.getName());

                        }

                        @Override
                        public void onAdImpression() {
                            super.onAdImpression();
                            loadreward();
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {

                        }
                    });
                }
                else {
                    new DownloadPdfTask(context).execute(pdf.getUrl(),pdf.getName());


                }






                new DownloadPdfTask(context).execute(pdf.getUrl(),pdf.getName());
            }
        });
        // Add other fields as needed
    }

    @Override
    public int getItemCount() {
        return pdfList.size();
    }

    public static class PdfViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        Button view, save;
        // Add other TextViews as needed

        public PdfViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.pdfFileName);
            view = itemView.findViewById(R.id.view);
            save = itemView.findViewById(R.id.save);

            // Initialize other TextViews
        }
    }


    private static class DownloadPdfTask extends AsyncTask<String, Void, Boolean> {
        private Context context;

        public DownloadPdfTask(Context context) {
            this.context = context;
        }

        @Override
        protected Boolean doInBackground(String... params) {
            String pdfUrl = params[0];
            String pdfname = params[1];
            try {
                URL url = new URL(pdfUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                // Get the input stream from the connection
                InputStream input = connection.getInputStream();

                // Create a directory to save the downloaded PDF
                File directory = new File(context.getFilesDir(), "pdfs");
                if (!directory.exists()) {
                    directory.mkdir();
                }

                // Create a new File object for the PDF
                File pdfFile = new File(directory, pdfname + ".pdf");

                // Create a FileOutputStream for the file
                FileOutputStream output = new FileOutputStream(pdfFile);

                // Create a buffer for copying
                byte[] buffer = new byte[1024];
                int bytesRead;

                // Write the PDF content to the file
                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }

                // Close the streams
                output.close();
                input.close();

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean result) {
            super.onPostExecute(result);

            if (result) {

                // Display a message or perform any action on successful download
                Toast.makeText(context, "PDF Downloaded and Saved Successfully", Toast.LENGTH_SHORT).show();
            } else {
                // Display an error message or perform any action on download failure
                Toast.makeText(context, "Failed to Download PDF", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void loadreward() {
        AdRequest Request = new AdRequest.Builder().build();
        RewardedAd.load(context, "ca-app-pub-3940256099942544/5224354917",
                Request, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        rewardedAd = null;


                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        rewardedAd = ad;

                    }
                });
    }


}

