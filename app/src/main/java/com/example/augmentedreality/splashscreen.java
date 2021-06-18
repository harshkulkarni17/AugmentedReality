package com.example.augmentedreality;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class splashscreen extends AppCompatActivity {

    private Timer splashTimer;
    private static final long DELAY = 7000;
    private boolean scheduled = false;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        context = this;
        splashTimer = new Timer();

        splashTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(context, homescreen.class);
                startActivity(intent);
                finish();
            }
        }, DELAY);

        scheduled = true;

    }
}