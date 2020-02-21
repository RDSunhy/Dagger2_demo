package com.example.dagger2_mvp_demo02.ui;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2_mvp_demo02.R;
import com.example.dagger2_mvp_demo02.base.BaseActivity;

import javax.inject.Inject;


public class MainActivity extends BaseActivity implements MainContract.View {

    TextView textView;

    @Inject
    MainPresenter mainPresenter;

    @Override
    public void onSuccess() {
        Toast.makeText(mContext, "网络请求成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(mContext, "网络请求失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        //mPresenter = new MainPresenter(this);
        //((MainPresenter)mPresenter).setModel(new MainModel());
        //((MainPresenter)mPresenter).setView(this);
        /*DaggerMainComponent.builder()
                .appComponent(mApplication.getmAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);*/
        textView = findViewById(R.id.tvTest);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getArticle();
            }
        });
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
    }
}
