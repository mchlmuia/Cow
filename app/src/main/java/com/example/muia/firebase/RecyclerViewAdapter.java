package com.example.muia.firebase;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<CowBreed> mData;
    Dialog myDialogg;

    public RecyclerViewAdapter(Context mContext, List<CowBreed> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_cowbreeds,parent,false);
        final MyViewHolder vHolder =new MyViewHolder(v);

        //Dialog Initialization

        myDialogg  = new Dialog(mContext);
        myDialogg.setContentView(R.layout.dialog_contact);
        myDialogg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv= (TextView) myDialogg.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv =(TextView) myDialogg.findViewById(R.id.dialog_cow_id);
                ImageView dialog_contact_img = (ImageView) myDialogg.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(vHolder.getAdapterPosition()).getIndetification());
                dialog_contact_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                myDialogg.show();
            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_identification.setText(mData.get(position).getIndetification());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_identification;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact= (LinearLayout)itemView.findViewById(R.id.contact_item_id);

            tv_name = (TextView) itemView.findViewById(R.id.cow_breed);
            tv_identification= (TextView) itemView.findViewById(R.id.cow_id);
            img = (ImageView) itemView.findViewById(R.id.img_cowbreed);
        }
    }

}
