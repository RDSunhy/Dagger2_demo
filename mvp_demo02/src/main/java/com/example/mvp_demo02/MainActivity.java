package com.example.mvp_demo02;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvp_demo02.base.BaseActivity;

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {

    TextView textView;

    @Override
    public void onSuccess() {
        Toast.makeText(mContext, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mPresenter = new MainPresenter(this);
        ((MainPresenter)mPresenter).setModel(new MainModel());
        ((MainPresenter)mPresenter).setView(this);
        textView = findViewById(R.id.tvTest);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
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
