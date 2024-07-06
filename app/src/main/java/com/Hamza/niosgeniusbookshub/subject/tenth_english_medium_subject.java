package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthEnglishMediumSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;
import com.Hamza.niosgeniusbookshub.R;

public class tenth_english_medium_subject extends AppCompatActivity {
    private ActivityTenthEnglishMediumSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTenthEnglishMediumSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        binding.tenthEnglishAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Accountancy");
                startActivity(intent);
            }
        });


        binding.tenthEnglishAssamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Assamese");
                startActivity(intent);
            }
        });    binding.tenthEnglishBengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Bengali");
                startActivity(intent);
            }
        });

        binding.tenthEnglishBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Business Studies");
                startActivity(intent);
            }
        });

        binding.tenthEnglishDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Data Entry Operation");
                startActivity(intent);
            }
        });    binding.tenthEnglishEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Economics");
                startActivity(intent);
            }
        });    binding.tenthEnglishEnglih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_English");
                startActivity(intent);
            }
        });    binding.tenthEnglishEntrepreneurship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Entrepreneurship");
                startActivity(intent);
            }
        });    binding.tenthEnglishGujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Gujarati");
                startActivity(intent);
            }
        });    binding.tenthEnglishHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Hindi");
                startActivity(intent);
            }
        });    binding.tenthEnglishHindustanimusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Hindustani Music");
                startActivity(intent);
            }
        });    binding.tenthEnglishHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Home Science");
                startActivity(intent);
            }
        });    binding.tenthEnglishIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Indian Culture Heritage");
                startActivity(intent);
            }
        });    binding.tenthEnglishKannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Kannada");
                startActivity(intent);
            }
        });    binding.tenthEnglishKarnaticmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Carnatic Music");
                startActivity(intent);
            }
        });    binding.tenthEnglishMalayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Malayalam");
                startActivity(intent);
            }
        });    binding.tenthEnglishMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Mathematics");
                startActivity(intent);
            }
        });    binding.tenthEnglishMarathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Marathi");
                startActivity(intent);
            }
        });    binding.tenthEnglishNepali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Nepali");
                startActivity(intent);
            }
        });    binding.tenthEnglishOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Odia");
                startActivity(intent);
            }
        });    binding.tenthEnglishPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Persian");
                startActivity(intent);
            }
        });   binding.tenthEnglishPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Painting");
                startActivity(intent);
            }
        });   binding.tenthEnglishPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Panjabi");
                startActivity(intent);
            }
        });   binding.tenthEnglishSanskrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Sanskrit");
                startActivity(intent);
            }
        });   binding.tenthEnglishSanskritsahithya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Sanskrit Sahitya");
                startActivity(intent);
            }
        });   binding.tenthEnglishSanskritvyakarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Sanskrit Vyakarna");
                startActivity(intent);
            }
        });   binding.tenthEnglishScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Science and Technology");
                startActivity(intent);
            }
        });   binding.tenthEnglishSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Sindhi");
                startActivity(intent);
            }
        });   binding.tenthEnglishSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Social Science");
                startActivity(intent);
            }
        });   binding.tenthEnglishTamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Tamil");
                startActivity(intent);
            }
        });   binding.tenthEnglishTelugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Telgue");
                startActivity(intent);
            }
        }); binding.tenthEnlishUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Urdu");
                startActivity(intent);
            }
        }); binding.tenthEnglishVedaadhayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Veda Adhayayan");
                startActivity(intent);
            }
        }); binding.tenthEnglishPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X English Medium_Psychology");
                startActivity(intent);
            }
        });
    }
}