package com.Hamza.niosgeniusbookshub.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityCategoriesHindiEnglishBinding;
import com.Hamza.niosgeniusbookshub.study_material;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class Categories_hindi_english extends AppCompatActivity {
private ActivityCategoriesHindiEnglishBinding binding;
RewardedAd rewardedAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoriesHindiEnglishBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        String key = getIntent().getStringExtra("key");
        binding.english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newkey = key+"English Medium";
                Intent intent  = new Intent(Categories_hindi_english.this, study_material.class);
                intent.putExtra("key",newkey);
                startActivity(intent);
            }
        });
 binding.hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newkey = key+"Hindi Medium";
                Intent intent  = new Intent(Categories_hindi_english.this, study_material.class);
                intent.putExtra("key",newkey);
                startActivity(intent);
            }
        });


    }
}