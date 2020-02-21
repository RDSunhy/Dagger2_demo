package com.example.mvp_demo02;


import com.example.mvp_demo02.base.BaseModel;
import com.example.mvp_demo02.base.BasePresenter;
import com.example.mvp_demo02.base.BaseView;

public interface MainContract {

    interface Presenter extends BasePresenter {
        void login();
    }

    interface View extends BaseView<Presenter> {
        void onSuccess();

        void onError();
    }

    interface Model extends BaseModel{
        boolean login();
    }
}
