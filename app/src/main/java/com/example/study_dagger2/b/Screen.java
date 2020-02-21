package com.example.study_dagger2.b;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Scope;

public class Screen {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AScreen{ }

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BScreen{ }

    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ScreenScope {
    }

    String name;

    Screen(String name){ this.name = name; }

    public String getName(){
        return name;
    }
}
