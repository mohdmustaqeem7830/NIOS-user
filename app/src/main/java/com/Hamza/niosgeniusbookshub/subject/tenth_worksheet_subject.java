package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthWorksheetSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class tenth_worksheet_subject extends AppCompatActivity {

    private ActivityTenthWorksheetSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTenthWorksheetSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        binding.tenthWorksheetAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Acountacy");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Arabic");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Business Studies");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Data Entry Operation");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Economics");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_English");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetHindustanimusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Hindustani Music");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Home Science");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Indian Culture Heritage");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetKarnaticmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Carnatic Music");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Mathematics");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Painting");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Persian");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Psychology");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Sanskrit");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Science and Technology");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Sindhi");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Social Science");
                startActivity(intent);
            }
        });


        binding.tenthWorksheetUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Worksheet_Urdu");
                startActivity(intent);
            }
        });




    }
}