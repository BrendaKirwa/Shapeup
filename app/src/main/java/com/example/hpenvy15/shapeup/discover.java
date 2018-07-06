package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

public class discover extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
    }

    public void workoutstart(View view) {
        Intent intent = new Intent(this, workout.class);
        startActivity(intent);
    }

    public void pastworkoutstart(View view) {
        Intent intent = new Intent(this, pastworkout.class);
        startActivity(intent);
    }

    public void instructorstart(View view) {
        Intent intent = new Intent(this, instructors.class);
        startActivity(intent);
    }

    public void locationstart(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void profileactivitystart(View view) {Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
