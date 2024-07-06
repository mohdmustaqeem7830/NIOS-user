package com.Hamza.niosgeniusbookshub.subject_twelth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTwelthWorksheetSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class twelth_worksheet_subject extends AppCompatActivity {

    private ActivityTwelthWorksheetSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwelthWorksheetSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding.twelthWorksheetAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Accountancy");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Arabic");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetBiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Biology");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Business Studies");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Chemistry");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetComputerscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Computer Science");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Data Entry Operation");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetEarlychidhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Early Childhood Care and Education");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Economics");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_English");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetEnviromentalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Environmental Science");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Geography");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_History");
                startActivity(intent);
            }
        });

        binding.tenthWorksheetHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Home Science");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetIntroductiontolaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Introduction to Law");
                startActivity(intent);
            }
        });

        binding.twelthWorkheetLibraryinormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Information and Education Science");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetMasscommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Mass Communication");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Mathematics");
                startActivity(intent);
            }
        });

   binding.twelthWorksheetMilitaryhistory.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), study_material.class);
        intent.putExtra("key","XII Worksheet_Military History");
        startActivity(intent);
    }
});
        binding.twelthWorksheetMilitarystudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Military Studies");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Painting");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetPhysicaleducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Physical Education and Yog");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetPoliticalscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Political Science");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Psychology");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Physics");
                startActivity(intent);
            }
        });

        binding.twelthworksheetHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Hindi");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetSociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Sociology");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Tourism");
                startActivity(intent);
            }
        });

        binding.twelthWorksheetUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","XII Worksheet_Urdu");
                startActivity(intent);
            }
        });




    }
}