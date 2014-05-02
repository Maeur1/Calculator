package com.maeur1.calculator;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Mayur on 2/05/2014.
 */
public class Prefs extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
