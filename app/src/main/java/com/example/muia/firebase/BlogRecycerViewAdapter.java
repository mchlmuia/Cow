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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class BlogRecycerViewAdapter extends RecyclerView.Adapter<BlogRecycerViewAdapter.MyViewHolder> {
    Context mmContext;
    List<BlogList> mmData;
    Dialog myDialog;
    private FirebaseFirestore dbb = FirebaseFirestore.getInstance();


    public BlogRecycerViewAdapter(Context mmContext, List<BlogList> mmData) {
        this.mmContext = mmContext;
        this.mmData = mmData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mmContext).inflate(R.layout.card,viewGroup,false);
        final MyViewHolder vHolder =new MyViewHolder(v);

        //Dialog Initialization

        myDialog  = new Dialog(mmContext);
        myDialog.setContentView(R.layout.dialog_blog);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        vHolder.item_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialogg_name_tv= (TextView) myDialog.findViewById(R.id.dialogname);
                TextView dialogg_phone_tv =(TextView) myDialog.findViewById(R.id.dialogtime);
                TextView dialogg_contact_img = (TextView) myDialog.findViewById(R.id.dialogtitle);
                TextView dialogg_contact = (TextView) myDialog.findViewById(R.id.dialogpost);
                dialogg_name_tv.setText(mmData.get(vHolder.getAdapterPosition()).getUsername());
                dialogg_phone_tv.setText(mmData.get(vHolder.getAdapterPosition()).getTimestamp());
                dialogg_contact_img.setText(mmData.get(vHolder.getAdapterPosition()).getTitle());
                dialogg_contact.setText(mmData.get(vHolder.getAdapterPosition()).getDescription());
                myDialog.show();
            }
        });
        return vHolder;


        }

    @Override
    public void onBindViewHolder(@NonNull BlogRecycerViewAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.tvv_username.setText(mmData.get(i).getUsername());
        myViewHolder.tvv_timestamp.setText(mmData.get(i).getTimestamp());
        myViewHolder.tvv_title.setText(mmData.get(i).getTitle());
        myViewHolder.tvv_post.setText(mmData.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return  mmData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_contacts;
        private TextView tvv_username;
        private TextView tvv_timestamp;
        private TextView tvv_title;
        private TextView tvv_post;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contacts= (LinearLayout)itemView.findViewById(R.id.linearLayout44);

            tvv_username = (TextView) itemView.findViewById(R.id.usernames);
            tvv_timestamp = (TextView) itemView.findViewById(R.id.timestamps);
            tvv_title = (TextView) itemView.findViewById(R.id.titles);
            tvv_post = (TextView) itemView.findViewById(R.id.descriptions);
        }
    }
}

