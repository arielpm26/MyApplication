package com.example.arielperezmartinez.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid_view);

        GridView gridView = (GridView)findViewById(R.id.gridView);

        List<String> list = new ArrayList<>();
        for (int i = 0;i<100;i++){
            list.add(Integer.toString(i + 1));
        }
        gridView.setAdapter(new ArrayAdapter<>(this,R.layout.layout_text,list));
    }
}