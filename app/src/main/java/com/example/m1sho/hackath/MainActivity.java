package com.example.m1sho.hackath;

import android.graphics.AvoidXfermode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.m1sho.hackath.States.Adjara;
import com.example.m1sho.hackath.States.Guria;
import com.example.m1sho.hackath.States.Imereti;
import com.example.m1sho.hackath.States.Kaxeti;
import com.example.m1sho.hackath.States.Mcxetamtianeti;
import com.example.m1sho.hackath.States.Qvemoqartli;
import com.example.m1sho.hackath.States.Racha;
import com.example.m1sho.hackath.States.Samegrelo;
import com.example.m1sho.hackath.States.SamtskheJavaxeti;
import com.example.m1sho.hackath.States.Shidaqartli;
import com.example.m1sho.hackath.models.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private JsonObjectRequest jsonObjectRequest;
    private RequestQueue requestQueue;
    private ArrayList<String> states;
    private String region = "";

    private HashMap<String, ArrayList<Models>> hashFoods;
    private ArrayList<Models> listViewData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillRegions();


        // when we already know the region

    }


    private void afterClickOnLocation() {
        hashFoods = new HashMap<>();

        switch (region) {
            case "Samegrelo-Upper Svaneti":
                getSamegrelo();
                break;
            case "Guria":
                getGuria();
                break;
            case "Adjara":
                getAdjara();
                break;
            case "Imereti":
                getImereti();
                break;
            case "Samtskhe-Javakheti":
                getSamtskheJavaxeti();
                break;
            case "Kvemo Kartli":
                getQvemoqartli();
                break;
            case "Mtskheta-Mtianeti":
                getMtskheta();
                break;
            case "Shida Kartli":
                getShidaqartli();
                break;
            case "Racha-Lechkhumi and Lower Svaneti":
                getRachaLech();
                break;
            case "Kakheti":
                getKakheti();
                break;
        }
        listViewData = hashFoods.get(region);
    }

    private void getSamegrelo() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Samegrelo.name.length; i++) {
            Models newFood = new Models(Samegrelo.name[i], Samegrelo.details[i], Samegrelo.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Samegrelo-Upper Svaneti", foodList);
    }

    private void getGuria() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Guria.name.length; i++) {
            Models newFood = new Models(Guria.name[i], Guria.details[i], Guria.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Guria", foodList);
    }

    private void getRachaLech() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Racha.name.length; i++) {
            Models newFood = new Models(Racha.name[i], Racha.details[i], Racha.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Racha-Lechkhumi and Lower Svaneti", foodList);
    }

    private void getImereti() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Imereti.name.length; i++) {
            Models newFood = new Models(Imereti.name[i], Imereti.details[i], Imereti.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Imereti", foodList);
    }


    private void getMtskheta() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Mcxetamtianeti.name.length; i++) {
            Models newFood = new Models(Mcxetamtianeti.name[i], Mcxetamtianeti.details[i], Mcxetamtianeti.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Mtskheta-Mtianeti", foodList);
    }

    private void getAdjara() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Adjara.name.length; i++) {
            Models newFood = new Models(Adjara.name[i], Adjara.details[i], Adjara.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Adjara", foodList);
    }

    private void getKakheti() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Kaxeti.name.length; i++) {
            Models newFood = new Models(Kaxeti.name[i], Kaxeti.details[i], Kaxeti.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Kakheti", foodList);
    }

    private void getShidaqartli() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Shidaqartli.name.length; i++) {
            Models newFood = new Models(Shidaqartli.name[i], Shidaqartli.details[i], Shidaqartli.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Shida Kartli", foodList);
    }

    private void getQvemoqartli() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < Qvemoqartli.name.length; i++) {
            Models newFood = new Models(Qvemoqartli.name[i], Qvemoqartli.details[i], Qvemoqartli.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Kvemo Kartli", foodList);
    }

    private void getSamtskheJavaxeti() {
        ArrayList<Models> foodList = new ArrayList<>();
        for (int i = 0; i < SamtskheJavaxeti.name.length; i++) {
            Models newFood = new Models(SamtskheJavaxeti.name[i], SamtskheJavaxeti.details[i], SamtskheJavaxeti.image[i]);
            foodList.add(newFood);
        }
        hashFoods.put("Samtskhe-Javakheti", foodList);
    }


    private void fillRegions() {
        states = new ArrayList<>();
        states.add("Samegrelo-Upper Svaneti");
        states.add("Guria");
        states.add("Adjara");
        states.add("Imereti");
        states.add("Samtskhe-Javakheti");
        states.add("Kvemo Kartli");
        states.add("Mtskheta-Mtianeti");
        states.add("Shida Kartli");
        states.add("Racha-Lechkhumi and Lower Svaneti");
        states.add("Kakheti");
    }

    public void onClick(View v) {
        GPSTracker mGPS = new GPSTracker(this);
        TextView text = (TextView) findViewById(R.id.textView);
        if (mGPS.canGetLocation) {
            mGPS.getLocation();
            // text.setText("Lat : " + mGPS.getLatitude() + "Lon : " + mGPS.getLongitude());
            String url = getLocationURL(mGPS.latitude, mGPS.getLongitude());
            getState(url);
        } else {
            text.setText("Unabletofind");
        }
    }


    private String getLocationURL(double latitude, double longtitude) {
        String url = "http://maps.googleapis.com/maps/api/geocode/json?latlng=" +
                latitude + "," + longtitude + "&sensor=true";
        return url;
    }

    private void getState(String url) {
        if (requestQueue == null) {
            requestQueue = new Volley().newRequestQueue(getApplicationContext());
        }
        jsonObjectRequest = new JsonObjectRequest(url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                try {
                    JSONArray query = jsonObject.getJSONArray("results");
                    for (int i = 0; i < query.length(); i++) {
                        JSONObject cur = query.getJSONObject(i);
                        JSONArray addressJsonArray = cur.getJSONArray("address_components");
                        for (int j = 0; j < addressJsonArray.length(); j++) {
                            JSONObject addJSONObject = addressJsonArray.getJSONObject(j);
                            String longName = addJSONObject.getString("long_name");
                            if (states.contains(longName)) {
                                region = longName;
                                int duration = Toast.LENGTH_SHORT;
                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "Your Location : \n" + "\n" + region, duration);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView message = (TextView) group.getChildAt(0);
                                message.setTextSize(36);
                                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 150);
                                toast.show();

                                afterClickOnLocation();
                                break;
                            }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        volleyError.getCause();
                    }
                });

        requestQueue.add(jsonObjectRequest);
    }
}
