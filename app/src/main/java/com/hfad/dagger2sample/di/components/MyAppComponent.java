package com.hfad.dagger2sample.di.components;

import com.hfad.dagger2sample.app.MyApp;
import com.hfad.dagger2sample.di.modules.ActivitiesModule;
import com.hfad.dagger2sample.di.modules.FragmentsModule;
import com.hfad.dagger2sample.di.modules.MyAppModule;
import com.hfad.dagger2sample.di.modules.PresentersModule;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        PresentersModule.class,
        FragmentsModule.class,
        MyAppModule.class,
        ActivitiesModule.class,
        AndroidSupportInjectionModule.class
})

public interface MyAppComponent extends AndroidInjector<MyApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp>{}
}
