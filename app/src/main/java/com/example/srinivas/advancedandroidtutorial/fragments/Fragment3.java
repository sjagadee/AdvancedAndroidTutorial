package com.example.srinivas.advancedandroidtutorial.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 5/31/17.
 */

public class Fragment3 extends Fragment {

    private static final String TAG = "Fragment3";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);

        btnNavFrag1 = (Button) view.findViewById(R.id.bGoToFragment1);
        btnNavFrag2 = (Button) view.findViewById(R.id.bGoToFragment2);
        btnNavFrag3 = (Button) view.findViewById(R.id.bGoToFragment3);
        btnNavSecActivity = (Button) view.findViewById(R.id.bGoToSecondActivity);

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going To Fragment 1", Toast.LENGTH_SHORT).show();

                ((MyFragmentActivity)getActivity()).setViewPager(0);
            }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going To Fragment 2", Toast.LENGTH_SHORT).show();

                ((MyFragmentActivity)getActivity()).setViewPager(1);
            }
        });
        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going To Fragment 3", Toast.LENGTH_SHORT).show();

                ((MyFragmentActivity)getActivity()).setViewPager(2);
            }
        });
        btnNavSecActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going To Second Activity", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
