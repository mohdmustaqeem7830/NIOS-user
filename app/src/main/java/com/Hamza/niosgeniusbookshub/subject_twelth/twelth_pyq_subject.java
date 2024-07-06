package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthPyqSubjectBinding;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_pyq_subject extends AppCompatActivity {
    private ActivityTwelthPyqSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwelthPyqSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding.twelthPyqAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Accountancy");
                startActivity(intent);
            }
        });

        binding.twelthPyqArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Arabic");
                startActivity(intent);
            }
        });

        binding.twelthPyqBengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Bengali");
                startActivity(intent);
            }
        });

        binding.twelthPyqBharatyadarshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Bharatiya Darshan");
                startActivity(intent);
            }
        });

        binding.twelthPyqBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Biology");
                startActivity(intent);
            }
        });

        binding.twelthPyqBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Business Studies");
                startActivity(intent);
            }
        });

        binding.twelthPyqChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Chemistry");
                startActivity(intent);
            }
        });

        binding.twelthPyqComputerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Computer Science");
                startActivity(intent);
            }
        });

        binding.twelthPyqDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Data Entry Operation");
                startActivity(intent);
            }
        });

        binding.twelthPyqEarlychidhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Early Childhood Care and Education");
                startActivity(intent);
            }
        });

        binding.twelthPyqEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Economics");
                startActivity(intent);
            }
        });

        binding.twelthPyqEmployibilityskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Employability Skills");
                startActivity(intent);
            }
        });

        binding.twelthPyqEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_English");
                startActivity(intent);
            }
        });

        binding.twelthPyqEnviromentalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Environmental Science");
                startActivity(intent);
            }
        });

        binding.twelthPyqGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Geography");
                startActivity(intent);
            }
        });

        binding.twelthPyqGujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Gujarati");
                startActivity(intent);
            }
        });

        binding.twelthPyqHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Hindi");
                startActivity(intent);
            }
        });
        binding.twelthPyqHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_History");
                startActivity(intent);
            }
        });

        binding.twelthPyqHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Home Science");
                startActivity(intent);
            }
        });

        binding.twelthPyqIntroductiontolaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Introduction to Law");
                startActivity(intent);
            }
        });

        binding.twelthPyqLibraryinormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Information and Education Science");
                startActivity(intent);
            }
        });

        binding.twelthPyqMasscommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Mass Communication");
                startActivity(intent);
            }
        });

        binding.twelthPyqMalayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Malayalam");
                startActivity(intent);
            }
        });

        binding.twelthPyqMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Mathematics");
                startActivity(intent);
            }
        });

        binding.twelthPyqMilitaryhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Military History");
                startActivity(intent);
            }
        });

        binding.twelthPyqMilitarystudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Military Studies");
                startActivity(intent);
            }
        });

        binding.twelthPyqOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Odia");
                startActivity(intent);
            }
        });

        binding.twelthPyqPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Painting");
                startActivity(intent);
            }
        });

        binding.twelthPyqPhysicaleducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Physical Education and Yog");
                startActivity(intent);
            }
        });

        binding.twelthPyqPoliticalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Political Science");
                startActivity(intent);
            }
        });

        binding.twelthPyqPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Psychology");
                startActivity(intent);
            }
        });

        binding.twelthPyqPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Physics");
                startActivity(intent);
            }
        });

        binding.twelthPyqPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Panjabi");
                startActivity(intent);
            }
        });

        binding.twelthPyqSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Sanskrit");
                startActivity(intent);
            }
        });

        binding.twelthPyqSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Sanskrit Sahitya");
                startActivity(intent);
            }
        });

        binding.twelthPyqSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Sanskrit Vyakarna");
                startActivity(intent);
            }
        });

        binding.twelthPyqSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Sindhi");
                startActivity(intent);
            }
        });

        binding.twelthPyqSociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Sociology");
                startActivity(intent);
            }
        });

        binding.twelthPyqTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Tamil");
                startActivity(intent);
            }
        });

        binding.twelthPyqVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Veda Adhyayan");
                startActivity(intent);
            }
        });

        binding.twelthPyqTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Tourism");
                startActivity(intent);
            }
        });

        binding.tenthPyqUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Question Papers_Urdu");
                startActivity(intent);
            }
        });

    }
}