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

public class AbsFragment extends Fragment {
    private static final String TAG = "AbsFragment";

    private ImageView a0,a1,a2,a3,a4,a5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.abs_fragment,container,false);
        a0 = (ImageView)view.findViewById(R.id.abs0);
        a1 = (ImageView)view.findViewById(R.id.abs1);
        a2 = (ImageView)view.findViewById(R.id.abs2);
        a3 = (ImageView)view.findViewById(R.id.abs3);
        a4 = (ImageView)view.findViewById(R.id.abs4);
        a5 = (ImageView)view.findViewById(R.id.abs5);

        a0.setImageResource(R.drawable.abs0);
        a1.setImageResource(R.drawable.abs1);
        a2.setImageResource(R.drawable.abs2);
        a3.setImageResource(R.drawable.abs3);
        a4.setImageResource(R.drawable.abs4);
        a5.setImageResource(R.drawable.abs5);

        return view;
    }
}

