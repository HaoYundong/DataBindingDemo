package com.sample.dbinding.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sample.dbinding.R;
import com.sample.dbinding.databinding.Activity4Binding;
import com.sample.dbinding.databinding.ItemListBinding;

public class Activity4 extends AppCompatActivity {

    private Activity4Binding binding;

    private Context mContext;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        mContext = this;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_4);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rvActivity4.setLayoutManager(layoutManager);

        adapter = new MyAdapter();
        binding.rvActivity4.setAdapter(adapter);
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ItemListBinding binding;

        public MyHolder(ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindData(int position) {
            binding.setName("菜单" + position);
        }
    }

    private class MyAdapter extends RecyclerView.Adapter<MyHolder> {

        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ItemListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_list, parent, false);
            return new MyHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            holder.bindData(position);
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

}
