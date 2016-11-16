package ru.labbit.edh.edhlife.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ru.labbit.edh.edhlife.activity.MainActivity;
import ru.labbit.edh.edhlife.controller.Controller;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);

    Controller controller();
}