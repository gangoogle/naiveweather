package com.naive.naiveweather.ui;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.naive.naiveweather.R;
import com.naive.naiveweather.utils.CommonUtils;
import com.naive.naiveweather.utils.Logger;

/**
 * Created by zgyi on 2016/5/13.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusColor();
        Logger.d("YZG","BaseOncreate");
    }

    public void setContentV(int  viewId){
        View view =View.inflate(this,viewId,null);
        view.setPadding(0, CommonUtils.getStatusBarHeight(this),0,0);
        setContentView(view);
    }



    /**
     * 设置沉浸式状态栏
     */
    public void  setStatusColor(){
       int color= CommonUtils.getCustomColor(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color);
        }
    };

}
