package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thigh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thigh);
    }

    public void crunchstart(View view) {
        Intent intent = new Intent(this, crunch.class);
        startActivity(intent);
    }

    public void plankstart(View view) {
        Intent intent = new Intent(this, plank.class);
        startActivity(intent);
    }

    public void squatstart(View view) {
        Intent intent = new Intent(this, squats.class);
        startActivity(intent);
    }
}
