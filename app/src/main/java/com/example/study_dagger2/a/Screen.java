package com.example.study_dagger2.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

public class Screen {

    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ScreenScope {
    }

    @Inject
    Screen(){

    }

    public String getName(){
        return "三星";
    }
}
