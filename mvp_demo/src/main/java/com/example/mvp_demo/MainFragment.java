package com.example.mvp_demo;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mvp_demo.base.BaseFragment;

public class MainFragment extends BaseFragment<MainContract.Presenter> implements MainContract.View {

    Button bnLogin;

    protected static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initData() {
        bnLogin = mRootView.findViewById(R.id.bnLogin);
        bnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
            }
        });
    }

    @Override
    public void onSuccess() {
        Toast.makeText(mActivity, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        if (mPresenter == null){
            mPresenter = presenter;
        }
    }
}
