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
        holder.cardtitle.setText(list.get(position).name);
        holder.cardimage.setImageResource(list.get(position).id);
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
        ImageView cardimage;
        TextView cardtitle;
        MeetUpData meetUpData;
        public MeetUpData MeetUpData;

        public ViewHolder(View itemView) {
            super(itemView);
            cardimage = (ImageView) itemView.findViewById(R.id.cardimage);
            cardtitle = (TextView) itemView.findViewById(R.id.cardtitle);
        }
    }
}