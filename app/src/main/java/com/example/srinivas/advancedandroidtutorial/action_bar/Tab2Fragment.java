package com.example.srinivas.advancedandroidtutorial.action_bar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.srinivas.advancedandroidtutorial.R;

import java.util.ArrayList;

/**
 * Created by srinivas on 6/6/17.
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private ListView lvCardOfNature;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout2, container, false);
        lvCardOfNature = (ListView) view.findViewById(R.id.lvCardOfNature);

        ArrayList<Card> arrayList = new ArrayList<>();

        arrayList.add(new Card("drawable://" + R.drawable.albarta, "Alberta"));
        arrayList.add(new Card("drawable://" + R.drawable.angels_landings, "Angels Landings"));
        arrayList.add(new Card("drawable://" + R.drawable.australian_mountain, "Australian Mountains"));
        arrayList.add(new Card("drawable://" + R.drawable.charlottesville, "Charlotteville"));
        arrayList.add(new Card("drawable://" + R.drawable.combodia, "Combodia"));
        arrayList.add(new Card("drawable://" + R.drawable.elk_mountains, "Elk Mountains"));
        arrayList.add(new Card("drawable://" + R.drawable.jiuzhaigou, "Jiuzhaigou"));
        arrayList.add(new Card("drawable://" + R.drawable.lake_michigan, "Lake Michigan"));
        arrayList.add(new Card("drawable://" + R.drawable.oregon_coast, "Oregon Coast"));
        arrayList.add(new Card("drawable://" + R.drawable.rocky_mountains, "Rocky Mountains"));
        arrayList.add(new Card("drawable://" + R.drawable.skilak_lake, "Skilak Lake"));
        arrayList.add(new Card("drawable://" + R.drawable.yosamite_falls, "Yosemite Falls"));

        CustomListAdapter listAdapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, arrayList);
        lvCardOfNature.setAdapter(listAdapter);

        return view;
    }
}
