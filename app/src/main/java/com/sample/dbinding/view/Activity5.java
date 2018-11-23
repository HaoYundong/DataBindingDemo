package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity5Binding;
import com.sample.dbinding.model.commoninterface.ClickCallBack;
import com.sample.dbinding.model.utils.ToastUtil;

public class Activity5 extends AppCompatActivity {

    private Activity5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_5);
        binding.setButton1Name("按钮1");
        binding.setButton2Name("按钮2");
        binding.setButton3Name("按钮3");
        binding.setListener(new ClickCallBack() {
            @Override
            public void click1(View v) {
                ToastUtil.show("1");
            }

            @Override
            public void click2(View v) {
                ToastUtil.show("2");
            }

            @Override
            public void cilck3(String s) {
                if (!TextUtils.isEmpty(s)) {
                    ToastUtil.show(s);
                }
            }
        });
    }
}


