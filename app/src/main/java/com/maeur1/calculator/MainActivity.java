package com.maeur1.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    int counter;
    Button add, sub, div, mult;
    TextView display;
    EditText factor;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        factor = (EditText) findViewById(R.id.etNum);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (factor.getText().toString().contentEquals("")) {
                    display.setText("No Factor");
                } else {
                    int check = Integer.parseInt(factor.getText().toString());
                    counter = counter + check;
                    display.setText("Your total is " + counter);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (factor.getText().toString().contentEquals("")) {
                    display.setText("No Factor");
                } else {
                    int check = Integer.parseInt(factor.getText().toString());
                    counter = counter - check;
                    display.setText("Your total is " + counter);
                }
            }
        });
    }
}
