package com.example.arielperezmartinez.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewEjemplo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
        ListView listView = (ListView)findViewById(R.id.list_Component);

                List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(Integer.toString(i + 1));
        }
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.layout_text));
    }
}
