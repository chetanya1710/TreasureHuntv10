package com.example.chetanyagupta.treasurehuntv10;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button start;
    //Animation frombottom;
    Intent i ;
    DatabaseClass db;
    TextView credits;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button);
        credits=findViewById(R.id.textView5);
        credits.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, CreditsActivity.class);
                startActivity(i);
            }
        });
        start.setBackgroundResource(R.drawable.lock);
        db=new DatabaseClass(MainActivity.this);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i= new Intent(MainActivity.this, RulesActivity.class);
                startActivity(i);

            }
        });


    }

}
