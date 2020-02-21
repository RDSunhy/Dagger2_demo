package com.example.dagger2_mvp_demo01.di;

import android.app.Application;

import com.example.dagger2_mvp_demo01.network.ApiService;
import com.example.dagger2_mvp_demo01.network.ApiServiceModule;
import com.example.dagger2_mvp_demo01.network.HttpModule;

import dagger.Component;

@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class})
public interface AppComponent {

    Application injectApp();

    ApiService injectApiService();
}
