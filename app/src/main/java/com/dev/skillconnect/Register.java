package com.dev.skillconnect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Admin on 01-03-2018.
 */

public class Register extends android.support.v4.app.Fragment {
    public Register() {}

    DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.fragment_register, container, false);

        RegistrationData data = new RegistrationData("Prashant", "Kumar", "pk021998@gmail.com", "7864531254","prashant",  "password");
        reference.setValue(data).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(myView.getContext(), "Added", Toast.LENGTH_SHORT).show();
            }
        });


        return myView;
    }

}

