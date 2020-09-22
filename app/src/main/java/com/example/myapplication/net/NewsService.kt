package com.example.myapplication.net

import com.example.myapplication.bean.resp.NewsListResp
import retrofit2.Call
import retrofit2.http.GET

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/22 11:27
 */
interface NewsService  {
    @GET(NetContans.NewsList)
    fun getNewsList(): Call<NewsListResp>
}