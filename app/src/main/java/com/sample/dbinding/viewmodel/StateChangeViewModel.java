package com.sample.dbinding.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.BaseObservable;

public class StateChangeViewModel extends BaseObservable {
    private MutableLiveData<Boolean> isShow = new MutableLiveData<>();
    private MutableLiveData<Integer> num = new MutableLiveData<>();

    public MutableLiveData<Boolean> getIsShow() {
        return isShow;
    }

    public void setIsShow(boolean isShow) {
        this.isShow.setValue(isShow);
    }

    public MutableLiveData<Integer> getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num.setValue(num);
    }

    public void addNum() {
        int newNum = num.getValue() + 1;
        this.num.setValue(newNum);
    }
}
