package com.maeur1.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by Mayur on 21/04/14.
 */
public class TextPlay extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        Button checkCmd = (Button) findViewById(R.id.bResults);
        ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
        EditText input = (EditText) findViewById(R.id.etCommands);
        TextView display = (TextView) findViewById(R.id.tvResults);
    }
}
