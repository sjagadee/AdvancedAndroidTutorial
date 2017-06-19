package com.example.srinivas.advancedandroidtutorial.fragment_to_activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/19/17.
 */
public class FragToActivityCommunicationActivity extends AppCompatActivity implements ColorChangeFrag.OnColorChangeListener {

    LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_to_activity_layout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ColorChangeFrag colorChangeFrag = new ColorChangeFrag();
        fragmentTransaction.add(R.id.frag_to_active_containter, colorChangeFrag);
        fragmentTransaction.commit();
    }

    @Override
    public void onColorChanged(String color) {
        linearLayout = (LinearLayout) findViewById(R.id.llFragToActivity);

        if(color.equals("RED")) {
            linearLayout.setBackgroundColor(Color.RED);
        } else if (color.equals("BLUE")) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else if (color.equals("GREEN")) {
            linearLayout.setBackgroundColor(Color.GREEN);
        }

    }
}
