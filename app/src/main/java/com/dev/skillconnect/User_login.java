package com.dev.skillconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yuyakaido.android.cardstackview.MeetUpMainActivity;

/**
 * Created by Admin on 01-03-2018.
 */

public class User_login extends android.support.v4.app.Fragment {
    public User_login() {
// Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void check(View view)
    {    Intent in = new Intent(getContext(),MeetUpMainActivity.class);
           startActivity(in);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_user_login, container, false);
        Button checkBtn  = myView.findViewById(R.id.check);
        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),MeetUpMainActivity.class);
                startActivity(intent);
            }
        });
// Inflate the layout for this fragment
        return myView;

    }
}

