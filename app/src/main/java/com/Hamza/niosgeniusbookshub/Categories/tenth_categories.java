package com.Hamza.niosgeniusbookshub.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.PdfAdapter;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.subject.tenth_guide_subject;
import com.Hamza.niosgeniusbookshub.subject.tenth_hindi_medium_subject;
import com.Hamza.niosgeniusbookshub.subject.tenth_urdu_medium_subject;
import com.Hamza.niosgeniusbookshub.study_material;
import com.Hamza.niosgeniusbookshub.subject.tenth_english_medium_subject;
import com.Hamza.niosgeniusbookshub.subject.tenth_pyq_subject;
import com.Hamza.niosgeniusbookshub.subject.tenth_worksheet_subject;
import com.Hamza.niosgeniusbookshub.subject_twelth.twelth_guid_subject;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class tenth_categories extends AppCompatActivity {
RewardedAd rewardedAd;
    CardView tenth_englishmedium,tenth_hindimedium,tenth_urdumedium,tenth_practical,tenth_guide,tenth_worksheet,tenth_notes,tenth_tutor,tenth_pyq,tenth_syllabus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tenth_categories);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        tenth_englishmedium=findViewById(R.id.tenth_english_categories);
        tenth_hindimedium= findViewById(R.id.hindi);
        tenth_urdumedium = findViewById(R.id.urdu);
        tenth_practical = findViewById(R.id.practical);
        tenth_guide = findViewById(R.id.guide);
        tenth_worksheet = findViewById(R.id.worksheet);
        tenth_pyq = findViewById(R.id.pyq);
        tenth_tutor = findViewById(R.id.assignment);
        tenth_notes = findViewById(R.id.notes);
        tenth_syllabus=findViewById(R.id.syllabus);
        loadreward();
        //tenth english medium categories working
        tenth_englishmedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), tenth_english_medium_subject.class));

            }
        });
        //tenth hindi medium categories work
        tenth_hindimedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), tenth_hindi_medium_subject.class));
            }
        });
        //tenth urdu medium categories work
        tenth_urdumedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), tenth_urdu_medium_subject.class));
            }
        });
        //tenth practical work

       tenth_worksheet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(), tenth_worksheet_subject.class));
           }
       });
       tenth_pyq.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(), tenth_pyq_subject.class));
           }
       });

       tenth_tutor.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ads("X Solved TMA_",Categories_hindi_english.class);
           }
       });


       tenth_syllabus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(tenth_categories.this, study_material.class);
               intent.putExtra("key","X Syllabus_");
               startActivity(intent);
           }
       });


       tenth_notes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ads("X Notes_",Categories_hindi_english.class);
           }
       });
      tenth_practical.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ads("X Solved Practical_",Categories_hindi_english.class);
          }
      });

        tenth_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ads("key",tenth_guide_subject.class);
            }
        });

    }

    public  void ads(String key , Class<?> myClass){
        if (rewardedAd != null) {
            Activity activityContext = (Activity) tenth_categories.this;
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
        RewardedAd.load(tenth_categories.this, "ca-app-pub-5945464463399164/1416175673",
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