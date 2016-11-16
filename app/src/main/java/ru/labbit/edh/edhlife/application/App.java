package ru.labbit.edh.edhlife.application;

import android.app.Application;
import android.content.Context;

import ru.labbit.edh.edhlife.dagger.AppComponent;
import ru.labbit.edh.edhlife.dagger.AppModule;
import ru.labbit.edh.edhlife.dagger.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getComponent() {
        return component;
    }

    public static Context getContext() {
        return context;
    }
}
