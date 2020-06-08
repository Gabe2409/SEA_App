package com.example.quizappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Log.d(TAG, "onCreate: Started");

        initTopics();


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
