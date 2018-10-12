package com.example.xyzreader.adapter;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class BodyTextAdapter extends RecyclerView.Adapter<BodyTextAdapter.BodyTextViewHolder> {

    private String[] strings;

    public BodyTextAdapter(String[] lines) {
        strings = lines;
    }


    @NonNull
    @Override
    public BodyTextViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.body_text_line, viewGroup, false);
        return new BodyTextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BodyTextViewHolder bodyTextViewHolder, int i) {
        bodyTextViewHolder.bodyTextLine.setText(strings[i]);
    }

    @Override
    public int getItemCount() {
        return strings == null ? 0 : strings.length;
    }

    class BodyTextViewHolder extends RecyclerView.ViewHolder {
        TextView bodyTextLine;

        BodyTextViewHolder(@NonNull View itemView) {
            super(itemView);
            bodyTextLine = itemView.findViewById(R.id.article_body);
            bodyTextLine.setTypeface(Typeface.createFromAsset(itemView.getContext().getResources().getAssets(), "Rosario-Regular.ttf"));
        }
    }
}
