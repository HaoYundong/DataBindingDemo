package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity3Binding;
import com.sample.dbinding.viewmodel.BothWayViewModel;

public class Activity3 extends AppCompatActivity {

    private Activity3Binding binding;
    private BothWayViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_3);
        binding.setLifecycleOwner(this);
        model = new BothWayViewModel("", "");
        binding.setModel(model);
    }

    public void bind(View view) {
        model.setAccountNum("12345");
        model.setPassword("67890");

    }
}
