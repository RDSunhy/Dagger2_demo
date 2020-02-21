package com.example.dagger2_mvp_demo01.ui.di;

import android.app.Activity;

import com.example.dagger2_mvp_demo01.ui.MainActivity;
import com.example.dagger2_mvp_demo01.ui.MainContract;
import com.example.dagger2_mvp_demo01.ui.MainModel;
import com.example.dagger2_mvp_demo01.ui.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    MainContract.View view;

    public MainModule(MainContract.View view){
        this.view = view;
    }

    @Provides
    MainContract.View providesView(){
        return this.view;
    }

    @Provides
    MainContract.Presenter providesPresenter(MainPresenter presenter){
        return presenter;
    }

    @Provides
    MainContract.Model providesModel(MainModel model){
        return model;
    }

    /*@Provides
    MainContract.Model providesModel(){
        return new MainModel();
    }

    @Provides
    MainContract.Presenter providesPresenter(MainContract.Model model){
        return new MainPresenter(model, view);
    }*/
}
