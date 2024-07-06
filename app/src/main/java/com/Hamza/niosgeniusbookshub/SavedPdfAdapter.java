package com.Hamza.niosgeniusbookshub;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.Hamza.niosgeniusbookshub.PdfModal;
import com.Hamza.niosgeniusbookshub.R;

import java.io.File;
import java.util.List;

public class SavedPdfAdapter extends RecyclerView.Adapter<SavedPdfAdapter.SavedPdfViewHolder> {
    private List<PdfModal> savedPdfList;
    private Context context;

    public SavedPdfAdapter(Context context, List<PdfModal> savedPdfList) {
        this.context = context;
        this.savedPdfList = savedPdfList;
    }

    @NonNull
    @Override
    public SavedPdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pdf_item, parent, false);
        return new SavedPdfViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SavedPdfViewHolder holder, @SuppressLint("RecyclerView") int position) {
        PdfModal savedPdf = savedPdfList.get(savedPdfList.size() - 1 - position);

        holder.nameTextView.setText(savedPdf.getName());
        holder.save.setText("Delete PDF");

        holder.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileToDelete = new File(savedPdf.getUrl());
                if (fileToDelete.exists()) {
                    boolean isDeleted = fileToDelete.delete();
                    if (isDeleted) {
                        // Remove the item from the list and notify the adapter
                        savedPdfList.remove(position);
                        notifyItemRemoved(position);
                        notifyItemRangeChanged(position, savedPdfList.size());
                        Toast.makeText(context, "PDF Deleted", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(context, "Unable to delete PDF", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewPdf.class);
                intent.putExtra("url",savedPdf.getUrl());
                holder.itemView.getContext().startActivity(intent);
            }
        });
        // Add other fields as needed
    }

    @Override
    public int getItemCount() {
        return savedPdfList.size();
    }

    public static class SavedPdfViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        Button view ,save;

        public SavedPdfViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.pdfFileName);
            view = itemView.findViewById(R.id.view);
            save = itemView.findViewById(R.id.save);
            // Initialize other TextViews
        }
    }
    private void deletePdf(PdfModal pdf, int position) {
        File fileToDelete = new File(pdf.getUrl());
        if (fileToDelete.exists()) {
            boolean isDeleted = fileToDelete.delete();
            if (isDeleted) {
                // Remove the item from the list and notify the adapter
                savedPdfList.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, savedPdfList.size());
                Toast.makeText(context, "PDF Deleted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Unable to delete PDF", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
