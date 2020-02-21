package com.example.study_dagger2.a;

import javax.inject.Inject;

public class Phone {

    @Inject//表示这个变量 Dagger需要给它提供依赖
    Screen screen1;
    @Inject//表示这个变量 Dagger需要给它提供依赖
    Screen screen2;

    public Phone(){
        //编译时生成的类
        DaggerPhoneComponent.builder().build().inject(this);
    }

    public Screen getScreen1(){
        return this.screen1;
    }

    public Screen getScreen2(){
        return this.screen2;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Phone -- 正面屏："+phone.getScreen1().getName());
        System.out.println("Phone -- 背面屏："+phone.getScreen2().getName());
    }
}
