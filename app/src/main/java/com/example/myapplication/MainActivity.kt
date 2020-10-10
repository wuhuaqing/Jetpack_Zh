package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication.bean.resp.NewsListResp
import com.example.myapplication.net.NetClient
import com.example.myapplication.net.NewsService
import com.example.myapplication.net.ServiceCreator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var tVContent: TextView? = null;

    lateinit var netClient: NetClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tVContent = findViewById<TextView>(R.id.tvcontent)
        netClient = NetClient()

        //showData()
        showDataInfo()


    }

    fun showData() {
        GlobalScope.launch(Dispatchers.Main) {
            var newsData =   netClient.getNewsData()
            Log.e("MainActivity", "resp:" + newsData.toString())
            tVContent!!.text = newsData.toString()
        }


    }
    fun showDataInfo() {
       val newsService =  ServiceCreator.create(NewsService::class.java)
        GlobalScope.launch(Dispatchers.Main) {
            try {
             //   var newsListKt: NewsListResp= newsService.getNewsListKt()
              val asyResp =   async { newsService.getNewsListKt() }
                tVContent!!.text = asyResp.await().date
            }catch (e:Exception){
                tVContent!!.text = e.message
            }
        }

        /* GlobalScope.launch(Dispatchers.Main) {

           var newsData: NewsListResp = netClient.getNewsData()
            Log.e("MainActivity", "resp:" + newsData)
            newsData.enqueue(object : Callback<NewsListResp> {
                override fun onFailure(call: Call<NewsListResp>, t: Throwable) {
                    TODO("Not yet implemented")
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(call: Call<NewsListResp>, response: Response<NewsListResp>) {
                    TODO("Not yet implemented")
                     var newsListResp  = response.body()
                    Log.e("onResponse: ", newsListResp.toString())

                }


            })

        }*/


    }





}