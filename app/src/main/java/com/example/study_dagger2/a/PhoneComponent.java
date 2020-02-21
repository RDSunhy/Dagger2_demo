package com.example.study_dagger2.a;

import dagger.Component;

@Screen.ScreenScope
@Component
public interface PhoneComponent {

    void inject(Phone phone);
}
