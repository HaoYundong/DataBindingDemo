package com.sample.dbinding.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.BaseObservable;

public class BothWayViewModel extends BaseObservable {

    private MutableLiveData<String> accountNum = new MutableLiveData<>();
    private MutableLiveData<String> password = new MutableLiveData<>();

    public BothWayViewModel(String accountNum, String password){
        this.accountNum.setValue(accountNum);
        this.password.setValue(password);
    }

    public MutableLiveData<String> getAccountNum(){
        return accountNum;
    }

    public MutableLiveData<String> getPassword(){
        return password;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum.setValue(accountNum);
    }

    public void setPassword(String password) {
        this.password.setValue(password);
    }
}
