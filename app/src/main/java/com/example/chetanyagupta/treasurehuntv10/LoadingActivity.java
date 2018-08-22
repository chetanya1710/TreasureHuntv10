package com.example.chetanyagupta.treasurehuntv10;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {

    DatabaseClass db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= getIntent();
                Bundle bundle=i.getExtras();
                String riddle_code=bundle.getString("riddle_code");
                db= new DatabaseClass(LoadingActivity.this,riddle_code);
                i=new Intent (LoadingActivity.this,RiddleActivity.class);
                startActivity(i);


            }
        },5000);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
