package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.listactivity.adpter.ImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class GridImageActivity extends AppCompatActivity {

    List<Integer> thumbnails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_image);

        thumbnails = new ArrayList<>();
        thumbnails.add(R.drawable.img1);
        thumbnails.add(R.drawable.img2);
        thumbnails.add(R.drawable.img3);
        thumbnails.add(R.drawable.img4);
        thumbnails.add(R.drawable.img5);
        thumbnails.add(R.drawable.img6);
        thumbnails.add(R.drawable.img7);
        thumbnails.add(R.drawable.img8);
        thumbnails.add(R.drawable.img9);
        thumbnails.add(R.drawable.img10);

        ImageAdapter adapter = new ImageAdapter(this, thumbnails);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}