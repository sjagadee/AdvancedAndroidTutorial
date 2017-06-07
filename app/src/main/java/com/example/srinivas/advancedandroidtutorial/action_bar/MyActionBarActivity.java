package com.example.srinivas.advancedandroidtutorial.action_bar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.srinivas.advancedandroidtutorial.R;

public class MyActionBarActivity extends AppCompatActivity {

    private static final String TAG = "MyActionBarActivity";

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_action_bar);
        Log.d(TAG, "onCreate: started");

        // creating object of SectionPagerAdapter using FragmentManager
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // view pager helps in navigation of fragments
        mViewPager  = (ViewPager) findViewById(R.id.containerPager);
        setupViewPager(mViewPager);

        // setup TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // setup icons for tabLayout
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_assignment);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_drive_eta);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_dashboard);

        // To setup BottomNavigationView without animation
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        // To highlight the menu item in the BottomNavigationView which clicked
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        // going to each activity when we click on each icon view
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_android:
                        break;

                    case R.id.ic_assessment:

                        Intent intent = new Intent(MyActionBarActivity.this, ActivityOne.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_cloud:

                        Intent intent1 = new Intent(MyActionBarActivity.this, ActivityTwo.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_group:

                        Intent intent2 = new Intent(MyActionBarActivity.this, ActivityThree.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_smilee_face:

                        Intent intent3 = new Intent(MyActionBarActivity.this, ActivityFour.class);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });

    }

    /**
     * @param mViewPager
     *
     * This method sets up fragments in the order which is mentioned below in the method
     * with the help of SectionPagerAdapter by passing the instance of tab-fragment
     */
    private void setupViewPager(ViewPager mViewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());
        adapter.addFragment(new Tab2Fragment());
        adapter.addFragment(new Tab3Fragment());
        mViewPager.setAdapter(adapter);


    }
}
