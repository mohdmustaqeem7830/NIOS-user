package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthUrduMediumSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class tenth_urdu_medium_subject extends AppCompatActivity {
    private ActivityTenthUrduMediumSubjectBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTenthUrduMediumSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        binding.tenthUrduAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Accountancy");
                startActivity(intent);
            }
        });


        binding.tenthUrduAssamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Assamese");
                startActivity(intent);
            }
        });    binding.tenthUrduBengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Bengali");
                startActivity(intent);
            }
        });

        binding.tenthUrduBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Business Studies");
                startActivity(intent);
            }
        });

        binding.tenthUrduDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Data Entry Operation");
                startActivity(intent);
            }
        });    binding.tenthUrduEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Economics");
                startActivity(intent);
            }
        });    binding.tenthUrduEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Urdu");
                startActivity(intent);
            }
        });    binding.tenthUrduEntrepreneurship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Entrepreneurship");
                startActivity(intent);
            }
        });    binding.tenthUrduGujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Gujarati");
                startActivity(intent);
            }
        });    binding.tenthUrduHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Hindi");
                startActivity(intent);
            }
        });    binding.tenthUrduHindustanimusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Hindustani Music");
                startActivity(intent);
            }
        });    binding.tenthUrduHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Home Science");
                startActivity(intent);
            }
        });    binding.tenthUrduIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Indian Culture Heritage");
                startActivity(intent);
            }
        });    binding.tenthUrduKannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Kannada");
                startActivity(intent);
            }
        });    binding.tenthUrduKarnaticmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Carnatic Music");
                startActivity(intent);
            }
        });    binding.tenthUrduMalayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Malayalam");
                startActivity(intent);
            }
        });    binding.tenthUrduMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Mathematics");
                startActivity(intent);
            }
        });    binding.tenthUrduMarathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Marathi");
                startActivity(intent);
            }
        });    binding.tenthUrduNepali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Nepali");
                startActivity(intent);
            }
        });    binding.tenthUrduOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Odia");
                startActivity(intent);
            }
        });    binding.tenthUrduPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Persian");
                startActivity(intent);
            }
        });   binding.tenthUrduPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Painting");
                startActivity(intent);
            }
        });   binding.tenthUrduPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Panjabi");
                startActivity(intent);
            }
        });   binding.tenthUrduSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Sanskrit");
                startActivity(intent);
            }
        });   binding.tenthUrduSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Sanskrit Sahitya");
                startActivity(intent);
            }
        });   binding.tenthUrduSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Sanskrit Vyakarna");
                startActivity(intent);
            }
        });   binding.tenthUrduScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Science and Technology");
                startActivity(intent);
            }
        });   binding.tenthUrduSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Sindhi");
                startActivity(intent);
            }
        });   binding.tenthUrduSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Social Science");
                startActivity(intent);
            }
        });   binding.tenthUrduTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Tamil");
                startActivity(intent);
            }
        });   binding.tenthUrduTelugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Telgue");
                startActivity(intent);
            }
        }); binding.tenthEnlishUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Urdu");
                startActivity(intent);
            }
        }); binding.tenthUrduVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Veda Adhayayan");
                startActivity(intent);
            }
        }); binding.tenthUrduPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Urdu Medium_Psychology");
                startActivity(intent);
            }
        });
    }
}