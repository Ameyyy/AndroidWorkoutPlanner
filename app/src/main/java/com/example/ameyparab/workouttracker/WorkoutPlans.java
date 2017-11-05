package com.example.ameyparab.workouttracker;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class WorkoutPlans extends FragmentActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_workout_plans);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Chest", null),
                ChestFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Shoulders", null),
                ShoulderFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Back", null),
                BackFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab4").setIndicator("Arms", null),
                BicepFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab5").setIndicator("Legs", null),
                LegsFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab6").setIndicator("Cardio", null),
                CardioFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab7").setIndicator("Abs", null),
                AbsFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab8").setIndicator("Home Exercises", null),
                HomeFragment.class, null);
    }
}