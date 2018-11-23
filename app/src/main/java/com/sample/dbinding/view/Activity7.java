package com.sample.dbinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity7Binding;

/**
 DataBinding支持的表达式有：
 数学表达式： + - / * %
 字符串拼接 +
 逻辑表达式 && ||
 位操作符 & | ^
 一元操作符 + - ! ~
 位移操作符 >> >>> <<
 比较操作符 == > < >= <=
 instanceof
 分组操作符 ()
 字面量 - character, String, numeric, null
 强转、方法调用
 字段访问
 数组访问 []
 三元操作符 ?:
 聚合判断（Null Coalescing Operator）语法 ‘??’
 */

public class Activity7 extends AppCompatActivity {

    private Activity7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_7);
        binding.setIsVisible(true);

        binding.setListener1(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.setIsVisible(true);
            }
        });

        binding.setListener2(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.setIsVisible(false);
            }
        });
    }
}
