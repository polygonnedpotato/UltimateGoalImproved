package com.qualcomm.ftcrobotcontroller;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.qualcomm.ftcrobotcontroller.ui.main.TestscreenFragment;


public class testscreen extends AppCompatActivity {

    final Context context = this;

    // TODO: Make this actually work.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testscreen_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TestscreenFragment.newInstance())
                    .commitNow();
        }
        Button button = findViewById(R.id.buttonAlert);

    }
}