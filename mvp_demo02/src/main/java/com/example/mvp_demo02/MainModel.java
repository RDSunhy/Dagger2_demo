package com.example.mvp_demo02;

import com.example.mvp_demo02.base.BaseModel;

public class MainModel implements MainContract.Model {
    //用线程休眠来模拟耗时登陆
    @Override
    public boolean login() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
