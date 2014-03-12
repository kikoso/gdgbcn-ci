package com.google.testing.activities;

import android.app.Activity;
import android.os.Bundle;

import com.google.testing.R;

/**
 * Created by Enrique López-Mañas on 08/03/14.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }
}
