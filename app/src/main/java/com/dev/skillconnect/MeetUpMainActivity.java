
package com.dev.skillconnect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.dev.skillconnect.MeetUpAdapter;
import com.dev.skillconnect.MeetUpData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 03-03-2018.
 */

public class MeetUpMainActivity  extends AppCompatActivity{
    RecyclerView recyclerView;
    MeetUpAdapter adapter;
    List<MeetUpData> companies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetup);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(llm);
        initializeData();
        adapter = new MeetUpAdapter(getApplicationContext(),companies);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    private void initializeData() {
        companies = new ArrayList<>();
        companies.add(new MeetUpData("Srishti","Manager","ii"));
        companies.add(new MeetUpData("Srishti","Manager","ii"));
        companies.add(new MeetUpData("Srishti","Manager","ii"));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
