package com.example.quizappdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import org.w3c.dom.Text;

public class VideoActivity extends AppCompatActivity {

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: Checking for Incoming Intents");
        if(getIntent().hasExtra("topic_name")){
            Log.d(TAG, "getIncomingIntent: Found intent Extras");

            String topicname = getIntent().getStringExtra("topic_name");
            String topicvideo = getIntent().getStringExtra("topic_video");

            setTopicName(topicname);
            setTopicVideo(topicvideo);

        }

    }


    public void setTopicName(String topicname){
        Log.d(TAG, "setTopic: Setting the topic name and information");

        TextView topicnametv = findViewById(R.id.topicname_textview);
        topicnametv.setText(topicname);

    }
    public void setTopicVideo(String topicVideo){
        Log.d(TAG, "setTopic: Setting the topic Video and information");
        TextView topicvid = findViewById(R.id.vid_textview);
        topicvid.setText(topicVideo);
            }


    public String topicVideo;
    private static final String TAG = "VideoActivity";
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




    // These Things Concerns the  Video Playing
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getIncomingIntent();

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.coltoolbar);
        collapsingToolbarLayout.setTitleEnabled(false);

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            toolbar.setTitle("Back");

        }





        final int videoArray[]={R.raw.cloa, R.raw.aloa, R.raw.dloa};
        Button playvid = (Button) findViewById(R.id.playbutton);

        final MediaController mediaController = new MediaController(this);

        playvid.setOnClickListener(new View.OnClickListener() {

            //public void onButtonClick(View v) {


            public void onClick(View v) {

                VideoView vid = (VideoView) findViewById(R.id.videoView);
                mediaController.setAnchorView(vid);

               TextView topicvid = findViewById(R.id.vid_textview);
               String TopicVid = topicvid.getText().toString();



               //String videoResource = R.raw.cloa + TopicVid;


                String path = "android.resource://" + getPackageName() + "/raw/" + videoArray[Integer.parseInt(TopicVid)];

                Uri u = Uri.parse(path);

                vid.setMediaController(mediaController);

                vid.setVideoURI(u);

                vid.start();
                vid.seekTo(1);

                Log.d(TAG, "onClick: Display path   " + path);
            }
        });

    }



    // handle arrow click here
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

}















