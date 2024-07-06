package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthGuideSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class tenth_guide_subject extends AppCompatActivity {
    private ActivityTenthGuideSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTenthGuideSubjectBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        binding.tenthGuideArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Arabic");
                startActivity(intent);
            }
        });


        binding.tenthGuideBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Business Studies");
                startActivity(intent);
            }
        });


        binding.tenthGuideDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Data Entry Operation");
                startActivity(intent);
            }
        });


        binding.tenthGuideEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Economics");
                startActivity(intent);
            }
        });


        binding.tenthGuideEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_English");
                startActivity(intent);
            }
        });


        binding.tenthGuideHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Hindi");
                startActivity(intent);
            }
        });


        binding.tenthGuideHindustanimusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Hindustani Music");
                startActivity(intent);
            }
        });


        binding.tenthGuideHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Home Science");
                startActivity(intent);
            }
        });


        binding.tenthGuideIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Indian Culture Heritage");
                startActivity(intent);
            }
        });


        binding.tenthGuideKarnaticmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Carnatic Music");
                startActivity(intent);
            }
        });


        binding.tenthGuideMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Mathematics");
                startActivity(intent);
            }
        });


        binding.tenthGuidePainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Painting");
                startActivity(intent);
            }
        });


        binding.tenthGuidePsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Psychology");
                startActivity(intent);
            }
        });


        binding.tenthGuideSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Sanskrit");
                startActivity(intent);
            }
        });


        binding.tenthGuideScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Science and Technology");
                startActivity(intent);
            }
        });


        binding.tenthGuideSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Sindhi");
                startActivity(intent);
            }
        });


        binding.tenthGuideSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Social Science");
                startActivity(intent);
            }
        });


        binding.tenthGuideUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Guide_Urdu");
                startActivity(intent);
            }
        });



    }
}