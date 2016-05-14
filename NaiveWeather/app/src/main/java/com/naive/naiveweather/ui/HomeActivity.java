package com.naive.naiveweather.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.naive.naiveweather.R;
import com.naive.naiveweather.utils.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zgyi on 2016/5/12.
 */
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.bt_testinterface)
    Button mBtTestinterface;
    private Context ctx;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        mBtTestinterface.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_testinterface:
                Logger.d("YZG", "测试接口");
                break;
            default:
        }
    }
}

