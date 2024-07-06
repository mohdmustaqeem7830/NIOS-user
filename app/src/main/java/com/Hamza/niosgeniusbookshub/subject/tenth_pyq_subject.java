package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthPyqSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class tenth_pyq_subject extends AppCompatActivity {

    private ActivityTenthPyqSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTenthPyqSubjectBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




        binding.tenthPyqAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Accountancy");
                startActivity(intent);
            }
        });



        binding.tenthPyqAssamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Assamese");
                startActivity(intent);
            }
        });



        binding.tenthPyqArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Arabic");
                startActivity(intent);
            }
        });



        binding.tenthPyqBengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Bengali");
                startActivity(intent);
            }
        });



        binding.tenthPyqBhartiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Bharatya Darshan");
                startActivity(intent);
            }
        });



        binding.tenthPyqBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Business Studies");
                startActivity(intent);
            }
        });



        binding.tenthPyqDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Data Entry Operation");
                startActivity(intent);
            }
        });



        binding.tenthPyqEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Economics");
                startActivity(intent);
            }
        });



        binding.tenthPyqEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_English");
                startActivity(intent);
            }
        });



        binding.tenthPyqEntrepreneurship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Entrepreneurship");
                startActivity(intent);
            }
        });



        binding.tenthPyqGujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Gujarati");
                startActivity(intent);
            }
        });



        binding.tenthPyqHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Hindi");
                startActivity(intent);
            }
        });



        binding.tenthPyqHindustanimusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Hindustani Music");
                startActivity(intent);
            }
        });



        binding.tenthPyqHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Home Science");
                startActivity(intent);
            }
        });



        binding.tenthPyqIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Indian Culture Heritage");
                startActivity(intent);
            }
        });



        binding.tenthPyqKannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Kannada");
                startActivity(intent);
            }
        });



        binding.tenthPyqKarnaticmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Carnatic Music");
                startActivity(intent);
            }
        });



        binding.tenthPyqMalayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Malayalam");
                startActivity(intent);
            }
        });



        binding.tenthPyqMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Mathematics");
                startActivity(intent);
            }
        });



        binding.tenthPyqMarathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Marathi");
                startActivity(intent);
            }
        });



        binding.tenthPyqNepali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Nepali");
                startActivity(intent);
            }
        });



        binding.tenthPyqOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Odia");
                startActivity(intent);
            }
        });



        binding.tenthPyqPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Persian");
                startActivity(intent);
            }
        });



        binding.tenthPyqPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Painting");
                startActivity(intent);
            }
        });



        binding.tenthPyqPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Psychology");
                startActivity(intent);
            }
        });



        binding.tenthPyqPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Panjabi");
                startActivity(intent);
            }
        });



        binding.tenthPyqSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Sanskrit");
                startActivity(intent);
            }
        });



        binding.tenthPyqSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Sanskrit Sahitya");
                startActivity(intent);
            }
        });



        binding.tenthPyqSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Sanskrit Vyakarna");
                startActivity(intent);
            }
        });



        binding.tenthPyqScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Science and Technology");
                startActivity(intent);
            }
        });



        binding.tenthPyqSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Sindhi");
                startActivity(intent);
            }
        });



        binding.tenthPyqSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Social Science");
                startActivity(intent);
            }
        });



        binding.tenthPyqTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Tamil");
                startActivity(intent);
            }
        });



        binding.tenthPyqTelugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Telgue");
                startActivity(intent);
            }
        });



        binding.tenthPyqUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Urdu");
                startActivity(intent);
            }
        });



        binding.tenthPyqVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Question Papers_Veda Adhayayan");
                startActivity(intent);
            }
        });



    }
}