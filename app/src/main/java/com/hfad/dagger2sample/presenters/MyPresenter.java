package com.hfad.dagger2sample.presenters;

import com.hfad.dagger2sample.ui.BlankContract;
import com.hfad.dagger2sample.ui.BlankViewNull;

public class BlankPresenter implements BlankContract.Presenter {

    private BlankContract.View mView;

    @Override
    public void onAttachView(BlankContract.View view) {
        this.mView = view;
    }

    @Override
    public void onDetachView() {
        this.mView = new BlankViewNull();
    }

    @Override
    public void onButtonClicked() {
        mView.changeTextView();
    }
}
