package com.hfad.dagger2sample.di.modules;

import com.hfad.dagger2sample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract public class ActivitiesModule {

    @ContributesAndroidInjector
    abstract MainActivity provideMainActivity();

}