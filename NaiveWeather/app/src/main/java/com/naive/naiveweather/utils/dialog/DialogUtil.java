package com.naive.naiveweather.utils.dialog;

import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by zgyi on 2016/5/15 0015.
 */
public class DialogUtil {
    private static LoadingDialog loadingDialog;

    public static void showDialog(Context ctx,DialogInterface.OnCancelListener onCancelListener) {
        loadingDialog = new LoadingDialog(ctx,onCancelListener);
        loadingDialog.show();
    }

    public static void closeDialog(Context ctx) {
        loadingDialog.dismiss();
    }

}
