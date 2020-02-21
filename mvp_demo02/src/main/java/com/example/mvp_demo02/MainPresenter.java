package com.example.mvp_demo02;

import com.example.mvp_demo02.base.AbsPresenter;

public class MainPresenter extends AbsPresenter<MainContract.Model, MainContract.View> implements MainContract.Presenter {

    MainContract.View view;

    MainPresenter(MainContract.View view){
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void login() {
        if (mModel.login()){
            view.onSuccess();
        }
    }

    @Override
    public void load() {

    }

    @Override
    public void onDestory() {

    }

    @Override
    public void setModel(MainContract.Model mModel) {
        this.mModel = mModel;
    }

    @Override
    public void setView(MainContract.View mView) {
        this.mView = mView;
    }
}
