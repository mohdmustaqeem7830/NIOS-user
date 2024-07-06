package com.Hamza.niosgeniusbookshub.Fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.Hamza.niosgeniusbookshub.R;


public class privacyFragment extends Fragment {
    TextView google_service_api, firebase_crashlytics, firebase, admob;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_privacy, container, false);
        google_service_api = view.findViewById(R.id.google_service_api);
        firebase_crashlytics = view.findViewById(R.id.firebase_crashlytics);
        admob = view.findViewById(R.id.admob);
        firebase = view.findViewById(R.id.firebase);


        google_service_api.setOnClickListener(v -> setMovementMethod(google_service_api));
        firebase_crashlytics.setOnClickListener(v -> setMovementMethod(firebase_crashlytics));
        admob.setOnClickListener(v -> setMovementMethod(admob));
        firebase.setOnClickListener(v -> setMovementMethod(firebase));


        return view;
    }

    private void setMovementMethod(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}