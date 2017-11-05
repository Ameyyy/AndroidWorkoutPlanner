package com.example.ameyparab.workouttracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class BicepFragment extends Fragment {
    private static final String TAG = "BicepsFragment";

    private ImageView arms0,arms1,arms2,arms3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.biceps_fragments,container,false);
        arms0 = (ImageView)view.findViewById(R.id.arms);
        arms1 = (ImageView)view.findViewById(R.id.biceps);
        arms2 = (ImageView)view.findViewById(R.id.triceps);
        arms3 = (ImageView)view.findViewById(R.id.superarms);

        arms0.setImageResource(R.drawable.arms);
        arms1.setImageResource(R.drawable.biceps);
        arms2.setImageResource(R.drawable.triceps);
        arms3.setImageResource(R.drawable.superarms);
        return view;
    }
}


