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

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        TextView textView = (TextView) findViewById(R.id.activityTitle3);
        textView.setText("Welcome to ActivityThree!");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_android:
                        Intent intent = new Intent(ActivityThree.this, MyActionBarActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_assessment:

                        Intent intent1 = new Intent(ActivityThree.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_cloud:
                        Intent intent2 = new Intent(ActivityThree.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_group:


                        break;

                    case R.id.ic_smilee_face:

                        Intent intent3 = new Intent(ActivityThree.this, ActivityFour.class);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });
    }
}
