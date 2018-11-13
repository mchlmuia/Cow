package com.example.muia.firebase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AccounFragment extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<BlogList> Blogs;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.blog, container,false);
        myrecyclerview= (RecyclerView) v.findViewById(R.id.blogrecyclerview);
        BlogRecycerViewAdapter recyclerAdapter = new BlogRecycerViewAdapter(getContext(),Blogs);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Blogs= new ArrayList<>();
        Blogs.add(new BlogList("Mike","(11/11/18)","How to Choose a suitable breed for your cattle","A good breeder or strain is very important in order to get great results" +
                "Cattle breed specification and qualities are crucial for success. Understanding climate conditions neccessary for certain breeds is also of great value" ));
        Blogs.add(new BlogList("Muia","(11/04/18)","Want to grow your own food suppliments","Healthy and enough food is good for maximum reproduction of milk or any other element. Fodder is good as it contains a lot of juices. Examples of suitable fodder include; straw, silage, legumes etc. Hay and " +
                "dry foods but need suppliments such as moluses. " ));
        Blogs.add(new BlogList("Yumbya","(10/11/17)","Pest Control","Pests hugely affect cattle reproduction. Milk production lowers too. Products such as hides and skins are usually rendered useless" +
                "Flies are usually the most common in warmer climates.Such flies include house fly, horn fly and stable fly.Preventive such as use of sprayers, dustbags, back rugs,ear tags abd mineral blocks" ));

        Blogs.add(new BlogList("Nzui","(09/11/18)","Cost of cattle farming","Cattle farming does have some costs that have to be incurred. Such costs include cost of animal feeds, human labour, pest control and disease prevention." +
                "However if properly maintained and fed cattle can have huge benefits and high returns." ));

    }
}
