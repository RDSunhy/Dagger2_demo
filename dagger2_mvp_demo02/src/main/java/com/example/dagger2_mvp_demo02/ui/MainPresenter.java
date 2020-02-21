package com.example.dagger2_mvp_demo02.ui;

import com.example.dagger2_mvp_demo02.base.AbsPresenter;
import com.example.dagger2_mvp_demo02.bean.ArticleBean;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainPresenter extends AbsPresenter<MainModel, MainActivity> implements MainContract.Presenter {

    //MainContract.View view;

    /*@Inject
    public MainPresenter(MainContract.Model model,MainContract.View view){
        this.mView = view;
        this.mModel = model;
        //  this.mView.setPresenter(this);
    }*/
    @Inject
    public MainPresenter(MainModel model, MainActivity view){
        this.mView = view;
        this.mModel = model;
        //  this.mView.setPresenter(this);
    }

    @Override
    public void getArticle() {
        mModel.getArticle()
                .subscribe(new Observer<ArticleBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ArticleBean articleBean) {
                        mView.onSuccess();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void load() {

    }

    @Override
    public void onDestory() {

    }

    /*
    @Override
        public void setModel(MainContract.Model mModel) {
            this.mModel = mModel;
        }

        @Override
        public void setView(MainContract.View mView) {
            this.mView = mView;
        }
     */
}
