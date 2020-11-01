package com.example.listactivity.adpter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    Context context;
    List<Integer> thumbnails;
    int imageSize;

    public ImageAdapter(Context context, List<Integer> thumbnails) {
        this.context = context;
        this.thumbnails = thumbnails;

        //Lay kich thuoc man hinh thiet bi
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(metrics);
        this.imageSize = metrics.widthPixels / 3;
    }

    @Override
    public int getCount() {
        return thumbnails.size();
    }

    @Override
    public Object getItem(int position) {
        return thumbnails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(imageSize, imageSize));
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(thumbnails.get(position));
        return imageView;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Integer> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<Integer> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }
}
