package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.listactivity.adpter.LeftRightAdapter;
import com.example.listactivity.model.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class LeftRightListActivity extends AppCompatActivity {

    List<MessageModel> message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_right_list);

        message = new ArrayList<>();
        message.add(new MessageModel(R.drawable.img1, "LanAnh", "Hello"));
        message.add(new MessageModel(R.drawable.img2, "me", "Hi Lan Anh"));
        message.add(new MessageModel(R.drawable.img1, "LanAnh", "How are you?"));
        message.add(new MessageModel(R.drawable.img2, "me", "I'm fine, thanks!"));

        LeftRightAdapter adapter = new LeftRightAdapter(message, this);

        ListView listView = findViewById(R.id.left_right_list);
        listView.setAdapter(adapter);
    }
}