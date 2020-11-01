package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listactivity.adpter.CustomAdapter;
import com.example.listactivity.model.CustomItemModel;

import java.util.ArrayList;
import java.util.List;

public class CustomList extends AppCompatActivity {

    List<CustomItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        items = new ArrayList<>();
        items.add(new CustomItemModel(R.drawable.img1, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img2, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img3, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img4, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img5, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img6, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img7, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img8, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img9, "Title 1", "Subtitle 1"));
        items.add(new CustomItemModel(R.drawable.img10, "Title 1", "Subtitle 1"));

        CustomAdapter adapter = new CustomAdapter(this, items);

        ListView listView = findViewById(R.id.custom_list);
        listView.setAdapter(adapter);

    }
}