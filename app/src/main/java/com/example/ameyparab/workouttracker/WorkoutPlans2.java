package com.example.ameyparab.workouttracker;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class WorkoutPlans2 extends AppCompatActivity {

    private static final String TAG = "Workout Plans";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_plans2);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());

        /*adapter.addFragment(new ChestFragment(), "CHEST");
        adapter.addFragment(new ShoulderFragment(), "SHOULDER");
        adapter.addFragment(new BackFragment(), "BACK");
        adapter.addFragment(new BicepFragment(), "ARMS");
        adapter.addFragment(new TricepsFragment(), "TRICEPS");
        adapter.addFragment(new LegsFragment(), "LEGS");
        adapter.addFragment(new CardioFragment(), "CARDIO");
        adapter.addFragment(new AbsFragment(), "ABS");
        adapter.addFragment(new HomeFragment(), "HOME EXERCISES");
        viewPager.setAdapter(adapter);*/
    }

}
