package com.example.mvp_demo;

import android.util.Log;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;

    MainPresenter(MainContract.View view){
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void login() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        view.onSuccess();
    }

    @Override
    public void load() {

    }

    @Override
    public void onDestory() {

    }
}
