package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity2Binding;
import com.sample.dbinding.model.User;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Activity2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_2);
        binding.setUser(new User("刘亦非", "女", 30));
    }
}
