package com.example.note_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpActivity extends AppCompatActivity {
int SPLASH_TIMER =5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        Handler handler= new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(SpActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIMER);
    }
}