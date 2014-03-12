package com.google.testing.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.testing.R;

import android.content.Intent;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("URL", "http://www.lopez-manas.com");
                startActivity(intent);
            }
        });
    }

}
