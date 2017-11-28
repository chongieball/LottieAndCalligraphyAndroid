package com.example.chongieball.lottieandcalligraphydemo;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by chongieball on 28/11/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
        .setDefaultFontPath("fonts/MuseoSans-700.ttf")
        .setFontAttrId(R.attr.fontPath)
        .build());
    }
}
