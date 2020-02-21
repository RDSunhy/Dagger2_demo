package com.example.dagger2_mvp_demo01.bean;

import java.util.List;

public class ArticleBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12005,"link":"https://mp.weixin.qq.com/s/X58fK02imnNkvUMFt23OAg","niceDate":"15小时前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1582213653000,"selfVisible":0,"shareDate":1582020260000,"shareUser":"鸿洋","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"动态下发 so 库在 Android APK 安装包瘦身方面的应用","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":79,"chapterName":"黑科技","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12012,"link":"https://juejin.im/post/5e4ca12ef265da57375c398d","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213634000,"selfVisible":0,"shareDate":1582125194000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"某宝秒杀助手-思路分享","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":474,"chapterName":"RxJava","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12014,"link":"https://juejin.im/post/5e4c9d45518825496e7847b1","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213622000,"selfVisible":0,"shareDate":1582159208000,"shareUser":"AprilEyon","superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"Android主流三方库源码分析（五、深入理解RxJava源码）","type":0,"userId":3559,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12016,"link":"https://juejin.im/entry/5e4c966ce51d45270f52b742","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213609000,"selfVisible":0,"shareDate":1582170577000,"shareUser":"goweii","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"Android性能优化：我总结了关于内存泄漏的所有知识","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12017,"link":"https://juejin.im/post/5e4e91476fb9a07c8678f627","niceDate":"16小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1582209255000,"selfVisible":0,"shareDate":1582209255000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack之Navigation","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12013,"link":"https://www.jianshu.com/p/559029832a67","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582126797000,"selfVisible":0,"shareDate":1582126797000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"开发者 | WGS84、GCJ-02、BD-09都是什么鬼？","type":0,"userId":30587,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12007,"link":"https://mp.weixin.qq.com/s/WAfIG_TDtSqudWhO0qT1mQ","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1582074741000,"selfVisible":0,"shareDate":1582074741000,"shareUser":"hAndroid","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"听大佬聊聊Kotlin中把码仔玩死的--协程","type":0,"userId":30624,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11994,"link":"https://juejin.im/post/5e49fc29e51d4526d326b056","niceDate":"2020-02-17 10:46","niceShareDate":"2020-02-17 10:46","origin":"","prefix":"","projectLink":"","publishTime":1581907592000,"selfVisible":0,"shareDate":1581907592000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索Android卡顿优化（下）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11990,"link":"https://juejin.im/post/5e3c17876fb9a07cab3a87fe","niceDate":"2020-02-17 10:29","niceShareDate":"2020-02-17 10:24","origin":"","prefix":"","projectLink":"","publishTime":1581906586000,"selfVisible":0,"shareDate":1581906245000,"shareUser":"鸿洋","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"【译】Flutter：图像的爆炸动画:boom:","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11991,"link":"https://juejin.im/post/5e49163e6fb9a07cb96ae33d","niceDate":"2020-02-17 10:29","niceShareDate":"2020-02-17 10:24","origin":"","prefix":"","projectLink":"","publishTime":1581906563000,"selfVisible":0,"shareDate":1581906278000,"shareUser":"鸿洋","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"ViewPager2：打造Banner控件","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11987,"link":"https://juejin.im/post/5e49855be51d4526ca15c417","niceDate":"2020-02-17 09:14","niceShareDate":"2020-02-17 09:14","origin":"","prefix":"","projectLink":"","publishTime":1581902070000,"selfVisible":0,"shareDate":1581902070000,"shareUser":"xuexiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter Plugin插件开发填坑指南","type":0,"userId":42190,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11981,"link":"https://mp.weixin.qq.com/s/Eh-OOqZ_WuKj4fmB_czS_w","niceDate":"2020-02-16 00:00","niceShareDate":"2020-02-16 13:56","origin":"","prefix":"","projectLink":"","publishTime":1581782400000,"selfVisible":0,"shareDate":1581832601000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 后台运行白名单，优雅实现保活","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11980,"link":"https://mp.weixin.qq.com/s/ZW2YnjYJRoiU_f9aPuzx5Q","niceDate":"2020-02-15 00:00","niceShareDate":"2020-02-16 13:56","origin":"","prefix":"","projectLink":"","publishTime":1581696000000,"selfVisible":0,"shareDate":1581832578000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"你要的都给你吧！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11979,"link":"https://mp.weixin.qq.com/s/B9nB2Wr_6lVzvSIGdoOIdA","niceDate":"2020-02-14 00:00","niceShareDate":"2020-02-16 13:55","origin":"","prefix":"","projectLink":"","publishTime":1581609600000,"selfVisible":0,"shareDate":1581832541000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"谁告诉你 Flutter 会干掉原生开发？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11933,"link":"https://juejin.im/post/5e44b3c2e51d4526ec0d2b71","niceDate":"2020-02-13 10:49","niceShareDate":"2020-02-13 10:49","origin":"","prefix":"","projectLink":"","publishTime":1581562159000,"selfVisible":0,"shareDate":1581562159000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android主流三方库源码分析（四、深入理解GreenDao源码）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11964,"link":"https://mp.weixin.qq.com/s/GVGr7s9O53EAB8-6yzPJOQ","niceDate":"2020-02-13 00:00","niceShareDate":"2020-02-16 13:45","origin":"","prefix":"","projectLink":"","publishTime":1581523200000,"selfVisible":0,"shareDate":1581831902000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"为了KPI，对APK进行极限优化！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11970,"link":"https://mp.weixin.qq.com/s/d3cXXyCjzao-UbjV5dj2iw","niceDate":"2020-02-12 00:00","niceShareDate":"2020-02-16 13:50","origin":"","prefix":"","projectLink":"","publishTime":1581436800000,"selfVisible":0,"shareDate":1581832209000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"代码生成器：IDEA 强大的 Live Templates","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11978,"link":"https://mp.weixin.qq.com/s/cVjEeZVZYcjcfQWWyqccAg","niceDate":"2020-02-12 00:00","niceShareDate":"2020-02-16 13:55","origin":"","prefix":"","projectLink":"","publishTime":1581436800000,"selfVisible":0,"shareDate":1581832502000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"你知道App为什么会Crash吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11920,"link":"https://juejin.im/post/5e410c69e51d452704115cf6","niceDate":"2020-02-11 16:26","niceShareDate":"2020-02-11 16:26","origin":"","prefix":"","projectLink":"","publishTime":1581409615000,"selfVisible":0,"shareDate":1581409615000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack之Paging","type":0,"userId":9180,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":400,"size":20,"total":7982}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12005,"link":"https://mp.weixin.qq.com/s/X58fK02imnNkvUMFt23OAg","niceDate":"15小时前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1582213653000,"selfVisible":0,"shareDate":1582020260000,"shareUser":"鸿洋","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"动态下发 so 库在 Android APK 安装包瘦身方面的应用","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":79,"chapterName":"黑科技","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12012,"link":"https://juejin.im/post/5e4ca12ef265da57375c398d","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213634000,"selfVisible":0,"shareDate":1582125194000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"某宝秒杀助手-思路分享","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":474,"chapterName":"RxJava","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12014,"link":"https://juejin.im/post/5e4c9d45518825496e7847b1","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213622000,"selfVisible":0,"shareDate":1582159208000,"shareUser":"AprilEyon","superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"Android主流三方库源码分析（五、深入理解RxJava源码）","type":0,"userId":3559,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12016,"link":"https://juejin.im/entry/5e4c966ce51d45270f52b742","niceDate":"15小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582213609000,"selfVisible":0,"shareDate":1582170577000,"shareUser":"goweii","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"Android性能优化：我总结了关于内存泄漏的所有知识","type":0,"userId":20382,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12017,"link":"https://juejin.im/post/5e4e91476fb9a07c8678f627","niceDate":"16小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1582209255000,"selfVisible":0,"shareDate":1582209255000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack之Navigation","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12013,"link":"https://www.jianshu.com/p/559029832a67","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1582126797000,"selfVisible":0,"shareDate":1582126797000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"开发者 | WGS84、GCJ-02、BD-09都是什么鬼？","type":0,"userId":30587,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12007,"link":"https://mp.weixin.qq.com/s/WAfIG_TDtSqudWhO0qT1mQ","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1582074741000,"selfVisible":0,"shareDate":1582074741000,"shareUser":"hAndroid","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"听大佬聊聊Kotlin中把码仔玩死的--协程","type":0,"userId":30624,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11994,"link":"https://juejin.im/post/5e49fc29e51d4526d326b056","niceDate":"2020-02-17 10:46","niceShareDate":"2020-02-17 10:46","origin":"","prefix":"","projectLink":"","publishTime":1581907592000,"selfVisible":0,"shareDate":1581907592000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索Android卡顿优化（下）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11990,"link":"https://juejin.im/post/5e3c17876fb9a07cab3a87fe","niceDate":"2020-02-17 10:29","niceShareDate":"2020-02-17 10:24","origin":"","prefix":"","projectLink":"","publishTime":1581906586000,"selfVisible":0,"shareDate":1581906245000,"shareUser":"鸿洋","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"【译】Flutter：图像的爆炸动画:boom:","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11991,"link":"https://juejin.im/post/5e49163e6fb9a07cb96ae33d","niceDate":"2020-02-17 10:29","niceShareDate":"2020-02-17 10:24","origin":"","prefix":"","projectLink":"","publishTime":1581906563000,"selfVisible":0,"shareDate":1581906278000,"shareUser":"鸿洋","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"ViewPager2：打造Banner控件","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11987,"link":"https://juejin.im/post/5e49855be51d4526ca15c417","niceDate":"2020-02-17 09:14","niceShareDate":"2020-02-17 09:14","origin":"","prefix":"","projectLink":"","publishTime":1581902070000,"selfVisible":0,"shareDate":1581902070000,"shareUser":"xuexiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter Plugin插件开发填坑指南","type":0,"userId":42190,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11981,"link":"https://mp.weixin.qq.com/s/Eh-OOqZ_WuKj4fmB_czS_w","niceDate":"2020-02-16 00:00","niceShareDate":"2020-02-16 13:56","origin":"","prefix":"","projectLink":"","publishTime":1581782400000,"selfVisible":0,"shareDate":1581832601000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 后台运行白名单，优雅实现保活","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11980,"link":"https://mp.weixin.qq.com/s/ZW2YnjYJRoiU_f9aPuzx5Q","niceDate":"2020-02-15 00:00","niceShareDate":"2020-02-16 13:56","origin":"","prefix":"","projectLink":"","publishTime":1581696000000,"selfVisible":0,"shareDate":1581832578000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"你要的都给你吧！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11979,"link":"https://mp.weixin.qq.com/s/B9nB2Wr_6lVzvSIGdoOIdA","niceDate":"2020-02-14 00:00","niceShareDate":"2020-02-16 13:55","origin":"","prefix":"","projectLink":"","publishTime":1581609600000,"selfVisible":0,"shareDate":1581832541000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"谁告诉你 Flutter 会干掉原生开发？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11933,"link":"https://juejin.im/post/5e44b3c2e51d4526ec0d2b71","niceDate":"2020-02-13 10:49","niceShareDate":"2020-02-13 10:49","origin":"","prefix":"","projectLink":"","publishTime":1581562159000,"selfVisible":0,"shareDate":1581562159000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android主流三方库源码分析（四、深入理解GreenDao源码）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11964,"link":"https://mp.weixin.qq.com/s/GVGr7s9O53EAB8-6yzPJOQ","niceDate":"2020-02-13 00:00","niceShareDate":"2020-02-16 13:45","origin":"","prefix":"","projectLink":"","publishTime":1581523200000,"selfVisible":0,"shareDate":1581831902000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"为了KPI，对APK进行极限优化！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11970,"link":"https://mp.weixin.qq.com/s/d3cXXyCjzao-UbjV5dj2iw","niceDate":"2020-02-12 00:00","niceShareDate":"2020-02-16 13:50","origin":"","prefix":"","projectLink":"","publishTime":1581436800000,"selfVisible":0,"shareDate":1581832209000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"代码生成器：IDEA 强大的 Live Templates","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11978,"link":"https://mp.weixin.qq.com/s/cVjEeZVZYcjcfQWWyqccAg","niceDate":"2020-02-12 00:00","niceShareDate":"2020-02-16 13:55","origin":"","prefix":"","projectLink":"","publishTime":1581436800000,"selfVisible":0,"shareDate":1581832502000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"你知道App为什么会Crash吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":11920,"link":"https://juejin.im/post/5e410c69e51d452704115cf6","niceDate":"2020-02-11 16:26","niceShareDate":"2020-02-11 16:26","origin":"","prefix":"","projectLink":"","publishTime":1581409615000,"selfVisible":0,"shareDate":1581409615000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack之Paging","type":0,"userId":9180,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 400
         * size : 20
         * total : 7982
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 510
             * chapterName : 大厂分享
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 12005
             * link : https://mp.weixin.qq.com/s/X58fK02imnNkvUMFt23OAg
             * niceDate : 15小时前
             * niceShareDate : 2天前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1582213653000
             * selfVisible : 0
             * shareDate : 1582020260000
             * shareUser : 鸿洋
             * superChapterId : 510
             * superChapterName : 大厂对外分享
             * tags : []
             * title : 动态下发 so 库在 Android APK 安装包瘦身方面的应用
             * type : 0
             * userId : 2
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
