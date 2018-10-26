package com.example.muia.firebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<CowBreed> mData;

    public RecyclerViewAdapter(Context mContext, List<CowBreed> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_cowbreeds,parent,false);
        MyViewHolder vHolder =new MyViewHolder(v);
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

        private TextView tv_name;
        private TextView tv_identification;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.cow_breed);
            tv_identification= (TextView) itemView.findViewById(R.id.cow_id);
            img = (ImageView) itemView.findViewById(R.id.img_cowbreed);
        }
    }

}
