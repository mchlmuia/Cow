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

public class CowBreedsFrag extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<CowBreed> lstCowbreed;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.cowbreeds, container,false);
        myrecyclerview= (RecyclerView) v.findViewById(R.id.cowbreeds_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstCowbreed);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCowbreed= new ArrayList<>();
        lstCowbreed.add(new CowBreed("Fresian","(0703589623)",R.drawable.a));
        lstCowbreed.add(new CowBreed("Boran Bull","(0723380922)",R.drawable.b));
        lstCowbreed.add(new CowBreed("Masai Bull","(0703589623)",R.drawable.c));
        lstCowbreed.add(new CowBreed("Fresian","(0703589623)",R.drawable.d));
        lstCowbreed.add(new CowBreed("Fresian Calf","(0703589623)",R.drawable.e));
        lstCowbreed.add(new CowBreed("Fresian","(0703589623)",R.drawable.f));
        lstCowbreed.add(new CowBreed("Fresian","(0703589623)",R.drawable.g));
    }
}
