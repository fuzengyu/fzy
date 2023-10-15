package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class recycleviewActivity extends AppCompatActivity {
    private View view;
    private Myadapter myadapter;
    private RecyclerView recyclerView;
    private List<String> list1;
    protected RecyclerView onCreate(LayoutInflater inflater, ViewGroup container,
                                    Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_recycleview, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        list1 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list1.add("这是第" + i + "行数据");
        }
        myadapter = new Myadapter(view.getContext(), list1);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myadapter);
        return null;


    }
}