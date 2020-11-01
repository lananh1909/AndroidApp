package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.listactivity.model.ImageItemModel;

import java.util.ArrayList;
import java.util.List;

public class HorizontalScrollView extends AppCompatActivity {

    List<ImageItemModel> items;
    ImageView largeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scroll_view);
        items = new ArrayList<ImageItemModel>();
        items.add(new ImageItemModel("Item 0", R.drawable.img1, R.drawable.img1));
        items.add(new ImageItemModel("Item 1", R.drawable.img2, R.drawable.img2));
        items.add(new ImageItemModel("Item 2", R.drawable.img3, R.drawable.img3));
        items.add(new ImageItemModel("Item 3", R.drawable.img4, R.drawable.img4));
        items.add(new ImageItemModel("Item 4", R.drawable.img5, R.drawable.img5));
        items.add(new ImageItemModel("Item 5", R.drawable.img6, R.drawable.img6));
        items.add(new ImageItemModel("Item 6", R.drawable.img7, R.drawable.img7));
        items.add(new ImageItemModel("Item 7", R.drawable.img8, R.drawable.img8));
        items.add(new ImageItemModel("Item 8", R.drawable.img9, R.drawable.img9));
        items.add(new ImageItemModel("Item 9", R.drawable.img10, R.drawable.img10));

        largeImage = findViewById(R.id.large_image_view);

        LinearLayout layoutContent = findViewById(R.id.layout_content);
        for (int i=0; i<items.size(); i++){
            View view = LayoutInflater.from(this).inflate(R.layout.activity_image_view, layoutContent, false);
            view.setId(i);
            TextView caption = view.findViewById(R.id.caption);
            ImageView imageThumbnail = view.findViewById(R.id.image_item);

            caption.setText(items.get(i).getCaption());
            imageThumbnail.setImageResource(items.get(i).getThumbnailResource());
            layoutContent.addView(view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = v.getId();
                    largeImage.setImageResource(items.get(id).getImageResource());
                }
            });
        }
    }
}