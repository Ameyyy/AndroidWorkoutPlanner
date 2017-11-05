package com.example.ameyparab.workouttracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by User on 2/28/2017.
 */

public class ChestFragment extends Fragment {
    private static final String TAG = "ChestFragment";

    private ImageView c1,c2,c3,c4,c5,sc,c0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chest_fragment,container,false);
        c0 = (ImageView)view.findViewById(R.id.chest0);
        c1 = (ImageView)view.findViewById(R.id.chest1);
        c2 = (ImageView)view.findViewById(R.id.chest2);
        c3 = (ImageView)view.findViewById(R.id.chest3);
        c4 = (ImageView)view.findViewById(R.id.chest4);
        c5 = (ImageView)view.findViewById(R.id.chest5);
        sc = (ImageView)view.findViewById(R.id.superchest);

        c0.setImageResource(R.drawable.chest0);
        c1.setImageResource(R.drawable.chest1);
        c2.setImageResource(R.drawable.chest2);
        c3.setImageResource(R.drawable.chest3);
        c4.setImageResource(R.drawable.chest4);
        c5.setImageResource(R.drawable.chest5);
        sc.setImageResource(R.drawable.superchest);

        //btnTEST = (Button) view.findViewById(R.id.btnTEST);

        return view;
    }
}

