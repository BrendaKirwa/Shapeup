package com.example.hpenvy15.shapeup;

import android.app.Application;
import android.content.Context;

import com.example.hpenvy15.shapeup.Helper.LocaleHelper;

/**
 * Created by Brenda.
 */

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base,"en"));
    }
}
