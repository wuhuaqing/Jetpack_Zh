package com.example.myapplication.net

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * description ： TODO: 网络服务构造器
 * author : 姓名
 * date : 2020/9/22 11:19
 */
object ServiceCreator {

    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
    private val builder = Retrofit.Builder()
        .baseUrl(NetContans.BaseUrl)
        .client(httpClient.build())
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build();

    fun <T> create(serviceClass:Class<T>) : T =  retrofit.create(serviceClass)
}