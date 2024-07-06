package com.Hamza.niosgeniusbookshub.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.Categories.Categories_hindi_english;
import com.Hamza.niosgeniusbookshub.Categories.tenth_categories;
import com.Hamza.niosgeniusbookshub.Categories.twelthcategories;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.ViewPdf;
import com.Hamza.niosgeniusbookshub.study_material;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class HomeFragments extends Fragment {
    CardView tenth,twelth,diplomahindi,diplomaenglish,vocational,notification;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_fragments, container, false);
        tenth = view.findViewById(R.id.tenth);
        twelth = view.findViewById(R.id.twelth);
        diplomaenglish = view.findViewById(R.id.diplomaenglish);
        diplomahindi = view.findViewById(R.id.diplomahindi);
        vocational = view.findViewById(R.id.vocational);
        notification = view.findViewById(R.id.notification);


        tenth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(requireContext(), tenth_categories.class));
            }
        });
        twelth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), twelthcategories.class));
            }
        });

        diplomahindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), study_material.class);
                intent.putExtra("key","DIPLOMA_HINDI Not Required_Not Required");
                startActivity(intent);
            }
        });


                diplomaenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), study_material.class);
                intent.putExtra("key","DIPLOMA_ENGLISH Not Required_Not Required");
                startActivity(intent);
            }
        });

                vocational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(requireContext(), Categories_hindi_english.class);
                intent.putExtra("key","VOCATIONAL ");
                startActivity(intent);
            }
        });


     notification.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(requireContext(), study_material.class);
             intent.putExtra("key","NOTIFICATION Not Required_Not Required");
             startActivity(intent);
         }
     });
        return view;
    }

}