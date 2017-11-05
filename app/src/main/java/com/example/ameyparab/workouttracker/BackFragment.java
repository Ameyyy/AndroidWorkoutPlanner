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

public class BackFragment extends Fragment {
    private static final String TAG = "BackFragment";

    private ImageView b0,b1,b2,sb;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.back_fragment,container,false);
        b0 = (ImageView)view.findViewById(R.id.back0);
        b1 = (ImageView)view.findViewById(R.id.back1);
        b2 = (ImageView)view.findViewById(R.id.back2);
        sb = (ImageView)view.findViewById(R.id.superback);

        b0.setImageResource(R.drawable.back0);
        b1.setImageResource(R.drawable.back1);
        b2.setImageResource(R.drawable.back2);
        sb.setImageResource(R.drawable.superback);

        return view;
    }
}

