package com.example.hpenvy15.shapeup;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.hpenvy15.shapeup.Helper.LocaleHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase,"en"));

    }
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (Button) findViewById(R.id.RegisterBtn);
         button = (Button) findViewById(R.id.button3);

        Paper.init(this);
        String language =Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");

        updateView ((String)Paper.book().read("language"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.language_en)
        {
            Paper.book().write("language","en");
            updateView ((String)Paper.book().read("language"));
        }
        else if(item.getItemId() == R.id.language_sw)
        {
            Paper.book().write("language","sw");
            updateView ((String)Paper.book().read("language"));
        }
       else if( item.getItemId() == R.id.language_fr)
        {
            Paper.book().write("language","fr");
            updateView ((String)Paper.book().read("language"));
        } else if( item.getItemId() == R.id.language_zh)
        {
            Paper.book().write("language","zh");
            updateView ((String)Paper.book().read("language"));
        }
        return true;
    }


    private void updateView(String lang) {
        Context context =LocaleHelper.setLocale(this,lang);
        Resources resources =context.getResources();

        button.setText(resources.getString(R.string.signup));
        button.setText(resources.getString(R.string.log_In));




    }

    public void LoginActivityStart(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void SignInActivityStart(View view) {
        Intent intent2 = new Intent(this, signup.class);
        startActivity(intent2);
    }
}

