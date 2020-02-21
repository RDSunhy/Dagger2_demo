package com.example.mvp_demo;

import com.example.mvp_demo.base.BasePresenter;
import com.example.mvp_demo.base.BaseView;

public interface MainContract {

    interface Presenter extends BasePresenter {
        void login();
    }

    interface View extends BaseView<Presenter> {
        void onSuccess();

        void onError();
    }
}
