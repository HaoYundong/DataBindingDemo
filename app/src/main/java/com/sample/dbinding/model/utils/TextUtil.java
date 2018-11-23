package com.sample.dbinding.model.utils;

import android.text.TextUtils;

public class TextUtil {

    public static String formatText(String text) {
        if (TextUtils.isEmpty(text)) {
            text = "";
        }

        return "哈哈哈哈，" + text;
    }

}
