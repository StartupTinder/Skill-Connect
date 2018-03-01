package com.dev.skillconnect;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {

 TextView meet;
 TextView pass;
    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.page_fragment_layout,container,false);
        meet = (TextView)view.findViewById(R.id.meet);
        pass= (TextView)view.findViewById(R.id.pass);
        Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        pass.setText("not meeting");
        return view;
    }

}