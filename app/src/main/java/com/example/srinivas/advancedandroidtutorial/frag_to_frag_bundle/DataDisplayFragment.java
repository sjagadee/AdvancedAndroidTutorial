package com.example.srinivas.advancedandroidtutorial.frag_to_frag_bundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/20/17.
 */

public class DataDisplayFragment extends Fragment {

    TextView firstName;
    TextView lastName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.data_display_fragment_layout, container, false);

        firstName = (TextView) view.findViewById(R.id.tvDisplayFirstName);
        lastName = (TextView) view.findViewById(R.id.tvDisplayLastName);

        Bundle bundle = getArguments();

        firstName.setText(bundle.getString("FirstName"));
        lastName.setText(bundle.getString("LastName"));

        return view;
    }
}
