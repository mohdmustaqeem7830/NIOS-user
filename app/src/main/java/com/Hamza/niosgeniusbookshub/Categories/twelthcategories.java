package com.Hamza.niosgeniusbookshub.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_hindi_subject;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_urdu_medium_subject;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.study_material;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_english_medium_subject;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_guid_subject;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_pyq_subject;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_worksheet_subject;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class twelthcategories extends AppCompatActivity {
    private RewardedAd rewardedAd;
    CardView twelth_englishmedium,twelth_hindimedium,twelth_urdumedium,twelth_practical,twelth_guide,twelth_worksheet,twelth_notes,twelth_tutor,twelth_pyq,twelth_syllabus;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelthcategories);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        twelth_englishmedium=findViewById(R.id.english);
        twelth_hindimedium= findViewById(R.id.hindi);
        twelth_urdumedium = findViewById(R.id.urdu);
        twelth_practical = findViewById(R.id.practical);
        twelth_guide = findViewById(R.id.guide);
        twelth_worksheet = findViewById(R.id.worksheet);
        twelth_pyq = findViewById(R.id.pyq);
        twelth_notes = findViewById(R.id.notes);
        twelth_syllabus = findViewById(R.id.syllabus);
        twelth_tutor = findViewById(R.id.assignment);
        //tenth english medium categories working
        loadreward();
        twelth_englishmedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), twelth_english_medium_subject.class));

            }
        });
        //tenth hindi medium categories work
        twelth_hindimedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), twelth_hindi_subject.class));
            }
        });
        //tenth urdu medium categories work
        twelth_urdumedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), twelth_urdu_medium_subject.class));
            }
        });
        //tenth practical work

        twelth_worksheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), twelth_worksheet_subject.class));
            }
        });
        twelth_pyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), twelth_pyq_subject.class));
            }
        });
          twelth_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ads("XII Notes_", Categories_hindi_english.class);
            }
        });
          twelth_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Syllabus_");
                startActivity(intent);            }
        });
          twelth_tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ads("XII Solved TMA_", Categories_hindi_english.class);
            }
        });
      twelth_practical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ads("XII Solved Practical_", Categories_hindi_english.class);
         }
        });

        twelth_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ads("key", twelth_guid_subject.class);
            }
        });



    }
    public  void ads(String key , Class<?> myClass){
        if (rewardedAd != null) {
            Activity activityContext = (Activity) twelthcategories.this;
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
                    Intent intent = new Intent(getApplicationContext(), myClass);
                    intent.putExtra("key",key);
                    startActivity(intent);
                    loadreward();
                }

            });
        }
        else {
            Intent intent = new Intent(getApplicationContext(),myClass);
            intent.putExtra("key",key);
            startActivity(intent);
        }
    }
    public void loadreward() {
        AdRequest Request = new AdRequest.Builder().build();
        RewardedAd.load(twelthcategories.this, "ca-app-pub-5945464463399164/1416175673",
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