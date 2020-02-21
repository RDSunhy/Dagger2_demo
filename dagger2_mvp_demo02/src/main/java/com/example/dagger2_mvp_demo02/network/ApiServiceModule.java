package com.example.dagger2_mvp_demo02.network;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiServiceModule {

    @Provides
    ApiService injectApiService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}
