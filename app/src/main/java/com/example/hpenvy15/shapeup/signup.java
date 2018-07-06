package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;


public class signup extends AppCompatActivity implements View.OnClickListener {


    private Button RegisterBtn;
    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);


        EditText username = (EditText) findViewById(R.id.username);
        EditText userEmail = (EditText) findViewById(R.id.userEmail);
        EditText userPassword = (EditText) findViewById(R.id.userPassword);

        Button RegisterBtn = (Button) findViewById(R.id.RegisterBtn);

        awesomeValidation.addValidation(this, R.id.username, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.userEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.userPassword, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.password);

        RegisterBtn.setOnClickListener(this);

    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_LONG).show();
        }

    }

    public void onClick(View view) {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);

        }
    }

