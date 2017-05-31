package com.example.srinivas.advancedandroidtutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by srinivas on 5/31/17.
 */
public class MyFragmentActivity extends AppCompatActivity{

    private static final String TAG = "MyFragmentActivity";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_activity);

        Log.d(TAG, "onCreate: In Fragment Activity");
    }
}
