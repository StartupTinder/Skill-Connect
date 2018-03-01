package com.dev.skillconnect;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class Login extends AppCompatActivity {
  FrameLayout simpleFrameLayout;
    TabLayout tabLayout;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            simpleFrameLayout = (FrameLayout) findViewById(R.id.simpleFrameLayout);
            tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);
// Create a new Tab named "LOGIN"
            TabLayout.Tab firstTab = tabLayout.newTab();
            firstTab.setText("LOGIN"); // set the Text for the first Tab
            tabLayout.addTab(firstTab); // add  the tab at in the TabLayout
// Create a new Tab named "REGISTER"
            TabLayout.Tab secondTab = tabLayout.newTab();
            secondTab.setText("REGISTER"); // set the Text for the second Tab
            tabLayout.addTab(secondTab);
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
// get the current selected tab's position and replace the fragment accordingly
                    android.support.v4.app.Fragment fragment = null;
                    switch (tab.getPosition()) {
                        case 0:
                            fragment = new User_login();
                            break;
                        case 1:
                            fragment = new Register();
                            break;
                    }
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.simpleFrameLayout, fragment);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    ft.commit();
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }
}