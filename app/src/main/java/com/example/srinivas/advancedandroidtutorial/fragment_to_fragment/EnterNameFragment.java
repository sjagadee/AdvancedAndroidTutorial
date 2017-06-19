package com.example.srinivas.advancedandroidtutorial.fragment_to_fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/19/17.
 */

public class EnterNameFragment extends Fragment {

    EditText etEnterName;
    Button bSendName;
    OnSendNameClickListener onSendNameClickListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.enter_name_fragment, container, false);

        etEnterName = (EditText) view.findViewById(R.id.etEnterName);
        bSendName = (Button) view.findViewById(R.id.bSendName);

            bSendName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = etEnterName.getText().toString();
                    onSendNameClickListener.onSendName(name);
                }
            });


        return view;
    }

    public interface OnSendNameClickListener {
        void onSendName(String name);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            Activity activity = (Activity) context;
            onSendNameClickListener = (OnSendNameClickListener) activity;
        } catch (Exception e) {

        }
    }
}
