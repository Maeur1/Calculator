package com.maeur1.calculator;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Mayur on 20/04/14.
 */
public class Menu extends ListActivity{

    String classes[] = {"MainActivity", "example1", "example2", "example3", "example4", "example5", "example6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
