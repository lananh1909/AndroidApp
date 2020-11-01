package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;
    ListView list;
    ArrayAdapter<String> adapter;
    Button update, remove, insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        for(int i = 0; i<20; i++) {
            items.add("Item " + i);
        }

//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        adapter = new ArrayAdapter<>(this, R.layout.item_layout, R.id.text_view, items);
        list = findViewById(R.id.my_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("TAG", items.get(position));
            }
        });

        update = findViewById(R.id.btn_update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = items.get(0);
                item = "Update item 0";
                items.set(0, item);
                adapter.notifyDataSetChanged();
            }
        });

        remove = findViewById(R.id.btn_remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.remove(15);
                adapter.notifyDataSetChanged();
            }
        });

        insert = findViewById(R.id.btn_insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add("Lan Anh");
                items.add("ChanYeol");
                items.add("Sehun");
                adapter.notifyDataSetChanged();
            }
        });
    }
}