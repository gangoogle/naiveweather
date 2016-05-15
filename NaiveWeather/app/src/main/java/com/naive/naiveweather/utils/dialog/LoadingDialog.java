package com.naive.naiveweather.utils.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.naive.naiveweather.R;

/**
 * Created by joyin on 16-4-4.
 */
public class LoadingDialog extends BaseDialog {

    public LoadingDialog(Context context, DialogInterface.OnCancelListener onCancelListener) {
        super(context,onCancelListener);
    }

    @Override
    protected View getDefaultView(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.dialog_loading, null);

        ImageView icon = (ImageView) v.findViewById(R.id.icon_loading);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.loading_rotate);
        icon.startAnimation(animation);
        return v;
    }
}
