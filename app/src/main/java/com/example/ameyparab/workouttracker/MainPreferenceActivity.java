package com.example.ameyparab.workouttracker;

/**
 * Created by Amey Parab on 7/6/2017.
 */

import java.util.Set;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import compat.preference.MultiSelectListPreferenceCompat;

public class MainPreferenceActivity extends PreferenceActivity implements
         Preference.OnPreferenceChangeListener{

    // fields
    private String mOrigSummaryText1,mOrigSummaryText2,mOrigSummaryText3,mOrigSummaryText4,mOrigSummaryText5,mOrigSummaryText6,mOrigSummaryText7;
    private String mKeyText1,mKeyText2,mKeyText3,mKeyText4,mKeyText5,mKeyText6,mKeyText7;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        mKeyText1 = getText(R.string.prefs_key_text).toString();
        final MultiSelectListPreferenceCompat multiselpref1 = (MultiSelectListPreferenceCompat) findPreference(mKeyText1);
        multiselpref1.setOnPreferenceChangeListener(this);
        mOrigSummaryText1 = multiselpref1.getSummary().toString();
        String pref1=makeSummaryText(mOrigSummaryText1, multiselpref1.getValues());
        pref1=pref1.replace("[","");
        pref1=pref1.replace("]","");
        multiselpref1.setSummary(pref1);

        mKeyText2 = "key_text2";
        final MultiSelectListPreferenceCompat multiselpref2 = (MultiSelectListPreferenceCompat) findPreference(mKeyText2);
        multiselpref2.setOnPreferenceChangeListener(this);
        mOrigSummaryText2 = multiselpref2.getSummary().toString();
        String pref2=makeSummaryText(mOrigSummaryText2, multiselpref2.getValues());
        pref2=pref2.replace("[","");
        pref2=pref2.replace("]","");
        multiselpref2.setSummary(pref2);

        mKeyText3 = "key_text3";
        // ex. MultiSelectListPreferenceCompat
        final MultiSelectListPreferenceCompat multiselpref3 = (MultiSelectListPreferenceCompat) findPreference(mKeyText3);
        multiselpref3.setOnPreferenceChangeListener(this);
        mOrigSummaryText3 = multiselpref3.getSummary().toString();
        //mKeyText = mKeyText.replace("[","");
        //mKeyText = mKeyText.replace("]","");
        String pref3=makeSummaryText(mOrigSummaryText3, multiselpref3.getValues());
        pref3=pref3.replace("[","");
        pref3=pref3.replace("]","");
        //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, multiselpref.getValues()));
        multiselpref3.setSummary(pref1);

        mKeyText4 = "key_text4";
        final MultiSelectListPreferenceCompat multiselpref4 = (MultiSelectListPreferenceCompat) findPreference(mKeyText4);
        multiselpref4.setOnPreferenceChangeListener(this);
        mOrigSummaryText4 = multiselpref4.getSummary().toString();
        String pref4=makeSummaryText(mOrigSummaryText4, multiselpref4.getValues());
        pref4=pref4.replace("[","");
        pref4=pref4.replace("]","");
        multiselpref4.setSummary(pref4);

        mKeyText5 = "key_text5";
        final MultiSelectListPreferenceCompat multiselpref5 = (MultiSelectListPreferenceCompat) findPreference(mKeyText5);
        multiselpref5.setOnPreferenceChangeListener(this);
        mOrigSummaryText5 = multiselpref5.getSummary().toString();
        String pref5=makeSummaryText(mOrigSummaryText5, multiselpref5.getValues());
        pref5=pref5.replace("[","");
        pref5=pref5.replace("]","");
        multiselpref5.setSummary(pref5);

        mKeyText6 = "key_text6";
        final MultiSelectListPreferenceCompat multiselpref6 = (MultiSelectListPreferenceCompat) findPreference(mKeyText6);
        multiselpref6.setOnPreferenceChangeListener(this);
        mOrigSummaryText6 = multiselpref6.getSummary().toString();
        String pref6=makeSummaryText(mOrigSummaryText6, multiselpref6.getValues());
        pref6=pref6.replace("[","");
        pref6=pref6.replace("]","");
        multiselpref6.setSummary(pref6);

        mKeyText7 = "key_text7";
        final MultiSelectListPreferenceCompat multiselpref7 = (MultiSelectListPreferenceCompat) findPreference(mKeyText7);
        multiselpref7.setOnPreferenceChangeListener(this);
        mOrigSummaryText7 = multiselpref7.getSummary().toString();
        String pref7=makeSummaryText(mOrigSummaryText7, multiselpref7.getValues());
        pref7=pref7.replace("[","");
        pref7=pref7.replace("]","");
        multiselpref7.setSummary(pref7);

    }

    @SuppressWarnings("unchecked")
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        final String key = preference.getKey();
        if (key.equals(mKeyText2)) {
            final MultiSelectListPreferenceCompat multiselpref2 = (MultiSelectListPreferenceCompat) preference;
            String pref2= makeSummaryText(mOrigSummaryText2, (Set<String>) newValue);
            pref2=pref2.replace("[","");
            pref2=pref2.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref2.setSummary(pref2);
            return true;
        }
        else if(key.equals(mKeyText1)){
            final MultiSelectListPreferenceCompat multiselpref1 = (MultiSelectListPreferenceCompat) preference;
            String pref1= makeSummaryText(mOrigSummaryText1, (Set<String>) newValue);
            pref1=pref1.replace("[","");
            pref1=pref1.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref1.setSummary(pref1);
            return true;
        }
        else if(key.equals(mKeyText3)){
            final MultiSelectListPreferenceCompat multiselpref3 = (MultiSelectListPreferenceCompat) preference;
            String pref3= makeSummaryText(mOrigSummaryText3, (Set<String>) newValue);
            pref3=pref3.replace("[","");
            pref3=pref3.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref3.setSummary(pref3);
            return true;
        }
        else if(key.equals(mKeyText4)){
            final MultiSelectListPreferenceCompat multiselpref4 = (MultiSelectListPreferenceCompat) preference;
            String pref4= makeSummaryText(mOrigSummaryText4, (Set<String>) newValue);
            pref4=pref4.replace("[","");
            pref4=pref4.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref4.setSummary(pref4);
            return true;
        }
        else if(key.equals(mKeyText5)){
            final MultiSelectListPreferenceCompat multiselpref5 = (MultiSelectListPreferenceCompat) preference;
            String pref5= makeSummaryText(mOrigSummaryText5, (Set<String>) newValue);
            pref5=pref5.replace("[","");
            pref5=pref5.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref5.setSummary(pref5);
            return true;
        }
        else if(key.equals(mKeyText6)){
            final MultiSelectListPreferenceCompat multiselpref6 = (MultiSelectListPreferenceCompat) preference;
            String pref6 = makeSummaryText(mOrigSummaryText6, (Set<String>) newValue);
            pref6=pref6.replace("[","");
            pref6=pref6.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref6.setSummary(pref6);
            return true;
        }
        else if(key.equals(mKeyText7)){
            final MultiSelectListPreferenceCompat multiselpref7 = (MultiSelectListPreferenceCompat) preference;
            String pref7= makeSummaryText(mOrigSummaryText7, (Set<String>) newValue);
            pref7=pref7.replace("[","");
            pref7=pref7.replace("]","");
            //multiselpref.setSummary(makeSummaryText(mOrigSummaryText, (Set<String>) newValue));
            multiselpref7.setSummary(pref7);
            return true;
        }
        else {
            return false;
        }
    }

    public static String makeSummaryText(String baseText, Set<String> values) {
        return baseText + " " + Utils.sortedToString(values);
    }
}

