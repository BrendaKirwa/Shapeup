package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    public void addactivitystarts(View view) {
        Intent intent = new Intent(this, addworkout.class);
        startActivity(intent);
    }


    public void armactivitystarts(View view) {
        Intent intent = new Intent(this, triceps.class);
        startActivity(intent);
    }

    public void cardioactivitystarts(View view) {
        Intent intent = new Intent(this, cardio.class);
        startActivity(intent);
    }

    public void legactivitystarts(View view) {
        Intent intent = new Intent(this, thigh.class);
        startActivity(intent);
    }
}
