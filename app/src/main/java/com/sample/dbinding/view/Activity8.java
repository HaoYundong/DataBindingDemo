package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        CustomBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_8);
        binding.setName("啦啦啦，我是一个小画家");
    }
}
