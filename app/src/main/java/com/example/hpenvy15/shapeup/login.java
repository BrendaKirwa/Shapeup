package com.example.hpenvy15.shapeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class login extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_SIGNUP = 0;

    private Button loginBtn;
    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);


        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.editTextPassword, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.password);

        loginBtn.setOnClickListener(this);
    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
          }

        }
  @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, discover.class);
        startActivity(intent);
    }

    public void resetActivityStart(View view) {
        Intent intent = new Intent(this, resetpassword.class);
        startActivity(intent);
    }

    public void signupactivitystart(View view) {
        Intent intent = new Intent(getApplicationContext(), signup.class);
        startActivityForResult(intent, REQUEST_SIGNUP);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);


    }
}
