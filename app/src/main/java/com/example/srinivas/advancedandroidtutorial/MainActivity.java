package com.example.srinivas.advancedandroidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ListView lvTopList;

    String[] listOfString = {"Fragments" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfString);

        lvTopList = (ListView) findViewById(R.id.lvTopList);
        lvTopList.setAdapter(itemsAdapter);

        lvTopList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: the " + position + " for fragment");
                switch (position) {
                    case 0:
                        Intent i = new Intent(getApplicationContext(), MyFragmentActivity.class);
                        startActivity(i);
                        break;
                }
            }
        });


    }
}
