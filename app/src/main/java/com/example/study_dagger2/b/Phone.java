package com.example.study_dagger2.b;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

public class Phone {

    //当需要注入两个对象时，就需要用到自定义注解来区分
    //@Screen.AScreen
    //@Named("ScreenA")
    @Inject//表示这个变量 Dagger需要给它提供依赖
    Screen screen;

    //@Screen.BScreen
    //@Named("ScreenB")
    @Inject
    Screen endScreen;

    public Phone(){

    }

    public Screen getScreen(){
        return this.screen;
    }

    public Screen getEndScreen() {
        return endScreen;
    }

    public static void main(String[] args) {
        //编译时生成
        //修改这里
        Phone phone = new Phone();
        DaggerPhoneComponent.builder().phoneModule(new PhoneModule())
                .build().inject(phone);
        System.out.println("Phone："+phone.getScreen().getName());
        System.out.println("背屏："+phone.getEndScreen().getName());
    }
}
