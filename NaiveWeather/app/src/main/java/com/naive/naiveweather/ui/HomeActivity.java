package com.naive.naiveweather.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.naive.naiveweather.R;
import com.naive.naiveweather.utils.ConstantsUtil;
import com.naive.naiveweather.utils.Logger;
import com.naive.naiveweather.net.VolleyListenerInterface;
import com.naive.naiveweather.net.VolleyRequestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zgyi on 2016/5/12.
 */
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.bt_testinterface)
    Button mBtTestinterface;
    private Context ctx;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        ctx=this;
        mBtTestinterface.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_testinterface:
                Logger.d("YZG", "测试接口");
                String url = "https://api.heweather.com/x3/citylist?search=allchina&key=" + ConstantsUtil.HEFENG_API_KEY;
                VolleyListenerInterface volleyListenerInterface = new VolleyListenerInterface(this) {
                    @Override
                    public void onMySuccess(String result) {
                        Toast.makeText(ctx, result, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onMyError(VolleyError error) {
                        Toast.makeText(ctx, "erro", Toast.LENGTH_SHORT).show();
                    }
                };
                VolleyRequestUtil.RequestGet(ctx, url, "110", volleyListenerInterface);
                break;
            default:
        }
    }
}

