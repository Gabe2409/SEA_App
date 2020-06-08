package com.example.quizappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
        private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startbutton=(Button)findViewById(R.id.startbutton);
        Button exitbutton=(Button)findViewById(R.id.exitbutton);


            startbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(intent);
                }
            });

            exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               // finish();
              //  System.exit(0);
               // setContentView(R.layout.activity_dashboard);
               Intent intent=new Intent(getApplicationContext(), QuestionsActivity.class);
               startActivity(intent);
            }




        });










    }
}
