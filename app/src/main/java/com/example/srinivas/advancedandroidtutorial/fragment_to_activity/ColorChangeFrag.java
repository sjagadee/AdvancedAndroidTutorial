package com.example.srinivas.advancedandroidtutorial.fragment_to_activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.srinivas.advancedandroidtutorial.R;

/**
 * Created by srinivas on 6/19/17.
 */

public class ColorChangeFrag extends Fragment {

    OnColorChangeListener onColorChangeListener;
    RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.color_fragment_layout, container, false);
        radioGroup = (RadioGroup) view.findViewById(R.id.rgColorList);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbRed:
                        onColorChangeListener.onColorChanged("RED");
                        break;
                    case R.id.rbBlue:
                        onColorChangeListener.onColorChanged("BLUE");
                        break;
                    case R.id.rbGreen:
                        onColorChangeListener.onColorChanged("GREEN");
                        break;
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            Activity activity = (Activity) context;
            onColorChangeListener = (OnColorChangeListener) activity;
        } catch (Exception e) {

        }
    }

    public interface OnColorChangeListener {
        void onColorChanged(String color);
    }
}
