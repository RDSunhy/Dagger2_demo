package com.example.dagger2_mvp_demo02.di;


import com.example.dagger2_mvp_demo02.ui.MainActivity;
import com.example.dagger2_mvp_demo02.ui.MainModel;
import com.example.dagger2_mvp_demo02.ui.di.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AllActivitiesModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivityInjector();


}
