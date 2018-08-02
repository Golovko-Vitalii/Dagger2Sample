package com.hfad.dagger2sample.di.modules;

import android.content.Context;

import com.hfad.dagger2sample.app.MyApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
abstract public class MyAppModule {

    @Provides
    @Singleton
    public static Context context(MyApp app) {
        return app.getApplicationContext();
    }

}
