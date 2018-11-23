package com.sample.dbinding.app;

import android.app.Application;

import com.sample.dbinding.model.utils.ToastUtil;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtil.mContext = getApplicationContext();
    }
}
