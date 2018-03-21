package com.yuyakaido.android.cardstackview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.skillconnect.*;
import com.dev.skillconnect.R;

/**
 * Created by Admin on 03-03-2018.
 */

public class MeetUpAdapter extends ArrayAdapter<MeetUpData> {

    public MeetUpAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        ViewHolder holder;

        if (contentView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            contentView = inflater.inflate(com.dev.skillconnect.R.layout.activity_meetup_card, parent, false);
            holder = new ViewHolder(contentView);
            contentView.setTag(holder);
            holder.view_profile.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent user_profile = new Intent(v.getContext(), User_Profile.class);
                  getContext().startActivity(user_profile);

                }
            });


        } else {
            holder = (ViewHolder) contentView.getTag();
        }

        MeetUpData data = getItem(position);

        holder.name.setText(data.name);
        holder.post.setText(data.post);
        holder.interest.setText(data.interest);
        return contentView;
    }

    public static class ViewHolder  {
        public TextView name;
        public TextView post;
        public TextView interest;
        public ImageView user;
        public Button view_profile;

        public ViewHolder(View view) {
            this.name = (TextView) view.findViewById(com.dev.skillconnect.R.id.name);
            this.post = (TextView) view.findViewById(com.dev.skillconnect.R.id.post);
            this.interest = (TextView) view.findViewById(com.dev.skillconnect.R.id.interest);
            this.user = (ImageView) view.findViewById(com.dev.skillconnect.R.id.user);
            this.view_profile = (Button) view.findViewById(R.id.view_profile);
        }
    }
}
