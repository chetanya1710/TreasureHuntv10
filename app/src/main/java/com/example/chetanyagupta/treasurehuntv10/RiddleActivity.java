package com.example.chetanyagupta.treasurehuntv10;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RiddleActivity extends AppCompatActivity {
    DatabaseClass databaseClass;
    EditText ed;
    TextView tv;
    Riddles obj;
    Button nextRiddle;
    int pos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle);
        tv=findViewById(R.id.textView2);
        ed=findViewById(R.id.editText);
        nextRiddle=findViewById(R.id.button3);

        databaseClass= new DatabaseClass(this);
        final ArrayList<Riddles> AllRiddles=databaseClass.getAllRiddles();

        obj=AllRiddles.get(0);
        update(obj);
        nextRiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer=ed.getText().toString();
                if(yourAnswer.equalsIgnoreCase(obj.getAnswer()))
                {

                    AlertDialog.Builder dialog= new AlertDialog.Builder(RiddleActivity.this);
                    dialog.setTitle("Correct !!");
                    dialog.setMessage("That is Correct !! Here is  the next riddle ");
                    dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                    pos++;
                    ed.setText("");
                    //Toast.makeText(RiddleActivity.this,"correct answer",Toast.LENGTH_SHORT).show();
                    if(pos<AllRiddles.size()){
                        obj=AllRiddles.get(pos);
                        update(obj);
                    }
                    else{
                        Intent i= new Intent(RiddleActivity.this,FinalActivity.class);
                        startActivity(i);
                    }
                }
                else{
                    AlertDialog.Builder dialog= new AlertDialog.Builder(RiddleActivity.this);
                    dialog.setTitle("Incorrect :( :(");
                    dialog.setMessage("Oops!! seems like you didn't got that one right try again :) :) ");
                    dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                    //Toast.makeText(RiddleActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    public void update(Riddles obj){
        tv.setText(obj.getRiddle());
    }
}
