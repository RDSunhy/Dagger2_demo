package com.example.dagger2_mvp_demo01.ui;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2_mvp_demo01.R;
import com.example.dagger2_mvp_demo01.base.BaseActivity;
import com.example.dagger2_mvp_demo01.ui.di.DaggerMainComponent;
import com.example.dagger2_mvp_demo01.ui.di.MainModule;


public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {

    TextView textView;

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
        DaggerMainComponent.builder()
                .appComponent(mApplication.getmAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        textView = findViewById(R.id.tvTest);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getArticle();
            }
        });
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        if (this.mPresenter == null){
            mPresenter = presenter;
        }
    }
}
