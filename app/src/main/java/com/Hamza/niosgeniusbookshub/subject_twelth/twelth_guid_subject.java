package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthGuidSubjectBinding;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_guid_subject extends AppCompatActivity {

    private ActivityTwelthGuidSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityTwelthGuidSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        binding.twelthGuideAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Accountancy");
                startActivity(intent);
            }
        });

        binding.twelthGuideBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Biology");
                startActivity(intent);
            }
        });

        binding.twelthGuideBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Business Studies");
                startActivity(intent);
            }
        });

        binding.twelthGuideChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Chemistry");
                startActivity(intent);
            }
        });

        binding.twelthGuideComputerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Computer Science");
                startActivity(intent);
            }
        });

        binding.twelthGuideDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Data Entry Operation");
                startActivity(intent);
            }
        });

        binding.twelthGuideEarlychidhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Early Childhood Care and Education");
                startActivity(intent);
            }
        });

        binding.twelthGuideEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Information and Education Science");
                startActivity(intent);
            }
        });

        binding.twelthGuideEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_English");
                startActivity(intent);
            }
        });

        binding.twelthGuideEnviromentalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Environmental Science");
                startActivity(intent);
            }
        });

        binding.twelthGuideGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Geography");
                startActivity(intent);
            }
        });

        binding.twelthGuideHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_History");
                startActivity(intent);
            }
        });

        binding.tenthGuideHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Hindi");
                startActivity(intent);
            }
        });

        binding.twelthGuideHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Home Science");
                startActivity(intent);
            }
        });

        binding.twelthGuideMasscommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Mass Communication");
                startActivity(intent);
            }
        });

        binding.twelthGuideMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Mathematics");
                startActivity(intent);
            }
        });

        binding.twelthGuidePainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Painting");
                startActivity(intent);
            }
        });

        binding.twelthGuidePoliticalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Political Science");
                startActivity(intent);
            }
        });

        binding.twelthGuidePsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Psychology");
                startActivity(intent);
            }
        });

        binding.twelthGuidePhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Physics");
                startActivity(intent);
            }
        });

        binding.twelthGuideSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Sanskrit");
                startActivity(intent);
            }
        });

        binding.twelthGuideSociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Sociology");
                startActivity(intent);
            }
        });
   binding.twelthGuideUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Guide_Urdu");
                startActivity(intent);
            }
        });




    }
}