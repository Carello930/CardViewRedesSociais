package com.leaoartes.cardviewredessociais.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.cardviewredessociais.R;
import com.leaoartes.cardviewredessociais.main.model.PostListClass;

import java.util.List;

public class AdapterSocialMedia extends RecyclerView.Adapter<AdapterSocialMedia.MyViewHolder> {

    private List<PostListClass> postListClassList;
    public AdapterSocialMedia(List<PostListClass> postListClassListAdapter) {
        this.postListClassList = postListClassListAdapter;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View listItems = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_detail, parent, false);

        return new MyViewHolder(listItems);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        PostListClass postBindViewHolder = postListClassList.get(position);
        holder.imageViewPost.setImageResource(postBindViewHolder.getImagePostView());
        holder.textViewPost.setText(postBindViewHolder.getTextViewPostTitle());
        holder.textViewDescription.setText(postBindViewHolder.getTextViewDescription());
    }

    @Override
    public int getItemCount() {

        return postListClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewPost, textViewDescription;
        private ImageView imageViewPost;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewPost = itemView.findViewById(R.id.textViewPostTitle);
            imageViewPost = itemView.findViewById(R.id.imageViewPost);

        }
    }
}
