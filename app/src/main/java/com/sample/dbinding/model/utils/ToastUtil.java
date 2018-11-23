package com.sample.dbinding.model.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtil {

    public static Context mContext;

    public static void show(String msg) {
        if (mContext == null || TextUtils.isEmpty(msg)) {
            return;
        }

        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    public static void longShow(String msg) {
        if (mContext == null || TextUtils.isEmpty(msg)) {
            return;
        }

        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}