package com.dev.skillconnect;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 03-03-2018.
 */

public class MeetUpAdapter extends RecyclerView.Adapter<MeetUpAdapter.ViewHolder> {

    List<MeetUpData> list = new ArrayList<>();
    private LayoutInflater inflater;
    private ViewHolder holder;

    public MeetUpAdapter(Context context,List<MeetUpData> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.activity_meetup_card, parent, false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       holder.MeetUpData = getItem(position);
        holder.name.setText(list.get(position).name);
        holder.post.setText(list.get(position).post);
        holder.interest.setText(list.get(position).interest);


    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public MeetUpData getItem(int i) {
        return list.get(i);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView post;
        TextView name;
        TextView interest;
        MeetUpData meetUpData;
        public MeetUpData MeetUpData;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            post = (TextView) itemView.findViewById(R.id.post);
            interest =(TextView)itemView.findViewById(R.id.interest);
        }
    }
}