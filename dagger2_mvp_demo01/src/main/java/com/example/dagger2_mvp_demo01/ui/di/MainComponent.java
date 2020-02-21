package com.example.dagger2_mvp_demo01.ui.di;

import com.example.dagger2_mvp_demo01.di.AppComponent;
import com.example.dagger2_mvp_demo01.ui.MainActivity;

import dagger.Component;

@Component(modules = MainModule.class, dependencies = AppComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
