package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthUrduMediumSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_urdu_medium_subject extends AppCompatActivity {

    private ActivityTwelthUrduMediumSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwelthUrduMediumSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding.twelthUrduAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Accountancy");
                startActivity(intent);
            }
        });


        binding.twelthEnlishArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Arabic");
                startActivity(intent);
            }
        });


        binding.twelthUrduBengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Bengali");
                startActivity(intent);
            }
        });


        binding.twelthUrduBharatyadarshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Bharatiya Darshan");
                startActivity(intent);
            }
        });


        binding.twelthUrduBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Biology");
                startActivity(intent);
            }
        });


        binding.twelthUrduBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Business Studies");
                startActivity(intent);
            }
        });


        binding.twelthUrduChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Chemistry");
                startActivity(intent);
            }
        });


        binding.twelthUrduComputerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Computer Science");
                startActivity(intent);
            }
        });


        binding.twelthUrduDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Data Entry Operation");
                startActivity(intent);
            }
        });


        binding.twelthUrduEarlychidhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Early Childhood Care and Education");
                startActivity(intent);
            }
        });


        binding.twelthUrduEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Economics");
                startActivity(intent);
            }
        });


        binding.twelthUrduEmployibilityskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Employability Skills");
                startActivity(intent);
            }
        });


        binding.twelthUrduEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Urdu");
                startActivity(intent);
            }
        });


        binding.twelthUrduEnviromentalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Environmental Science");
                startActivity(intent);
            }
        });


        binding.twelthUrduGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Geography");
                startActivity(intent);
            }
        });


        binding.twelthUrduGujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Gujarati");
                startActivity(intent);
            }
        });


        binding.twelthUrduHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_History");
                startActivity(intent);
            }
        });


        binding.twelthUrduHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Home Science");
                startActivity(intent);
            }
        });


        binding.twelthUrduIntroductiontolaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Introduction to Law");
                startActivity(intent);
            }
        });


        binding.twelthUrduLibraryinormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Information and Education Science");
                startActivity(intent);
            }
        });


        binding.twelthUrduMasscommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Mass Communication");
                startActivity(intent);
            }
        });


        binding.twelthUrduMalayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Malayalam");
                startActivity(intent);
            }
        });


        binding.twelthUrduMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Mathematics");
                startActivity(intent);
            }
        });


        binding.twelthUrduMilitaryhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Military History");
                startActivity(intent);
            }
        });


        binding.twelthUrduMilitarystudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Military Studies");
                startActivity(intent);
            }
        });


        binding.twelthUrduOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Odia");
                startActivity(intent);
            }
        });


        binding.twelthUrduPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Painting");
                startActivity(intent);
            }
        });

        binding.twelthUrduPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Panjabi");
                startActivity(intent);
            }
        });


        binding.twelthUrduPhysicaleducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Physical Education and Yog");
                startActivity(intent);
            }
        });


        binding.twelthUrduPoliticalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Political Science");
                startActivity(intent);
            }
        });


        binding.twelthUrduPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Psychology");
                startActivity(intent);
            }
        });


        binding.twelthUrduPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Physics");
                startActivity(intent);
            }
        });


        binding.twelthUrduSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Sanskrit");
                startActivity(intent);
            }
        });


        binding.twelthUrduSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Sanskrit Sahitya");
                startActivity(intent);
            }
        });


        binding.twelthUrduSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Sanskrit Vyakarna");
                startActivity(intent);
            }
        });


        binding.twelthUrduSociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Sociology");
                startActivity(intent);
            }
        });


        binding.twelthUrduTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Tamil");
                startActivity(intent);
            }
        });


        binding.twelthUrduTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Tourism");
                startActivity(intent);
            }
        });


        binding.twelthUrduSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Sindhi");
                startActivity(intent);
            }
        });


        binding.twelthUrduVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Urdu Medium_Veda Adhyayan");
                startActivity(intent);
            }
        });

    }
}