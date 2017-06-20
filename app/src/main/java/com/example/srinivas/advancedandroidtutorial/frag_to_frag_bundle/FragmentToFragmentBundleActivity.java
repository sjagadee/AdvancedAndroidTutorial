package com.example.srinivas.advancedandroidtutorial.frag_to_frag_bundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/20/17.
 */

public class FragmentToFragmentBundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_to_frag_bundle_layout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DataEntryFragment dataEntryFragment = new DataEntryFragment();
        fragmentTransaction.add(R.id.flContainer, dataEntryFragment);
        fragmentTransaction.commit();
    }
}
