package com.sample.dbinding.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sample.dbinding.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] items = {
            "绑定变量",
            "绑定对象",
            "双向绑定？",
            "绑定列表",
            "绑定事件",
            "静态方法转化数据",
            "运算符操作数据",
            "自定义Binding类名",
            "绑定集合数据",
            "与include结合使用"
    };

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv_main);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String className = getPackageName() + ".view.Activity" + (position + 1);
        try {
            Class activityClass = Class.forName(className);
            startActivity(new Intent(this, activityClass));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
