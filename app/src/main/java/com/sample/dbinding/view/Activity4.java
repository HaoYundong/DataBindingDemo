package com.sample.dbinding.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.sample.dbinding.R;

public class Activity4 extends AppCompatActivity {

    private Context mContext;
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        mContext = this;
        recyclerView = findViewById(R.id.rv_activity_4);
        adapter = new MyAdapter();
    }

    private class MyHolder extends RecyclerView.ViewHolder {

        public MyHolder(View itemView) {
            super(itemView);
        }

        public void bindData(int position) {
            String name = "菜单" + position;

        }
    }

    private class MyAdapter extends RecyclerView.Adapter<MyHolder> {

        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MyHolder(View.inflate(mContext, R.layout.item_list, null));
        }

        @Override
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

}
