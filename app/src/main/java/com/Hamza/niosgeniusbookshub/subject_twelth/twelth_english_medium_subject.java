package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthEnglishMediumSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_english_medium_subject extends AppCompatActivity {

    private ActivityTwelthEnglishMediumSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwelthEnglishMediumSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    binding.twelthEnglishAcountacy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Accountancy");
            startActivity(intent);
        }
    });


    binding.twelthEnlishArabic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Arabic");
            startActivity(intent);
        }
    });


    binding.twelthEnglishBengali.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Bengali");
            startActivity(intent);
        }
    });


    binding.twelthEnglishBharatyadarshan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Bharatiya Darshan");
            startActivity(intent);
        }
    });


    binding.twelthEnglishBiology.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Biology");
            startActivity(intent);
        }
    });


    binding.twelthEnglishBussinessStudies.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Business Studies");
            startActivity(intent);
        }
    });


    binding.twelthEnglishChemistry.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Chemistry");
            startActivity(intent);
        }
    });


    binding.twelthEnglishComputerscience.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Computer Science");
            startActivity(intent);
        }
    });


    binding.twelthEnglishDataentry.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Data Entry Operation");
            startActivity(intent);
        }
    });


    binding.twelthEnglishEarlychidhood.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Early Childhood Care and Education");
            startActivity(intent);
        }
    });


    binding.twelthEnglishEconomic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Economics");
            startActivity(intent);
        }
    });


    binding.twelthEnglishEmployibilityskill.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Employability Skills");
            startActivity(intent);
        }
    });


    binding.twelthEnglishEnglih.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_English");
            startActivity(intent);
        }
    });


    binding.twelthEnglishEnviromentalscience.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Environmental Science");
            startActivity(intent);
        }
    });


    binding.twelthEnglishGeography.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Geography");
            startActivity(intent);
        }
    });


    binding.twelthEnglishGujrati.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Gujarati");
            startActivity(intent);
        }
    });


    binding.twelthEnglishHistory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_History");
            startActivity(intent);
        }
    });


    binding.twelthEnglishHomeScience.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Home Science");
            startActivity(intent);
        }
    });


    binding.twelthEnglishIntroductiontolaw.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Introduction to Law");
            startActivity(intent);
        }
    });


    binding.twelthEnglishLibraryinormation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Information and Education Science");
            startActivity(intent);
        }
    });


    binding.twelthEnglishMasscommunication.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Mass Communication");
            startActivity(intent);
        }
    });


    binding.twelthEnglishMalayalam.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Malayalam");
            startActivity(intent);
        }
    });


    binding.twelthEnglishMathematics.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Mathematics");
            startActivity(intent);
        }
    });


    binding.twelthEnglishMilitaryhistory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Military History");
            startActivity(intent);
        }
    });


    binding.twelthEnglishMilitarystudies.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Military Studies");
            startActivity(intent);
        }
    });


    binding.twelthEnglishOdia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Odia");
            startActivity(intent);
        }
    });


    binding.twelthEnglishPainting.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Painting");
            startActivity(intent);
        }
    });

   binding.twelthEnglishPunjabi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Panjabi");
            startActivity(intent);
        }
    });


    binding.twelthEnglishPhysicaleducation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Physical Education and Yog");
            startActivity(intent);
        }
    });


    binding.twelthEnglishPoliticalscience.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Political Science");
            startActivity(intent);
        }
    });


    binding.twelthEnglishPsychology.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Psychology");
            startActivity(intent);
        }
    });


    binding.twelthEnglishPhysics.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Physics");
            startActivity(intent);
        }
    });


    binding.twelthEnglishSanskrit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Sanskrit");
            startActivity(intent);
        }
    });


    binding.twelthEnglishSanskritsahithya.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Sanskrit Sahitya");
            startActivity(intent);
        }
    });


    binding.twelthEnglishSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Sanskrit Vyakarna");
            startActivity(intent);
        }
    });


    binding.twelthEnglishSociology.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Sociology");
            startActivity(intent);
        }
    });


    binding.twelthEnglishTamil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Tamil");
            startActivity(intent);
        }
    });


    binding.twelthEnglishTourism.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Tourism");
            startActivity(intent);
        }
    });


    binding.twelthEnglishSindhi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Sindhi");
            startActivity(intent);
        }
    });


    binding.twelthEnglishVedaadhayan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), study_material.class);
            intent.putExtra("key","XII English Medium_Veda Adhyayan");
            startActivity(intent);
        }
    });



    }
}