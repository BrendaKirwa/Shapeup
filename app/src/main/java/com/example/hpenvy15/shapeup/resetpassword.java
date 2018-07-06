package com.example.hpenvy15.shapeup;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class resetpassword extends AppCompatActivity {
    private Context Context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);
        Context = resetpassword.this;
    }


     //Validate email

    public void onClick(View view, Object editText3) {

        boolean validation = true;
        if ((editText3 != null)) {
            show(getString(R.string.emailrequired));
            validation = false;
        }

        if (editText3 !=("")){
            show(getString(R.string.invalidemai));
            validation = false;
        }

    }

    private void show(String string) {
    }


}
