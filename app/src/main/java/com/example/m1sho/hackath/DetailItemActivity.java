package com.example.m1sho.hackath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.m1sho.hackath.models.Models;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class DetailItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        Models model = (Models) getIntent().getSerializableExtra("model");
       // System.out.println(model.toString());
        ImageView imageView= (ImageView) findViewById(R.id.image);
        TextView name= (TextView) findViewById(R.id.name);
        TextView description= (TextView) findViewById(R.id.description);

        name.setText(model.getName());
        description.setText(model.getDescription());

        Picasso.with(this)
                .load(model.getImage())
                .resize(400, 400)
                .centerCrop()
                .into(imageView);
    }
}
