package com.example.srinivas.advancedandroidtutorial.fragment_to_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/19/17.
 */

public class DisplayNameFragment extends Fragment {

    TextView tvDisplayName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.display_name_fragment, container, false);

        tvDisplayName = (TextView) view.findViewById(R.id.tvDisplayName);

        return view;
    }

    public void updateName(String name) {
        tvDisplayName.setText("Welcome " + name);
        tvDisplayName.setVisibility(View.VISIBLE);
    }

}
