package com.niksan.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Viewholder extends RecyclerView.ViewHolder {

    public ImageView img;
    public TextView txtName;
    public TextView txtFamily;
    public LinearLayout linearLayout;

    public Viewholder(View itemView) {
        super(itemView);
        img = (ImageView) itemView.findViewById(R.id.img);
        txtName =(TextView) itemView.findViewById(R.id.txtName);
        txtFamily = (TextView) itemView.findViewById(R.id.txtFamily);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.item);
    }

}
