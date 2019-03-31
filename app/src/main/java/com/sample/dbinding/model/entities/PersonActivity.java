package com.sample.dbinding.model.entities;

import android.content.Context;
import android.view.View;

import com.sample.dbinding.databinding.PersonBinding;

public class PersonActivity {

    private PersonBinding binding;

    private Context context;

    private View rootView;

    private View nameView;
    private View ageView;
    private View sexView;

    public void main() {
        Person liuyuting = requestServer();
        binding.setPerson(liuyuting);


    }

    private Person requestServer() {
        return new Person();
    }

//    private void getView() {
//        nameView = rootView.findViewById(....)
//        ageView = rootView.findViewById(....)
//        sexView = rootView.findViewById(....)
//    }
}
