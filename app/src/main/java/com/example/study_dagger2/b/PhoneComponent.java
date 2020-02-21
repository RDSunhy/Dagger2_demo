package com.example.study_dagger2.b;



import dagger.Component;

@Screen.ScreenScope
@Component(modules = PhoneModule.class)
public interface PhoneComponent {

    void inject(Phone phone);

}
