package com.example.dagger2_mvp_demo01;

import android.app.Application;

import com.example.dagger2_mvp_demo01.di.AppComponent;
import com.example.dagger2_mvp_demo01.di.AppModule;
import com.example.dagger2_mvp_demo01.di.DaggerAppComponent;

public class App extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化一个AppComponent
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getmAppComponent(){
        return mAppComponent;
    }
}
