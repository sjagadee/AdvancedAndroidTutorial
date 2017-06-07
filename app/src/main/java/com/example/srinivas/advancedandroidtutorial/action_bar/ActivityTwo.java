package com.example.srinivas.advancedandroidtutorial.action_bar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.srinivas.advancedandroidtutorial.R;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView textView = (TextView) findViewById(R.id.activityTitle2);
        textView.setText("Welcome to ActivityTwo!");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_android:
                        Intent intent = new Intent(ActivityTwo.this, MyActionBarActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_assessment:

                        Intent intent1 = new Intent(ActivityTwo.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_cloud:
                        break;

                    case R.id.ic_group:

                        Intent intent2 = new Intent(ActivityTwo.this, ActivityThree.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_smilee_face:

                        Intent intent3 = new Intent(ActivityTwo.this, ActivityFour.class);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });



    }
}
