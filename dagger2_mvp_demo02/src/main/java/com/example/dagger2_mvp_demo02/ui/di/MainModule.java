package com.example.dagger2_mvp_demo02.ui.di;

import com.example.dagger2_mvp_demo02.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    static String providesName(){
        return MainActivity.class.getName();
    }

    /*MainContract.View view;

    public MainModule(MainContract.View view){
        this.view = view;
    }

    @Provides
    MainContract.View providesView(){
        return this.view;
    }

    *//*@Provides
    MainContract.Presenter providesPresenter(MainPresenter presenter){
        return presenter;
    }

    @Provides
    MainContract.Model providesModel(MainModel model){
        return model;
    }*//*

    @Provides
    MainContract.Model providesModel(){
        return new MainModel();
    }

    @Provides
    MainContract.Presenter providesPresenter(MainContract.Model model){
        return new MainPresenter(model, view);
    }*/
}
