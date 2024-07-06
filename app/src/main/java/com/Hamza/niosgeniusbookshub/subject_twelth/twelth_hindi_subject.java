package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthHindiSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_hindi_subject extends AppCompatActivity {
private ActivityTwelthHindiSubjectBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwelthHindiSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding.twelthHindiAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Accountancy");
                startActivity(intent);
            }
        });

        binding.twelthHindiBharatyadarshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Bharatiya Darshan");
                startActivity(intent);
            }
        });



        binding.twelthHindiBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Biology");
                startActivity(intent);
            }
        });



        binding.twelthHindiBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Business Studies");
                startActivity(intent);
            }
        });



        binding.twelthHindiChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Chemistry");
                startActivity(intent);
            }
        });



        binding.twelthHindiDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Data Entry Operation");
                startActivity(intent);
            }
        });



        binding.twelthHindiEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Economics");
                startActivity(intent);
            }
        });



        binding.twelthHindiEnviromentalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Environmental Science");
                startActivity(intent);
            }
        });



        binding.twelthHindiGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Geography");
                startActivity(intent);
            }
        });



        binding.twelthHindiHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_History");
                startActivity(intent);
            }
        });



        binding.tenthHindiHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Hindi");
                startActivity(intent);
            }
        });



        binding.twelthHindiHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Home Science");
                startActivity(intent);
            }
        });



        binding.twelthHindiIntroductiontolaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Introduction to Law");
                startActivity(intent);
            }
        });



        binding.twelthHindiLibraryinormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Information and Education Science");
                startActivity(intent);
            }
        });



        binding.twelthHindiMasscommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Mass Communication");
                startActivity(intent);
            }
        });



        binding.twelthHindiMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Mathematics");
                startActivity(intent);
            }
        });



        binding.twelthHindiPoliticalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Political Science");
                startActivity(intent);
            }
        });



        binding.twelthHindiPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Psychology");
                startActivity(intent);
            }
        });



        binding.twelthHindiPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Physics");
                startActivity(intent);
            }
        });



        binding.twelthHindiSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Sanskrit Sahitya");
                startActivity(intent);
            }
        });



        binding.twelthHindiSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Sanskrit Vyakarana");
                startActivity(intent);
            }
        });



        binding.twelthHindiSociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Sociology");
                startActivity(intent);
            }
        });



        binding.twelthHindiTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Tourism");
                startActivity(intent);
            }
        });



        binding.twelthHindiVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Hindi Medium_Veda Adhyayan");
                startActivity(intent);
            }
        });

    }
}