package com.example.quizappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    private static final String TAG = "DashboardActivity";

    private ArrayList<String> mTopicNames = new ArrayList<>();
    private ArrayList<String> mTopicVideos = new ArrayList<>();



    public void card1 (View view){

        Toast.makeText(this, "Working", Toast.LENGTH_LONG).show();
    }


    //Starts the activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        // toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            toolbar.setTitle("Back");

        }

            Log.d(TAG, "onCreate: Started");

        initTopics();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }





    private void initTopics(){

        Log.d(TAG, "initTopics:  Preparing Topics");

        mTopicNames.add("The Commutative law of Arithmetic");
        mTopicVideos.add("0");

        mTopicNames.add("The Associative law of Arithmetic");
        mTopicVideos.add("1");

        mTopicNames.add("The Distributive law of Arithmetic");
        mTopicVideos.add("2");


        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView:  init Recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
         ListAdapter adapter = new ListAdapter(mTopicNames,mTopicVideos, this);
        //ListAdapter adapter = new ListAdapter(mTopicNames,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
