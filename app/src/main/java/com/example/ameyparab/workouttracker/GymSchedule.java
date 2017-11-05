package com.example.ameyparab.workouttracker;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import compat.content.SharedPreferenceCompat;
import compat.preference.MultiSelectListPreferenceCompat;

import static android.R.color.holo_orange_light;
import static android.R.id.text1;

public class GymSchedule extends AppCompatActivity
        implements SharedPreferences.OnSharedPreferenceChangeListener {

    private String mKeyText1,mKeyText2,mKeyText3,mKeyText4,mKeyText5,mKeyText6,mKeyText7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_schedule);

        mKeyText1 = "key_text1";
        mKeyText2 = "key_text2";
        mKeyText3 = "key_text3";
        mKeyText4 = "key_text4";
        mKeyText5 = "key_text5";
        mKeyText6 = "key_text6";
        mKeyText7 = "key_text7";


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        TableRow row=(TableRow) findViewById(R.id.head);
        Button plan = (Button) findViewById(R.id.buttonmonday);
        TextView text = (TextView) findViewById(R.id.monday);
        if(day==Calendar.SUNDAY){
                row = (TableRow) findViewById(R.id.sun);
                plan = (Button) findViewById(R.id.buttonsunday);
            text = (TextView) findViewById(R.id.sunday);
            }
        else if(day==Calendar.MONDAY) {
                row = (TableRow) findViewById(R.id.mon);
                plan = (Button) findViewById(R.id.buttonmonday);
                text = (TextView) findViewById(R.id.monday);
            }
        else if(day==Calendar.TUESDAY) {
                row = (TableRow) findViewById(R.id.tue);
                plan = (Button) findViewById(R.id.buttontuesday);
            text = (TextView) findViewById(R.id.tuesday);
            }
        else if(day==Calendar.WEDNESDAY) {
                row = (TableRow) findViewById(R.id.wed);
                plan = (Button) findViewById(R.id.buttonwednesday);
            text = (TextView) findViewById(R.id.wednesday);
            }
        else if(day==Calendar.THURSDAY){
                row = (TableRow) findViewById(R.id.thu);
                plan = (Button) findViewById(R.id.buttonthursday);
            text = (TextView) findViewById(R.id.thursday);
            }
        else if(day==Calendar.FRIDAY) {
                row = (TableRow) findViewById(R.id.fri);
                plan = (Button) findViewById(R.id.buttonfriday);
            text = (TextView) findViewById(R.id.friday);
            }
        else if(day==Calendar.SATURDAY)
            {   row = (TableRow) findViewById(R.id.sat);
                plan = (Button) findViewById(R.id.buttonsaturday);
                text = (TextView) findViewById(R.id.saturday);
        }

        row.setBackgroundColor(Color.parseColor("#FFFFE06F"));

        if("Rest".contains(text.getText().toString())){
            plan.setVisibility(View.INVISIBLE);
        }
        else{
            plan.setVisibility(View.VISIBLE);
        }

        // make launcher button

        // make toggle button
        /*final Button toggleButton = (Button) findViewById(R.id.toggle_button);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleSettingValues();
            }
        });*/

    }

    @Override
    protected void onResume() {
        super.onResume();
        updateCurrentSettingsText();
        getPrefs().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onPause() {
        getPrefs().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gym_schedule, menu);
        return true;
    }

   /* @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings: {
                launchPreferenceActivity();
            }
            break;
        }
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent startSettingsActivity = new Intent(this, MainPreferenceActivity.class);
            startActivity(startSettingsActivity);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        updateCurrentSettingsText();
    }

    private SharedPreferences getPrefs() {
        return PreferenceManager.getDefaultSharedPreferences(this);
    }

    private Set<String> getDefaultValues() {
        final Set<String> defValues = new HashSet<String>();
        defValues.addAll(Arrays.asList(
                getResources().getStringArray(
                        R.array.multisellistpref_defvalues1)));
        return defValues;
    }

    private void updateCurrentSettingsText() {
        // ex. SharedPreferenceCompat.getStringSet()
        final SharedPreferences prefs = getPrefs();

        final Set<String> values1 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText1, getDefaultValues());
        if (values1 == null)
            return;
        final TextView text1 = (TextView) findViewById(R.id.monday);
        String val1=Utils.sortedToString(values1);
        val1=val1.replace("[","");
        val1=val1.replace("]","");
        text1.setText(val1);

        final Set<String> values2 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText2, getDefaultValues());
        if (values2 == null)
            return;
        final TextView text2 = (TextView) findViewById(R.id.tuesday);
        String val2=Utils.sortedToString(values2);
        val2=val2.replace("[","");
        val2=val2.replace("]","");
        text2.setText(val2);

        final Set<String> values3 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText3, getDefaultValues());
        if (values3 == null)
            return;
        final TextView text3 = (TextView) findViewById(R.id.wednesday);
        String val3=Utils.sortedToString(values3);
        val3=val3.replace("[","");
        val3=val3.replace("]","");
        text3.setText(val3);

        final Set<String> values4 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText4, getDefaultValues());
        if (values4 == null)
            return;
        final TextView text4 = (TextView) findViewById(R.id.thursday);
        String val4=Utils.sortedToString(values4);
        val4=val4.replace("[","");
        val4=val4.replace("]","");
        text4.setText(val4);

        final Set<String> values5 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText5, getDefaultValues());
        if (values5 == null)
            return;
        final TextView text5 = (TextView) findViewById(R.id.friday);
        String val5=Utils.sortedToString(values5);
        val5=val5.replace("[","");
        val5=val5.replace("]","");
        text5.setText(val5);

        final Set<String> values6 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText6, getDefaultValues());
        if (values6 == null)
            return;
        final TextView text6 = (TextView) findViewById(R.id.saturday);
        String val6=Utils.sortedToString(values6);
        val6=val6.replace("[","");
        val6=val6.replace("]","");
        text6.setText(val6);

        final Set<String> values7 =
                SharedPreferenceCompat.getStringSet(prefs, mKeyText7, getDefaultValues());
        if (values7 == null)
            return;
        final TextView text7 = (TextView) findViewById(R.id.sunday);
        String val7=Utils.sortedToString(values7);
        val7=val7.replace("[","");
        val7=val7.replace("]","");
        text7.setText(val7);
    }

    private void launchPreferenceActivity() {
        final Intent intent = new Intent(this, MainPreferenceActivity.class);
        startActivity(intent);
    }
}
