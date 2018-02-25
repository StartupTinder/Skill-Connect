package com.dev.skillconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

public class Login extends AppCompatActivity {
   Button swipe = (Button)findViewById(R.id.swipepages);
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            TextView forgot = (TextView)findViewById(R.id.text_view);
            forgot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Login.this, "Forgot password", Toast.LENGTH_SHORT).show();
                }
            });
        }
        /*
       On clicking login button
         */
    public void login(View view) {
        Intent in = new Intent(this, SecondPage.class);
        startActivity(in);
    }
  public void swipe(View view)
  {   Intent in = new Intent(this, Swipe_Page.class);
      startActivity(in);  }
//
    public void newregistration(View view) {

        Intent intent = new Intent(this , Registration.class);
        startActivity(intent);
    }
}
