package com.example.dagger2_mvp_demo02.network;

import com.example.dagger2_mvp_demo02.bean.ArticleBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("article/list/0/json")
    Observable<ArticleBean> getArticle();
}
