package com.example.srinivas.advancedandroidtutorial.fragment_to_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/19/17.
 */
public class FragToFragCommunicationActivity extends AppCompatActivity implements EnterNameFragment.OnSendNameClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_to_fragment_layout);


    }

    @Override
    public void onSendName(String name) {

        DisplayNameFragment displayNameFragment = (DisplayNameFragment) getSupportFragmentManager().findFragmentById(R.id.fragDisplayName);
        displayNameFragment.updateName(name);

    }
}
