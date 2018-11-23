package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity10Binding;

public class Activity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        Activity10Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_10);
        binding.setName("我的菜单");
    }
}
