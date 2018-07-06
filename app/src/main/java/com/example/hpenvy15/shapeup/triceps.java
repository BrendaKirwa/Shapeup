package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
    }

    public void pushupactivitystart(View view) {
        Intent intent = new Intent(this, pushup.class);
        startActivity(intent);
    }

    public void dumbbelactivity(View view) {
        Intent intent = new Intent(this, dumbbell.class);
        startActivity(intent);
    }

    public void benchactivitystart(View view) {
        Intent intent = new Intent(this, benchdip.class);
        startActivity(intent);
    }
}
