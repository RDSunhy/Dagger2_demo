package com.example.dagger2_mvp_demo01.ui;

import com.example.dagger2_mvp_demo01.base.BaseModel;
import com.example.dagger2_mvp_demo01.base.BasePresenter;
import com.example.dagger2_mvp_demo01.base.BaseView;
import com.example.dagger2_mvp_demo01.bean.ArticleBean;

import io.reactivex.Observable;

public interface MainContract {

    interface Presenter extends BasePresenter {
        void getArticle();
    }

    interface View extends BaseView<Presenter> {
        void onSuccess();

        void onError();
    }

    interface Model extends BaseModel {
        Observable<ArticleBean> getArticle();
    }
}
