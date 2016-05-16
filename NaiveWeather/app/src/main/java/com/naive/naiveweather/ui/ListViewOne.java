package com.naive.naiveweather.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class ListViewOne extends BaseView {



    public ListViewOne(Context ctx) {
        super(ctx);


    }

    @Override
    View initView() {
        TextView view =new TextView(ctx);
        view.setText("text1");
        return view;
    }

}
