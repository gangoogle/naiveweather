package com.naive.naiveweather.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.naive.naiveweather.R;

import net.margaritov.preference.colorpicker.ColorPickerDialog;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zgyi on 2016/5/12.
 */
public class HomeActivity extends AppCompatActivity  {
    private Context ctx;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

    }


}

