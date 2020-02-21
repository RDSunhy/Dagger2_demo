package com.example.mvp_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvp_demo.base.BaseActivity;

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
        new MainPresenter(this).load();
        textView = findViewById(R.id.tvTest);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
            }
        });
        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.mainFragment, mainFragment);
            transaction.commit();
        }
        //初始化Presenter
        mPresenter = new MainPresenter(mainFragment);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        if (this.mPresenter == null){
            mPresenter = presenter;
        }
    }
}
