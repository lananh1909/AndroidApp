package com.example.listactivity.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listactivity.R;
import com.example.listactivity.model.CustomItemModel;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<CustomItemModel> items;

    public CustomAdapter(Context context, List<CustomItemModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_custom_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageAvatar = convertView.findViewById(R.id.image_avatar);
            viewHolder.textTitile = convertView.findViewById(R.id.text_title);
            viewHolder.textSubtitle = convertView.findViewById(R.id.text_sub_title);
            viewHolder.checkSelected = convertView.findViewById(R.id.check_selected);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        final CustomItemModel itemModel = items.get(position);
        viewHolder.imageAvatar.setImageResource(itemModel.getAvatarResource());
        viewHolder.textTitile.setText(itemModel.getTitle());
        viewHolder.textSubtitle.setText(itemModel.getSubtitle());
        viewHolder.checkSelected.setChecked(itemModel.isSelected());

        viewHolder.checkSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemModel.setSelected(viewHolder.checkSelected.isChecked());
                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    private class ViewHolder {
        ImageView imageAvatar;
        TextView textTitile;
        TextView textSubtitle;
        CheckBox checkSelected;
    }
}
