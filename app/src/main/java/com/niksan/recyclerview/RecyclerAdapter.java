package com.niksan.recyclerview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerAdapter extends RecyclerView.Adapter<Viewholder> {

    private List<User> users;
    private Context context;

    public RecyclerAdapter(Context context, List<User> users) {
        this.users = users;
        this.context = context;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                     inflate(R.layout.recycler_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {
        User sampleuser = users.get(position);
        holder.txtName.setText(sampleuser.getUsername());
        holder.txtFamily.setText(sampleuser.getFamily());
        //holder.img.setImageResource(sampleuser.img);
        Glide.with(context).load(sampleuser.getImg()).into(holder.img);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, position+" Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
