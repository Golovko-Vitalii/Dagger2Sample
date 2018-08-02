package com.hfad.dagger2sample.di.modules;

import com.hfad.dagger2sample.presenters.MyPresenter;
import com.hfad.dagger2sample.ui.MyContract;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentersModule {

    @Provides
    public MyContract.Presenter provideMyPresenter(MyPresenter presenter){
        return presenter;
    }

}
