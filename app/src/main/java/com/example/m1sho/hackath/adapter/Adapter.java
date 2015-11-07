package com.example.m1sho.hackath.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.m1sho.hackath.R;
import com.example.m1sho.hackath.models.Models;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by GeoLab on 11/7/2015.
 */
public class Adapter extends BaseAdapter{
    private ArrayList<Models> models;
    private Context context;

    public Adapter(Context context, ArrayList<Models> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        Viewholder holder = null;
        Models model = (Models) getItem(position);
        if (convertView == null) {
            itemView = View.inflate(context, R.layout.activity_list_view, null);

            ImageView image = (ImageView) itemView.findViewById(R.id.baseimage);
            TextView name = (TextView) itemView.findViewById(R.id.name);


            holder = new Viewholder();
            holder.image = image;
            holder.name = name;

            itemView.setTag(holder);

        } else {
            itemView = convertView;
            holder = (Viewholder) itemView.getTag();
        }




        holder.name.setText(model.getName());

        Picasso.with(context)
                .load(model.getImage())
                .resize(100, 100)
                .centerCrop()
                .into(holder.image);
        return itemView;
    }

    private class Viewholder {
        ImageView image;
        TextView name;

    }
}
