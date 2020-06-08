package com.example.quizappdemo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity  extends AppCompatActivity {

    TextView correct, wrong, result;
    Button retrybutton, quitbutton;



    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        correct = (TextView)findViewById(R.id.correct_textView);
        wrong =(TextView)findViewById(R.id.wrong_textView);
        result = (TextView)findViewById(R.id.result_textView);
        retrybutton = (Button) findViewById(R.id.retry_button);
        quitbutton = (Button) findViewById(R.id.quit_button2);





        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + QuestionsActivity.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + QuestionsActivity.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + QuestionsActivity.correct + "\n");
        correct.setText(sb);
        wrong.setText(sb2);
        result.setText(sb3);

        QuestionsActivity.correct=0;
        QuestionsActivity.wrong=0;

        retrybutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),QuestionsActivity.class);
            startActivity(intent);
        }




    });


         quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }




        });

    }


}
