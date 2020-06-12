package com.example.quizappdemo;

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

    private ArrayList<String> mChapters = new ArrayList<>();




    public void card1 (View view){

        Toast.makeText(this, "Working", Toast.LENGTH_LONG).show();
    }


    //Starts the activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_categories);



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
            //TODO REMOVE USELESS LOGD
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

        Log.d(TAG, "initTopics:  Preparing Chapters");

        mChapters.add("Chapter 1");
        mChapters.add("Chapter 2");
        mChapters.add("Chapter 3");
        mChapters.add("Chapter 4");
        mChapters.add("Chapter 5");
        mChapters.add("Chapter 6");
        mChapters.add("Chapter 7");
        mChapters.add("Chapter 8");
        mChapters.add("Chapter 9");
        mChapters.add("Chapter 10");
        mChapters.add("Chapter 11");
        mChapters.add("Chapter 12");
        mChapters.add("Chapter 13");
        mChapters.add("Chapter 14");
        mChapters.add("Chapter 15");
        mChapters.add("Chapter 16");
        mChapters.add("Chapter 17");
        mChapters.add("Chapter 18");
        mChapters.add("Chapter 19");
        mChapters.add("Chapter 20");
        mChapters.add("Chapter 21");
        mChapters.add("Chapter 22");
        mChapters.add("Chapter 23");
        mChapters.add("Chapter 24");
        mChapters.add("Chapter 25");
        mChapters.add("Chapter 26");
        mChapters.add("Chapter 27");
        mChapters.add("Chapter 28");

       initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView:  init Recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ListAdapter adapter = new ListAdapter(mChapters,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
