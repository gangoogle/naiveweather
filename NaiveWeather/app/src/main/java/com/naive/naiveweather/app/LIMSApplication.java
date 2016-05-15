package com.naive.naiveweather.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by zgyi on 2016/5/15 0015.
 */
public class LIMSApplication extends Application {
    public static RequestQueue volleyQueue;
    private static LIMSApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        /* Volley配置 */
        // 建立Volley的Http请求队列
        volleyQueue = Volley.newRequestQueue(getApplicationContext());
    }

    public static LIMSApplication getInstance() {
        return mInstance;
    }

    // 开放Volley的HTTP请求队列接口
    public static RequestQueue getRequestQueue() {
        return volleyQueue;
    }
}
