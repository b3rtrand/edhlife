package ru.labbit.edh.edhlife.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.labbit.edh.edhlife.controller.Controller;

@Module
public class AppModule {
    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Controller provideController() {
        return new Controller();
    }
}