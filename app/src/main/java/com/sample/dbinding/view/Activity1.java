package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity1Binding;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Activity1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_1);
        binding.setName("赵小明");
        binding.setSex("男人");
    }
}
