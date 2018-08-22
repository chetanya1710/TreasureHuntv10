package com.example.chetanyagupta.treasurehuntv10;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RulesActivity extends AppCompatActivity {
    private Button code;
    private EditText ed;
    //private String tablecode;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        code=findViewById(R.id.button2);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder obj= new AlertDialog.Builder(RulesActivity.this);
                obj.setTitle("Secret Code");
                ed= new EditText(RulesActivity.this);
                obj.setView(ed);
                obj.setMessage("Enter the Secret Code Provided");
                obj.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String secretCode= ed.getText().toString();

                        if(secretCode.equalsIgnoreCase("F0F8FF")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set1");
                            intent.putExtras(bundle);
                            startActivity(intent);

                        }
                        else if(secretCode.equalsIgnoreCase("FAEBD7")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set2");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("FFEBCD")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set3");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("A52A2A")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set4");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("F7FF00")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set5");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("B28B22")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set6");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("D400D3")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set7");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("B8860B")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set8");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("A9A9A9")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set9");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("B8008B")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set10");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("F8BC8F")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set11");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("C00ED1")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set12");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("FFFAF0")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set13");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("FF69B4")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set14");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("CD5C5C")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set15");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("F0E68C")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set16");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("E6E6FA")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set17");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("C7FC06")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set18");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("ADD8E6")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set19");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else if(secretCode.equalsIgnoreCase("FFB6C1")){
                            Intent intent=new Intent(RulesActivity.this,LoadingActivity.class);
                            Bundle bundle=new Bundle();
                            bundle.putString("riddle_code","set20");
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(RulesActivity.this,"uh ohh..seems like you have entered a wrong code, try again :) ", Toast.LENGTH_LONG).show();



                    }


                });
                obj.show();

            }
        });

    }

}
