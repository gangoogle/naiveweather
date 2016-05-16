package com.naive.naiveweather.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.naive.naiveweather.R;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class ListViewTwo extends BaseView {


    public ListViewTwo(Context ctx) {
        super(ctx);


    }

    @Override
    View initView() {
        TextView view =new TextView(ctx);
        view.setText("text2");
        return view;
    }


}
