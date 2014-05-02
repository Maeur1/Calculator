package com.maeur1.calculator;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Mayur on 20/04/14.
 */
public class Menu extends ListActivity{

    String classes[] = {"MainActivity", "TextPlay", "Email", "Camera", "Data", "example5", "example6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    public void onBackPressed() {
        finish();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        try {
        Class ourClass = Class.forName("com.maeur1.calculator." + cheese);
        Intent ourIntent = new Intent(Menu.this, ourClass);
        startActivity(ourIntent);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater blowUp = getMenuInflater();
        blowUp.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutUs:
                startActivity(new Intent("android.intent.action.ABOUT"));
                break;
            case R.id.preferences:
                startActivity(new Intent("android.intent.action.PREFS"));
                break;
            case R.id.exit:
                finish();
                break;
        }
        return false;
    }
}
