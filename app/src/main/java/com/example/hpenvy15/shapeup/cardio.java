package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
    }

    public void startbikingactivity(View view) {
        Intent intent = new Intent(this, biking.class);
        startActivity(intent);
    }

    public void startrunactivity(View view) {
        Intent intent = new Intent(this, running.class);
        startActivity(intent);
    }

    public void startropeactivity(View view) {
        Intent intent = new Intent(this, sskippingrope.class);
        startActivity(intent);
    }

    public void startaerobicactivity(View view) {
        Intent intent = new Intent(this, aerobics.class);
        startActivity(intent);
    }
}
