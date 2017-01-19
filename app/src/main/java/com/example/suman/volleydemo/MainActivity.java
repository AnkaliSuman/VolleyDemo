package com.example.suman.volleydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.suman.volleydemo.Network.CustomJSONObjectRequest;
import com.example.suman.volleydemo.Network.MySingleton;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callServer();
    }


    public void callServer(){

        JSONObject jsonBody = new JSONObject();
        try {
            jsonBody.put("mobile_number", "9513127908");
            jsonBody.put("password", "359743");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        final String mRequestBody = jsonBody.toString();
        Log.d("TAG","Json Request: "+mRequestBody);

        String url = "http://ifixonzf3swqfg6j.devcloud.acquia-sites.com/api?method=custom_login";
        final CustomJSONObjectRequest jsonRequest = new CustomJSONObjectRequest(Request.Method
                .POST, url,
                new JSONObject(), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                Log.d("TAG","Response: "+response.toString());

                try {
                    String status = response.getString("status");
                    if (status.equals("1")) {
                        startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TAG","Response: "+error.toString());

            }
        }, mRequestBody);

         MySingleton.getInstance(this.getApplicationContext())
                .getRequestQueue().add(jsonRequest);
    }

}
