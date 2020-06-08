package com.example.quizappdemo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import org.w3c.dom.Text;



public class QuestionsActivity extends AppCompatActivity{

    TextView tv;
    Button submitbutton, quitbutton;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "To determine the sum of a group of numbers, which arithmetic operation should be used?",
            "To determine the product of a pair of numbers, what is the most suitable arithmetic operation to be performed on the numbers?",
            "To determine the total number of groups of 7 which can be obtained from the number 350, which arithmetic operation should be performed?",
            "159 is larger than 49. Which arithmetic operation should be performed to find by how much is 159 larger than 49?",
            "If I divide 144 by 8, I get 18. The term used to refer to the result 18 is:",
    };
    String answers[] = {"Addition", "Multiplication", "Division", "Subtraction", "Quotient"};

    String opt[] = {
            "Addition", "Subtraction", "Multiplication", "Division",
            "Addition", "Subtraction", "Multiplication", "Division",
            "Addition", "Subtraction", "Multiplication", "Division",
            "Addition", "Subtraction", "Multiplication", "Division",
            "Sum", "Difference", "Product", "Quotient"

    };

    private ProgressBar pBar;
    private int pbarStatus =0;
    private Handler pbarHandler = new Handler();



    int count=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        pBar = (ProgressBar) findViewById(R.id.progressBar);
        submitbutton = (Button) findViewById(R.id.nextbutton);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.questionview);

        final RadioGroup radio_g = (RadioGroup) findViewById(R.id.answersgrp);
        rb1 = (RadioButton) findViewById(R.id.radiobutton1);
        rb2 = (RadioButton) findViewById(R.id.radiobutton2);
        rb3 = (RadioButton) findViewById(R.id.radiobutton3);
        rb4 = (RadioButton) findViewById(R.id.radiobutton4);
        tv.setText(questions[count]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Checks if the user selects an answer or not
                if(radio_g.getCheckedRadioButtonId()==-1){

                    Toast.makeText(getApplicationContext(), "Please Select an Answer", Toast.LENGTH_SHORT).show();
                    return;
                }



                RadioButton userans = (RadioButton)findViewById(radio_g.getCheckedRadioButtonId());
                String useransText = userans.getText().toString();


                if(useransText.equals(answers[count])){
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                }

                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_SHORT).show();
                }

                //Goes onto the next question
                count++;

                    pbarStatus = pbarStatus + 20;
                    android.os.SystemClock.sleep(50);
                    pbarHandler.post(new Runnable (){
                        @Override
                        public void run(){
                            pBar.setProgress(pbarStatus);
                        }
                    });


                if(count<questions.length){
                    tv.setText(questions[count]);
                    rb1.setText(opt[count*4]);
                    rb2.setText(opt[count*4 +1]);
                    rb3.setText(opt[count*4 +2]);
                    rb4.setText(opt[count*4 +3]);
                }

                else{

                    Intent intent2 = new Intent(getApplicationContext(), ResultsActivity.class);
                    startActivity(intent2);
                }




                radio_g.clearCheck();



            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
