package com.hfad.dagger2sample.di.modules;

import com.hfad.dagger2sample.ui.MyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract MyFragment provideMyFragment();
}
