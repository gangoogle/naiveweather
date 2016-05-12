package com.naive.naiveweather.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.naive.naiveweather.R;
import com.naive.naiveweather.utils.ConstantsUtil;
import com.naive.naiveweather.utils.Logger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private SharedPreferences sp;
    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences(ConstantsUtil.Spname, MODE_PRIVATE);
        if (sp.getBoolean(ConstantsUtil.isFirstStartApp, true) == false) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
            return;
        }
        setContentView(R.layout.activity_main);
        ctx = this;
        Button mBtInHome=(Button)findViewById(R.id.bt_in_home);
        mBtInHome.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_in_home:
                sp.edit().putBoolean(ConstantsUtil.isFirstStartApp, false).commit();
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                break;
            default:

        }
    }
}
