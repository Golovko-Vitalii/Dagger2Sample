package com.hfad.dagger2sample.ui;

public interface MyContract {
    interface View {
        void onInit();

        void onInitError(String message);

        void changeTextView();

    }

    interface Presenter {

        void onAttachView(View view);

        void onDetachView();

        void onButtonClicked();

    }
}
