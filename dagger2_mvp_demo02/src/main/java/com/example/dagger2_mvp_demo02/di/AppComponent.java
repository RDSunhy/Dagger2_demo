package com.example.dagger2_mvp_demo02.di;

import android.app.Application;

import com.example.dagger2_mvp_demo02.App;
import com.example.dagger2_mvp_demo02.network.ApiService;
import com.example.dagger2_mvp_demo02.network.ApiServiceModule;
import com.example.dagger2_mvp_demo02.network.HttpModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitiesModule.class,
        AppModule.class,
        HttpModule.class,
        ApiServiceModule.class})
public interface AppComponent {

    //Application injectApp();
    void inject(App application);

    ApiService injectApiService();
}
