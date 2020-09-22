package com.example.myapplication.net

/**
 * description ： TODO:类的作用 url api
 * author : 姓名
 * date : 2020/9/22 10:11
 */
object NetContans {

    //知乎日报常用api分析  https://blog.csdn.net/fanpeihua123/article/details/51210499

    //BaseUrl
    val BaseUrl : String  = "https://news-at.zhihu.com/api/4/";

    //新闻列表
   const val NewsList : String  = "news/latest";

    //新闻详情
    val NewsDetail : String  = "news/{id}";
}