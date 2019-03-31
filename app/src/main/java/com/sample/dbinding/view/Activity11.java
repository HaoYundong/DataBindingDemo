package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity11Binding;
import com.sample.dbinding.viewmodel.StateChangeViewModel;

public class Activity11 extends AppCompatActivity {

    private Activity11Binding binding;
    private StateChangeViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_11);
        binding.setLifecycleOwner(this);
        viewModel = new StateChangeViewModel();
        viewModel.setNum(0);
        binding.setModel(viewModel);

        binding.switchActivty11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                viewModel.setIsShow(isChecked);
            }
        });

        binding.tvActivity11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addNum();
            }
        });
    }
}
