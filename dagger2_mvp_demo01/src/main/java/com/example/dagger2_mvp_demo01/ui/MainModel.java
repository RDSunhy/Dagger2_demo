package com.example.dagger2_mvp_demo01.ui;

import com.example.dagger2_mvp_demo01.bean.ArticleBean;
import com.example.dagger2_mvp_demo01.network.ApiService;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainModel implements MainContract.Model {

    @Inject
    ApiService apiService;

    @Inject
    public MainModel(){

    }

    @Override
    public Observable<ArticleBean> getArticle() {

        return apiService.getArticle()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
