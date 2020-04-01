package com.leaoartes.cardviewredessociais.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.cardviewredessociais.R;

public class AdapterSocialMedia extends RecyclerView.Adapter<AdapterSocialMedia.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View listItems = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_detail, parent, false);

        return new MyViewHolder(listItems);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageViewPost.setImageResource(R.drawable.programando);
        holder.textViewPost.setText("Estudar / Programar");
        holder.textViewDescription.setText("Acordei bem cedo para estudar e programar, afinal todo esforço será recompensado! #boralutar");
    }

    @Override
    public int getItemCount() {


        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewPost, textViewDescription;
        private ImageView imageViewPost;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewPost = itemView.findViewById(R.id.textViewPost);
            imageViewPost = itemView.findViewById(R.id.imageViewPost);

        }
    }
}
