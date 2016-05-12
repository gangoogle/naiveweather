package com.naive.naiveweather.utils;

import android.util.Log;

/**
 * Util class 4 printing log.
 * Created by hang.zhao on 2015/12/15.
 */
public class Logger {

    private final static int VERBOSE = 5;
    private final static int DEBUG = 4;
    private final static int INFO = 3;
    private final static int WARN = 2;
    private final static int ERROR = 1;
    private final static int J = 4;

    public static int v(String tag, String msg) {
        if (J >= VERBOSE) {
            return Log.v(tag, msg);
        }
        return 0;
    }

    public static int d(String tag, String msg) {
        if (J >= DEBUG) {
            return Log.d(tag, msg);
        }
        return 0;
    }

    public static int i(String tag, String msg) {
        if (J >= INFO) {
            return Log.i(tag, msg);
        }
        return 0;
    }

    public static int w(String tag, String msg) {
        if (J >= WARN) {
            return Log.w(tag, msg);
        }
        return 0;
    }

    public static int e(String tag, String msg) {
        if (J >= ERROR) {
            return Log.e(tag, msg);
        }
        return 0;
    }

    public static int e(String tag, String msg, Throwable tr) {
        if (J >= ERROR) {
            return Log.e(tag, msg, tr);
        }
        return 0;
    }
}
