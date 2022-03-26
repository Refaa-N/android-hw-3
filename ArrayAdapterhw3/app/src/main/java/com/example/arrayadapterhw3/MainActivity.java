package com.example.arrayadapterhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<museum> museums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        museum m1 = new museum("national museum", R.drawable.museum1);
        museum m2 = new museum("police museum", R.drawable.museum2);
        museum m3 = new museum("mirror museum",R.drawable.museum3);

        museums.add(m1);
        museums.add(m2);
        museums.add(m3);

        museumAdapter MuseumAdapter = new museumAdapter(this,0,museums);
        ListView listView = findViewById(R.id.viewlist);
        listView.setAdapter(MuseumAdapter);




    }
}