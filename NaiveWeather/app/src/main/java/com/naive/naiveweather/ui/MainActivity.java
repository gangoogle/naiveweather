package com.naive.naiveweather.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.naive.naiveweather.R;
import com.naive.naiveweather.utils.CommonUtils;
import com.naive.naiveweather.utils.ConstantsUtil;
import com.naive.naiveweather.utils.Logger;

import net.margaritov.preference.colorpicker.ColorPickerDialog;

import java.net.HttpURLConnection;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements View.OnClickListener ,ColorPickerDialog.OnColorChangedListener {
    @BindView(R.id.tv_welecome)
    TextView mTvWelecome;
    @BindView(R.id.bt_in_home)
    Button mBtInHome;
    @BindView(R.id.bt_choose_color)
    Button mBtChooseColor;
    private SharedPreferences sp;
    private Context ctx;

    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        sp = getSharedPreferences(ConstantsUtil.Spname, MODE_PRIVATE);
        if (sp.getBoolean(ConstantsUtil.isFirstStartApp, true) == false) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
            return;
        }
        setContentV(R.layout.activity_main);
        ButterKnife.bind(this);
        ctx = this;
        mBtInHome.setOnClickListener(this);
        mBtChooseColor.setBackgroundColor(CommonUtils.getCustomColor(ctx));
        mBtChooseColor.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_in_home:
                sp.edit().putBoolean(ConstantsUtil.isFirstStartApp, false).commit();
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                break;
            case R.id.bt_choose_color:
                ColorPickerDialog mDialog = new ColorPickerDialog(ctx, 0xff333333);
                mDialog.setTitle("选择主题颜色!");
                mDialog.setOnColorChangedListener(this);
                mDialog.setAlphaSliderVisible(true);
                mDialog.setHexValueEnabled(true);
                mDialog.show();
                break;
            default:

        }
    }

    @Override
    public void onColorChanged(int color) {
        Logger.d("YZG","CUSTOMER:"+color);
        mBtChooseColor.setBackgroundColor(color);
        CommonUtils.setCustomColor(color,ctx);
        setStatusColor();
    }
}
