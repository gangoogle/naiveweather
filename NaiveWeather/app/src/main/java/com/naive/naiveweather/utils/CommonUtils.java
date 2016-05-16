package com.naive.naiveweather.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zgyi on 2016/5/13.
 */
public class CommonUtils {

    /**
     * 获取状态栏高度
     */
    public static int getStatusBarHeight(Context ctx) {
        int result = 0;
        int resourceid = ctx.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceid > 0) {
            result = ctx.getResources().getDimensionPixelSize(resourceid);
        }
        return result;

    }

    /**
     * 存储用户保存的颜色
     *
     * @param color
     * @param ctx
     */
    public static void setCustomColor(int color, Context ctx) {
        SharedPreferences sp = sp = ctx.getSharedPreferences(ConstantsUtil.Spname, ctx.MODE_PRIVATE);
        sp.edit().putInt(ConstantsUtil.CUSTOMCOLOR, color).commit();
    }

    /**
     * 取出用户保存的颜色
     */
    public static int getCustomColor(Context ctx) {
        SharedPreferences sp = sp = ctx.getSharedPreferences(ConstantsUtil.Spname, ctx.MODE_PRIVATE);
        int color = sp.getInt(ConstantsUtil.CUSTOMCOLOR, -14518833);
        return color;
    }



}
