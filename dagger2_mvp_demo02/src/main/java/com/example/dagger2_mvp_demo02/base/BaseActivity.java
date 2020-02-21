package com.example.dagger2_mvp_demo02.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2_mvp_demo02.App;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity{


    protected Context mContext;
    protected App mApplication;

    //@Inject
    //protected P mPresenter;

    protected abstract int setLayoutId();

    protected abstract void initData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(setLayoutId());
        mContext = this;
        mApplication = (App) getApplication();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
