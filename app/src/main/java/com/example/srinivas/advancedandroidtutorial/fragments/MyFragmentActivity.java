package com.example.srinivas.advancedandroidtutorial.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 5/31/17.
 */
public class MyFragmentActivity extends AppCompatActivity{

    private static final String TAG = "MyFragmentActivity";

    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_activity);
        Log.d(TAG, "onCreate: Started.");
        mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);

        // setup pager
        setupViewPager(mViewPager);
    }

    // when this method is called the ViewPager (container) would basically set up the fragments according
    // to the order mentioned below
    private void setupViewPager(ViewPager viewPager) {
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "Fragment1");
        adapter.addFragment(new Fragment2(), "Fragment2");
        adapter.addFragment(new Fragment3(), "Fragment3");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);

    }
}
