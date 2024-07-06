package com.Hamza.niosgeniusbookshub.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.databinding.ActivityTenthHindiMediumSubjectBinding;
import com.Hamza.niosgeniusbookshub.study_material;

public class tenth_hindi_medium_subject extends AppCompatActivity {
    private ActivityTenthHindiMediumSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTenthHindiMediumSubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = this.getWindow();

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding.tenthHindiAcountacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Accountancy");
                startActivity(intent);
            }
        });

        binding.tenthHindiBussinessStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Business Studies");
                startActivity(intent);
            }
        });

        binding.tenthHindiEconomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Economics");
                startActivity(intent);
            }
        }); binding.tenthHindiDataentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Data Entry Operation");
                startActivity(intent);
            }
        });

        binding.tenthHindiHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Hindi");
                startActivity(intent);
            }
        });

        binding.tenthHindiHomeScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Home Science");
                startActivity(intent);
            }
        });

        binding.tenthHindiIndiancultureheritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Indian Culture Heritage");
                startActivity(intent);
            }
        });

        binding.tenthHindiMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Mathematics");
                startActivity(intent);
            }
        });

        binding.tenthHindiPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Painting");
                startActivity(intent);
            }
        });

        binding.tenthHindiPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Psychology");
                startActivity(intent);
            }
        });

        binding.tenthHindiScienceandtechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Science and Technology");
                startActivity(intent);
            }
        });

        binding.tenthHindiSocialscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), study_material.class);
                intent.putExtra("key","X Hindi Medium_Social Science");
                startActivity(intent);
            }
        });




    }
}