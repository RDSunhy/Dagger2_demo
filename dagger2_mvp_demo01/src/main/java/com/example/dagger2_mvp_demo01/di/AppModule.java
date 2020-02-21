package com.example.dagger2_mvp_demo01.di;

import android.app.Application;

import com.example.dagger2_mvp_demo01.App;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(App application) {
        this.mApplication = application;
    }

    @Provides
    Application providesApplication(){
        return mApplication;
    }
}
