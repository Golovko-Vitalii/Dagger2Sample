package com.hfad.dagger2sample.di.components;

import com.hfad.dagger2sample.app.MyApp;
import com.hfad.dagger2sample.di.modules.PresentersModule;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        PresentersModule.class
})

public interface MyAppComponent extends AndroidInjector<MyApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp>{}
}
