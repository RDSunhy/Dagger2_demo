package com.example.dagger2_mvp_demo02;

import android.app.Activity;
import android.app.Application;

import com.example.dagger2_mvp_demo02.di.AppComponent;
import com.example.dagger2_mvp_demo02.di.AppModule;
import com.example.dagger2_mvp_demo02.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    AppComponent mAppComponent;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
        //初始化一个AppComponent
        /*mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();*/
    }

    public AppComponent getmAppComponent(){
        return mAppComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
