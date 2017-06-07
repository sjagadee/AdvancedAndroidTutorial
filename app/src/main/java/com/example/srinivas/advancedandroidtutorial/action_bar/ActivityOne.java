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

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView textView = (TextView) findViewById(R.id.activityTitle1);
        textView.setText("Welcome to ActivityOne!");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.ic_android:
                        Intent intent = new Intent(ActivityOne.this, MyActionBarActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_assessment:
                        break;

                    case R.id.ic_cloud:
                        Intent intent1 = new Intent(ActivityOne.this, ActivityTwo.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_group:

                        Intent intent2 = new Intent(ActivityOne.this, ActivityThree.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_smilee_face:

                        Intent intent3 = new Intent(ActivityOne.this, ActivityFour.class);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });

    }
}
