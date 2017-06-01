package com.clarifai.android.starter.api.v2.activity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import com.clarifai.android.starter.api.v2.R;

public class InfoPopUp extends HomeScreen1{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infopopup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (0.8*width), (int) (0.8*height));

    }

}
