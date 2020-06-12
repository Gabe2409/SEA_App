package com.example.quizappdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubDashboardActivity extends AppCompatActivity {
    private static final String TAG = "SubDashboardActivity";

    private ArrayList<String> mTopicNames = new ArrayList<>();
    private ArrayList<String> mTopicVideos = new ArrayList<>();

    public void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: Checking for Incoming Intents");
        if(getIntent().hasExtra("Chapter")){
            Log.d(TAG, "getIncomingIntent: Found intent Extras");

            String Chapter = getIntent().getStringExtra("Chapter");


            setChapter(Chapter);


        }

    }


    public void setChapter(String Chapter){
        Log.d(TAG, "setChapter: Setting the Chapter");

        TextView ChapterName = findViewById(R.id.chapter_textView);
        ChapterName.setText(Chapter);

       String ChapterView = ChapterName.getText().toString();

        Log.d(TAG, "setChapter: " + ChapterView);

    }




    public void card1 (View view){

        Toast.makeText(this, "Working", Toast.LENGTH_LONG).show();
    }


    //Starts the activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_subcategories);
        getIncomingIntent();


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


    // TextView ChapterName = findViewById(R.id.chapter_textView);
   // String ChapterView = ChapterName.getText().toString();
    //public String ChapterView = "Chapter 2";








    private void initTopics(){

        Log.d(TAG, "initTopics:  Preparing Topics");

        TextView ChapterName = findViewById(R.id.chapter_textView);
        String ChapterView = ChapterName.getText().toString();

        Log.d(TAG, "Chapter is: " + ChapterView);


        if (ChapterView.equals("Chapter 1")){

            mTopicNames.add("Place value of digits in whole numbers");
            mTopicVideos.add("0");

            mTopicNames.add("Value of Digits in Whole numbers");
            mTopicVideos.add("1");

            mTopicNames.add("Number Names");
            mTopicVideos.add("2");

            mTopicNames.add("Number Names to Numerals");
            mTopicVideos.add("3");

            mTopicNames.add("Expanded Notation");
            mTopicVideos.add("4");

            mTopicNames.add("Approximations");
            mTopicVideos.add("5");

            mTopicNames.add("Estimation");
            mTopicVideos.add("6");

            mTopicNames.add("Addition");
            mTopicVideos.add("7");

            mTopicNames.add("Subtraction");
            mTopicVideos.add("8");

            mTopicNames.add("Multiplication");
            mTopicVideos.add("9");

            mTopicNames.add("Division");
            mTopicVideos.add("10");

            mTopicNames.add("Mixed Operations");
            mTopicVideos.add("11");


    } else if (ChapterView.equals("Chapter 2")){

            mTopicNames.add("The Commutative law of Arithmetic");
            mTopicVideos.add("12");

            mTopicNames.add("The Associative law of Arithmetic");
            mTopicVideos.add("13");

            mTopicNames.add("The Distributive law of Arithmetic");
            mTopicVideos.add("14");

    }else if (ChapterView.equals("Chapter 3")){

            mTopicNames.add("Odd and Even Numbers");
            mTopicVideos.add("15");

            mTopicNames.add("Triangular Numbers");
            mTopicVideos.add("16");

            mTopicNames.add("Square Numbers");
            mTopicVideos.add("17");

            mTopicNames.add("Rectangular Numbers");
            mTopicVideos.add("18");

            mTopicNames.add("Prime and Composite Numbers");
            mTopicVideos.add("19");

            mTopicNames.add("Factors");
            mTopicVideos.add("20");

            mTopicNames.add("Multiples");
            mTopicVideos.add("21");
    } else if (ChapterView.equals("Chapter 4")){

            mTopicNames.add("Square Numbers");
            mTopicVideos.add("22");

            mTopicNames.add("Square Root of Numbers");
            mTopicVideos.add("23");

            mTopicNames.add("Solving Problems Involving Squares and Square Roots");
            mTopicVideos.add("24");


    } else if (ChapterView.equals("Chapter 5")){

            mTopicNames.add("Common Fractions");
            mTopicVideos.add("25");

            mTopicNames.add("Types of Fractions");
            mTopicVideos.add("26");

            mTopicNames.add("Converting Mixed Numbers to Improper Fractions");
            mTopicVideos.add("27");

            mTopicNames.add("Converting Improper Fractions to Mixed Numbers");
            mTopicVideos.add("28");

            mTopicNames.add("Equivalent Fractions");
            mTopicVideos.add("29");

            mTopicNames.add("Comparing Fractions");
            mTopicVideos.add("30");

            mTopicNames.add("Ordering Fractions");
            mTopicVideos.add("31");

            mTopicNames.add("Approximation of Fractions");
            mTopicVideos.add("32");

            mTopicNames.add("Addition of Fractions");
            mTopicVideos.add("33");

            mTopicNames.add("Subtraction of Fractions");
            mTopicVideos.add("34");

            mTopicNames.add("Division of Fractions");
            mTopicVideos.add("35");

            mTopicNames.add("Solving Problems Involving Fractions");
            mTopicVideos.add("36");


    } else if (ChapterView.equals("Chapter 6")){

            mTopicNames.add("Decimals");
            mTopicVideos.add("37");

            mTopicNames.add("Expanded Notation");
            mTopicVideos.add("38");

            mTopicNames.add("Converting Decimals to Fractions");
            mTopicVideos.add("39");

            mTopicNames.add("Converting Fractions to Decimals");
            mTopicVideos.add("40");

            mTopicNames.add("Approximations with Decimals");
            mTopicVideos.add("41");

            mTopicNames.add("Ordering of Decimals");
            mTopicVideos.add("42");

            mTopicNames.add("Addition of Decimals");
            mTopicVideos.add("43");

            mTopicNames.add("Subtraction of Decimals");
            mTopicVideos.add("44");

            mTopicNames.add("Multiplication of Decimals");
            mTopicVideos.add("45");

            mTopicNames.add("Division of Decimals");
            mTopicVideos.add("46");

            mTopicNames.add("Decimal Fractions of Whole Numbers");
            mTopicVideos.add("47");

            mTopicNames.add("Expressing Quantities as Decimal Fractions");
            mTopicVideos.add("48");

            mTopicNames.add("Solving Problems Involving Decimals");
            mTopicVideos.add("49");

    } else if (ChapterView.equals("Chapter 7")){

            mTopicNames.add("Introduction to Percentages");
            mTopicVideos.add("50");

            mTopicNames.add("Expressing Common Fractions as Percentages");
            mTopicVideos.add("51");

            mTopicNames.add("Expressing Percentages as Common Fractions");
            mTopicVideos.add("52");

            mTopicNames.add("Expressing Decimal Fractions as Percentages");
            mTopicVideos.add("53");

            mTopicNames.add("Expressing Percentages as Decimal Fractions");
            mTopicVideos.add("54");

            mTopicNames.add("Percentage of a Quantity");
            mTopicVideos.add("55");

            mTopicNames.add("Expressing One Quantity as A Percentage of Another Quantity");
            mTopicVideos.add("56");

            //This Topic name was Changed For Consistency (Calculating Percentage / Percentages - Solving Problems
            mTopicNames.add("Solving Problems Involving Percentages");
            mTopicVideos.add("57");


    } else if (ChapterView.equals("Chapter 8")){

            mTopicNames.add("Proportion");
            mTopicVideos.add("58");

            mTopicNames.add("Solving Problems Involving Proportion");
            mTopicVideos.add("59");



    } else if (ChapterView.equals("Chapter 9")){

            mTopicNames.add("The Metric System");
            mTopicVideos.add("60");

            mTopicNames.add("Units of Measurement");
            mTopicVideos.add("61");

            mTopicNames.add("Prefixes");
            mTopicVideos.add("62");

            mTopicNames.add("Length");
            mTopicVideos.add("63");

            mTopicNames.add("Converting Metric Units: Centimeters And Meters");
            mTopicVideos.add("64");

            mTopicNames.add("Converting Metric Units: Millimeters And Centimeters");
            mTopicVideos.add("65");

            mTopicNames.add("Converting Metric Units: Meters and Kilometers");
            mTopicVideos.add("66");

            mTopicNames.add("Converting from one Metric unit to another");
            mTopicVideos.add("67");

            mTopicNames.add("Solving Problems Involving Arithmetic on Units of Measurement");
            mTopicVideos.add("68");


    } else if (ChapterView.equals("Chapter 10")){

            mTopicNames.add("Time");
            mTopicVideos.add("69");

            mTopicNames.add("Telling Time");
            mTopicVideos.add("70");

            mTopicNames.add("Units of Time");
            mTopicVideos.add("71");

            mTopicNames.add("The 24 Hour Clock");
            mTopicVideos.add("72");

            mTopicNames.add("Solving Problems Involving Time");
            mTopicVideos.add("73");


    } else if (ChapterView.equals("Chapter 11")){

            mTopicNames.add("Weight and Mass");
            mTopicVideos.add("74");

            mTopicNames.add("Units of Measurement of Weight and Mass");
            mTopicVideos.add("75");

            mTopicNames.add("Arithmetic Operations on Units of Weight and Mass");
            mTopicVideos.add("76");

            mTopicNames.add("Solving Problems Involving Weight and Mass");
            mTopicVideos.add("77");


    } else if (ChapterView.equals("Chapter 12")){

            mTopicNames.add("Volume and Capacity");
            mTopicVideos.add("78");

            mTopicNames.add("Converting Liters to Milliliters and Milliliters to Liters");
            mTopicVideos.add("79");

            mTopicNames.add("Solving Problems Involving Volume and Capacity");
            mTopicVideos.add("80");


    } else if (ChapterView.equals("Chapter 13")){

            mTopicNames.add("Money");
            mTopicVideos.add("81");

            mTopicNames.add("Equivalent Sums of Money");
            mTopicVideos.add("82");

            mTopicNames.add("Solving Problems Involving Money");
            mTopicVideos.add("83");

            mTopicNames.add("Bills");
            mTopicVideos.add("84");

            mTopicNames.add("Comparing PRices - Purchasing the Better Buy");
            mTopicVideos.add("85");

            mTopicNames.add("Rates");
            mTopicVideos.add("86");

            mTopicNames.add("Solving Problems Involving Money, Bills and Rates");
            mTopicVideos.add("87");


    } else if (ChapterView.equals("Chapter 14")){

            mTopicNames.add("Simple Interest");
            mTopicVideos.add("88");

            mTopicNames.add("Calculating Simple Interest");
            mTopicVideos.add("89");

            //Topic Changed from Solve Problems
            mTopicNames.add("Solving Problems Involving Simple Interest");
            mTopicVideos.add("90");


    } else if (ChapterView.equals("Chapter 15")){

            mTopicNames.add("Wages");
            mTopicVideos.add("91");

            mTopicNames.add("Performing Calculations Involving Wages");
            mTopicVideos.add("92");

            mTopicNames.add("Overtime Payments");
            mTopicVideos.add("93");

            mTopicNames.add("Calculate Overtime Payments");
            mTopicVideos.add("94");


    } else if (ChapterView.equals("Chapter 16")){

            mTopicNames.add("Profit and Loss");
            mTopicVideos.add("95");

            mTopicNames.add("Profit");
            mTopicVideos.add("96");

            mTopicNames.add("Loss");
            mTopicVideos.add("97");

            mTopicNames.add("Percentage Profit / Loss");
            mTopicVideos.add("98");

            mTopicNames.add("Solving Problems Involving Profit and Loss");
            mTopicVideos.add("99");


    } else if (ChapterView.equals("Chapter 17")){

            mTopicNames.add("Discounts");
            mTopicVideos.add("100");

            mTopicNames.add("Taxes");
            mTopicVideos.add("101");


            mTopicNames.add("Commission");
            mTopicVideos.add("102");

    } else if (ChapterView.equals("Chapter 18")) {

            mTopicNames.add("Parallel Lines");
            mTopicVideos.add("103");


            mTopicNames.add("Perpendicular Lines");
            mTopicVideos.add("104");


    } else if (ChapterView.equals("Chapter 19")){

            mTopicNames.add("Polygons");
            mTopicVideos.add("105");

            mTopicNames.add("Types of Polygons");
            mTopicVideos.add("106");

            mTopicNames.add("Identify the various Types of Polygons");
            mTopicVideos.add("107");

            mTopicNames.add("Construction of Polygons");
            mTopicVideos.add("108");


    } else if (ChapterView.equals("Chapter 20")){

            mTopicNames.add("Triangles, Equilateral, Isosceles and Scalene");
            mTopicVideos.add("109");

            mTopicNames.add("Equilateral Triangle");
            mTopicVideos.add("110");

            mTopicNames.add("Isosceles Triangle");
            mTopicVideos.add("111");

            mTopicNames.add("Scalene Triangle");
            mTopicVideos.add("112");

            mTopicNames.add("Acute Angled Triangle");
            mTopicVideos.add("113");

            mTopicNames.add("Obtuse Angled Triangle");
            mTopicVideos.add("114");

            mTopicNames.add("Right Angled Triangle");
            mTopicVideos.add("115");

            mTopicNames.add("Perimeter of a Triangle");
            mTopicVideos.add("116");

            mTopicNames.add("Area of a Triangle");
            mTopicVideos.add("117");


    } else if (ChapterView.equals("Chapter 21")){

            mTopicNames.add("Quadrilaterals");
            mTopicVideos.add("118");

            mTopicNames.add("Rectangles");
            mTopicVideos.add("119");

            mTopicNames.add("Squares");
            mTopicVideos.add("120");

            mTopicNames.add("Parallelograms");
            mTopicVideos.add("121");

            mTopicNames.add("Rhombus");
            mTopicVideos.add("122");

            mTopicNames.add("Trapeziums");
            mTopicVideos.add("123");

            mTopicNames.add("Kits");
            mTopicVideos.add("124");

    } else if (ChapterView.equals("Chapter 22")){

            mTopicNames.add("Compound Shapes");
            mTopicVideos.add("125");

            mTopicNames.add("Area of Compound Shapes");
            mTopicVideos.add("126");

            mTopicNames.add("Perimeter of Compound Shapes");
            mTopicVideos.add("127");

    } else if (ChapterView.equals("Chapter 23")){

            mTopicNames.add("Symmetry");
            mTopicVideos.add("128");

            mTopicNames.add("Problems Involving Symmetry");
            mTopicVideos.add("129");

    } else if (ChapterView.equals("Chapter 24")){

            mTopicNames.add("Angles");
            mTopicVideos.add("130");

            mTopicNames.add("Types of Angles");
            mTopicVideos.add("131");

            mTopicNames.add("Problems Involving Angles / Measuring Angles");
            mTopicVideos.add("132");

    } else if (ChapterView.equals("Chapter 25")){

            mTopicNames.add("Solids");
            mTopicVideos.add("133");

            mTopicNames.add("Cuboids");
            mTopicVideos.add("134");

            mTopicNames.add("Cubes");
            mTopicVideos.add("135");

            mTopicNames.add("Cylinders");
            mTopicVideos.add("136");

            mTopicNames.add("Cones");
            mTopicVideos.add("137");

            mTopicNames.add("Pyramids");
            mTopicVideos.add("138");

            mTopicNames.add("Prisms");
            mTopicVideos.add("139");

            mTopicNames.add("Spheres");
            mTopicVideos.add("140");


    } else if (ChapterView.equals("Chapter 26")){

            mTopicNames.add("Transformations");
            mTopicVideos.add("141");

            mTopicNames.add("Slide");
            mTopicVideos.add("142");

            mTopicNames.add("Flip");
            mTopicVideos.add("143");

            mTopicNames.add("Turn");
            mTopicVideos.add("144");


    } else if (ChapterView.equals("Chapter 27")){

            mTopicNames.add("Measures of Central Tendacy");
            mTopicVideos.add("145");

            mTopicNames.add("Mode");
            mTopicVideos.add("146");

            mTopicNames.add("Mean");
            mTopicVideos.add("147");

            mTopicNames.add("Median");
            mTopicVideos.add("148");


    } else if (ChapterView.equals("Chapter 28")){

            mTopicNames.add("Introduction to Graphs");
            mTopicVideos.add("129");

            mTopicNames.add("Pictographs");
            mTopicVideos.add("129");

            mTopicNames.add("Block Graphs");
            mTopicVideos.add("129");

            mTopicNames.add("Bar Graphs");
            mTopicVideos.add("129");

            mTopicNames.add("Pie Charts");
            mTopicVideos.add("129");



    }
    initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView:  init Recyclerview");
        RecyclerView recyclerView = findViewById(R.id.sub_recycler_view);

        SubListAdapter adapter = new SubListAdapter(mTopicNames, mTopicVideos, this);

       //SubListAdapter adapter = new ListAdapter(mTopicNames,this);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
