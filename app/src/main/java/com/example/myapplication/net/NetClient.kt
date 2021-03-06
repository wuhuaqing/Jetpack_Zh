package com.example.myapplication.net

import com.example.myapplication.bean.resp.NewsListResp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
/**
 * description ： TODO: 网络 操作
 * author : 姓名
 * date : 2020/9/22 11:01
 */
class NetClient {

      val newsService =  ServiceCreator.create(NewsService::class.java)

     suspend fun getNewsData() = newsService.getNewsList().await()


    /* suspend fun getNewsDataInfo():Call<NewsListResp> {
     return  withContext(Dispatchers.IO) {
           newsService.getNewsList()//.await()
       }
    } */


    private suspend fun <T> Call<T>.await(): T {
      return suspendCoroutine { continuation ->
            enqueue(object : Callback<T> {
                override fun onFailure(call: Call<T>, t: Throwable) {
                    continuation.resumeWithException(t)
                }

                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()
                    if (body != null) continuation.resume(body)
                    else continuation.resumeWithException(RuntimeException("response body is null"))
                }
            })
        }

    }



}

