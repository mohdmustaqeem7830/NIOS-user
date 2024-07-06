package com.Hamza.niosgeniusbookshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.Hamza.niosgeniusbookshub.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class study_material extends AppCompatActivity {
    DatabaseReference databaseReference;
    List<PdfModal> pdfList;
    PdfAdapter pdfAdapter;
    private  static String standard="";
    private  static String category="";
    ProgressDialog progressDialog;
    private DatabaseReference pref;
    Query query;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.bluecolor));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent = getIntent();
        String key = intent.getStringExtra("key");
        separatedstandardcategory(key);
        //Toast.makeText(this, category, Toast.LENGTH_SHORT).show();
        pdfList = new ArrayList<>();
        displaypdf(standard,category);
    }
    public void displaypdf(String standard,String category){
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Uploading...");
        progressDialog.show();
        pdfList.clear();
        pref = FirebaseDatabase.getInstance().getReference().child(standard);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        query = pref.orderByChild("category").equalTo(category);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    progressDialog.dismiss();
                    pdfList.clear();
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                        PdfModal pdf = dataSnapshot.getValue(PdfModal.class);
                        pdfList.add(pdf);
                    }
                  //  Toast.makeText(study_material.this, "All uploaded", Toast.LENGTH_SHORT).show();

                    // Pass pdfList to PdfAdapter
                     pdfAdapter = new PdfAdapter(study_material.this,pdfList);
                    recyclerView.setAdapter(pdfAdapter);
                }
                else{
                    progressDialog.dismiss();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                     progressDialog.dismiss();
                Toast.makeText(study_material.this, "Not loaded pdf", Toast.LENGTH_SHORT).show();
            }
        });
    }
  public void separatedstandardcategory(String key){
      // Find the index of the first blank space
      int firstSpaceIndex = key.indexOf(' ');

      if (firstSpaceIndex != -1) {
          // Extract the standard name (substring before the first space)
          standard = key.substring(0, firstSpaceIndex);

          // Extract the category name (substring after the first space)
          category = key.substring(firstSpaceIndex + 1);
      }
   }
}