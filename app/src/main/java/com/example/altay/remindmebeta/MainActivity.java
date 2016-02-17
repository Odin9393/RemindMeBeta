package com.example.altay.remindmebeta;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

/**
 * Created by altay on 2/15/16.
 */
public class MainActivity extends Activity {

    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();

    }
    private void initToolbar(){
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);

    }
}
