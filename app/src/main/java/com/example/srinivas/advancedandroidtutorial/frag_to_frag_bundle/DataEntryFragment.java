package com.example.srinivas.advancedandroidtutorial.frag_to_frag_bundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/20/17.
 */

public class DataEntryFragment extends Fragment {

    EditText etFirstName;
    EditText etLastName;
    Button bSendDetails;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.data_entry_fragment_layout, container, false);

        etFirstName = (EditText) view.findViewById(R.id.etEnterFirstName);
        etLastName = (EditText) view.findViewById(R.id.etEnterLastName);
        bSendDetails = (Button) view.findViewById(R.id.bSendDetails);

        bSendDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("FirstName", etFirstName.getText().toString());
                bundle.putString("LastName", etLastName.getText().toString());

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                DataDisplayFragment dataDisplayFragment = new DataDisplayFragment();
                dataDisplayFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.flContainer, dataDisplayFragment);
                fragmentTransaction.commit();

            }
        });

        return view;
    }
}
