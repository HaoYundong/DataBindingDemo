package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity9Binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Activity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        Activity9Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_9);

        ArrayList<String> list = new ArrayList<>();
        list.add("List_0");
        list.add("List_1");
        binding.setList(list);

        Map<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "40");
        binding.setMap(map);

        String[] arrays = {"array_0", "array_1"};
        binding.setArrays(arrays);
    }
}
