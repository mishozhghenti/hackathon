package com.example.m1sho.hackath;

import android.content.Intent;
import android.graphics.AvoidXfermode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.m1sho.hackath.adapter.Adapter;
import com.example.m1sho.hackath.models.Models;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Adapter newAdapter= new Adapter(this,MainActivity.listViewData);

       ArrayList<Models> res= (ArrayList<Models>) getIntent().getExtras().getSerializable("datas");

        Adapter newAdapter= new Adapter(this,res);
        ListView listView= (ListView) findViewById(R.id.listView);
        listView.setAdapter(newAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Models model = (Models) parent.getAdapter().getItem(position);

                Intent intent = new Intent(ListViewActivity.this,DetailItemActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);

            }
        });








    }
}
