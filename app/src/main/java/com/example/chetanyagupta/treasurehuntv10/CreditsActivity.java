package com.example.chetanyagupta.treasurehuntv10;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv=findViewById(R.id.textView6);
        tv.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}
