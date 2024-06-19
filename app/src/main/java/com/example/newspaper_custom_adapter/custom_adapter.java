package com.example.newspaper_custom_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_adapter extends BaseAdapter {

    public custom_adapter(Integer[] images, String[] title, String[] description, Activity context)
    {
        this.images = images;
        this.title = title;
        this.description = description;
        this.context = context;
    }

    private final Integer [] images;
    private final String[] title;
    private final String[] description;
    private final Activity context;

    @Override
    public int getCount() {

        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =context.getLayoutInflater();
        View rowview =inflater.inflate(R.layout.custom_layout,null,true);

        ImageView flag=rowview.findViewById(R.id.imageViewID);
        TextView title1=rowview.findViewById(R.id.TitleID);
        TextView description1=rowview.findViewById(R.id.descriptionID);


        flag.setImageResource(images[position]);
        title1.setText(title[position]);
        description1.setText(description[position]);

        return rowview;
    }
}
