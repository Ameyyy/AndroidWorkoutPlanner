package com.example.ameyparab.workouttracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentTab extends Fragment {
    private ImageView c1,c2,c3,c4,c5,sc,c0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chest_fragment, container, false);
        //TextView tv = (TextView) view.findViewById(R.id.text);
        //tv.setText(this.getTag() + " Content");
        c0 = (ImageView)view.findViewById(R.id.chest0);
        c1 = (ImageView)view.findViewById(R.id.chest1);
        c2 = (ImageView)view.findViewById(R.id.chest2);
        c3 = (ImageView)view.findViewById(R.id.chest3);
        c4 = (ImageView)view.findViewById(R.id.chest4);
        c5 = (ImageView)view.findViewById(R.id.chest5);
        sc = (ImageView)view.findViewById(R.id.superchest);
        return view;
    }
}
