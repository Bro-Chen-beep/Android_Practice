package com.example.user.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] favoriteshow = {"Heroacdemia", "Onepiece", "Naruto", "bleach", "Rick and Morty",
                "walkingdead", "how i met your mother", "big bang thereory","mamamia","mohoshojuo"};
        ListAdapter theadapter = new myadapter(this,favoriteshow);
                //(this,R.layout.row_layout,R.id.textview1, favoriteshow);
        ListView thelistview = (ListView) findViewById(R.id.theListView);

        thelistview.setAdapter(theadapter);
        thelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            String showpicked ="You selected " + String.valueOf(adapterView.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, showpicked, Toast.LENGTH_SHORT).show();

            }
        });
    }


}