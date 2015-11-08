package com.example.m1sho.hackath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.m1sho.hackath.models.Models;

public class DetailItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        Models model = (Models) getIntent().getSerializableExtra("model");
       // System.out.println(model.toString());


    }
}
