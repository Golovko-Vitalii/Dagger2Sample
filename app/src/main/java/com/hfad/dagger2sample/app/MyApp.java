package com.hfad.dagger2sample.app;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class MyApp extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyAppComponent.builder().create(this);
    }
}
