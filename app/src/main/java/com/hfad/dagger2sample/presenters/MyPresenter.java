package com.hfad.dagger2sample.presenters;

import com.hfad.dagger2sample.ui.MyContract;
import com.hfad.dagger2sample.ui.MyViewNull;

import javax.inject.Inject;

public class MyPresenter implements MyContract.Presenter {

    private MyContract.View mView;

    @Inject
    public MyPresenter() {
    }

    @Override
    public void onAttachView(MyContract.View view) {
        this.mView = view;
    }

    @Override
    public void onDetachView() {
        this.mView = new MyViewNull();
    }

    @Override
    public void onButtonClicked() {
        mView.changeTextView();
    }
}
