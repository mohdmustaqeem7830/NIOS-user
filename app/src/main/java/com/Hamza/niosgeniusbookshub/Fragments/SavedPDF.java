package com.Hamza.niosgeniusbookshub.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.PdfAdapter;
import com.Hamza.niosgeniusbookshub.PdfModal;
import com.Hamza.niosgeniusbookshub.R;
import com.Hamza.niosgeniusbookshub.SavedPdfAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SavedPDF extends Fragment {
    private RecyclerView recyclerView;
    private SavedPdfAdapter savedPdfAdapter;
    private List<PdfModal> savedPdfList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saved_p_d, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);
        savedPdfList = getSavedPdfList(); // Implement this method to get the list of saved PDFs
        savedPdfAdapter = new SavedPdfAdapter(getContext(), savedPdfList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(savedPdfAdapter);



        return view ;
    }
    private List<PdfModal> getSavedPdfList() {
        List<PdfModal> savedList = new ArrayList<>();

        // Replace "pdfs" with your actual directory name
        File directory = new File(getContext().getFilesDir(), "pdfs");

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    // Create PdfModal objects and add them to the list
                    PdfModal pdfModal = new PdfModal();
                    pdfModal.setName(file.getName());
                    pdfModal.setUrl(file.getAbsolutePath());
                    savedList.add(pdfModal);

                }
            }
        }

        return savedList;
    }

}