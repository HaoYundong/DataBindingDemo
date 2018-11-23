package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity2Binding;
import com.sample.dbinding.viewmodel.UserViewModel;

public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_2);
    }

    public void bind(View view) {
        binding.setUser(new UserViewModel("刘亦非", "女", 30));
    }
}
