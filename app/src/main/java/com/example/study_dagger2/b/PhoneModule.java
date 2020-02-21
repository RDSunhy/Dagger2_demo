package com.example.study_dagger2.b;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class PhoneModule {

    public PhoneModule(){}

    //@Screen.AScreen
    //@Named("ScreenA")
    @Screen.ScreenScope
    @Provides
    Screen providesScreen(){
        return new Screen("三星屏幕");
    }

    //@Screen.BScreen
    //@Named("ScreenB")
    //@Provides
    //Screen providesEndScreen(){ return new Screen("三星背面屏"); }
}
