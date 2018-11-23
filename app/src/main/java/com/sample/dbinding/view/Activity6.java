package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity6Binding;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Activity6Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_6);
        binding.setName("你好");
    }
}
