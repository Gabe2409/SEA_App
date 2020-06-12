package com.example.quizappdemo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubListAdapter extends RecyclerView.Adapter<SubListAdapter.ViewHolder> {
    private static final String TAG = "SubListAdapter";

    private ArrayList<String> mTopicNames = new ArrayList<>();
    private ArrayList<String> mTopicVideos = new ArrayList<>();
    private Context mContext;


    public SubListAdapter(ArrayList<String> mTopicNames, ArrayList<String> mTopicVideos, Context mContext) {
        this.mTopicNames = mTopicNames;
        this.mTopicVideos = mTopicVideos;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dashboard_subitems, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder:  Called");

         holder.topicName.setText(mTopicNames.get(position));
         holder.parentLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d(TAG, "onClick: Clicked on" + mTopicNames.get(position));

                 Toast.makeText(mContext, mTopicNames.get(position), Toast.LENGTH_LONG).show();

                 Intent intent = new Intent(mContext, VideoActivity.class);
                 intent.putExtra("topic_name", mTopicNames.get(position));
                 intent.putExtra(  "topic_video", mTopicVideos.get(position));
                 mContext.startActivity(intent);

             }
         });

    }

    @Override
    public int getItemCount() {
        return mTopicNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView topicName;
        RelativeLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topicName = itemView.findViewById(R.id.sub_topic);
            parentLayout = itemView.findViewById(R.id.sub_parent_layout);
        }
    }





}
