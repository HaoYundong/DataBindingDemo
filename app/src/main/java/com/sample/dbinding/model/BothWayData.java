package com.sample.dbinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class BothWayData extends BaseObservable {

    public String myData = "";

    @Bindable
    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }
}
