package com.naive.naiveweather.utils.view;

import android.widget.Toast;

import com.naive.naiveweather.app.LIMSApplication;

/**
 * Created by joyin on 16-4-3.
 */
public class ToastUtil {
    private ToastUtil() {

    }

    private static Toast mToast;

    public static void show(int resId) {
        show(LIMSApplication.getInstance().getString(resId));
    }

    public static void show(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(LIMSApplication.getInstance(), msg, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}
