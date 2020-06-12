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

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private static final String TAG = "ListAdapter";

    private ArrayList<String> mChapters= new ArrayList<>();
    private Context mContext;


    public ListAdapter(ArrayList<String> mChapters,  Context mContext) {
        this.mChapters = mChapters;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dashboard_items, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder:  Called");

        holder.Chapter.setText(mChapters.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked on " + mChapters.get(position));

                Toast.makeText(mContext, mChapters.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(mContext,  SubDashboardActivity.class);
                intent.putExtra("Chapter", mChapters.get(position));
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mChapters.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView Chapter;
        RelativeLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Chapter = itemView.findViewById(R.id.chapter);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }





}
