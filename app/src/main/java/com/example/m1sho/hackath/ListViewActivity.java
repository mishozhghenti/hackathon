package com.example.m1sho.hackath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.m1sho.hackath.models.Models;

public class ListViewActivity extends AppCompatActivity {

    ArrayList<Models> model = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
/*

        for (int i = 0; i < Samegrelo.name.length; i++) {
            Models newmodel = new Models (Samegrelo.image[i],Samegrelo.name[i],Samegrelo.details[i]);
            model.add(newmodel);
        }

        ListView listView = (ListView) findViewById(R.id.listView);

        Adapter adapter = new Adapter(this,model);
        listView.setAdapter(adapter);
*/

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Intent intent = new Intent(
//                        MainActivity.this,
//                        Detail.class);
//
//                intent.putExtra("aa",model.get(position));
//                startActivity(intent);
//            }
//        });
//
//
//    }
    }
}
