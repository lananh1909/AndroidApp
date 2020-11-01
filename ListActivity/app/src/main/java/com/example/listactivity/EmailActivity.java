package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listactivity.adpter.EmailAdapter;
import com.example.listactivity.model.EmailItem;

import java.util.ArrayList;
import java.util.List;

public class EmailActivity extends AppCompatActivity {

    List<EmailItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        items = new ArrayList<>();
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Instagram", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));
        items.add(new EmailItem("Facebook", "Bạn đã nhận được tin nhắn mới từ Nguyễn Lan Anh, nhấn vào để xem nội dung! ", "15:05 PM"));

        EmailAdapter adapter = new EmailAdapter(items, this);

        ListView emailListView = findViewById(R.id.email_list_view);
        emailListView.setAdapter(adapter);
    }
}