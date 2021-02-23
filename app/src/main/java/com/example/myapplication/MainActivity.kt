package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.CoroutineScope.CoroutineScopeActivity
import com.example.myapplication.bean.resp.NewsListResp
import com.example.myapplication.kotlintest.KotlinMainActivity
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

    lateinit var btnScope: TextView;
    lateinit var btnKotlinTest: TextView;

    lateinit var netClient: NetClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnScope = findViewById<Button>(R.id.btnKotlinScope)
        btnKotlinTest = findViewById<Button>(R.id.btnKotlinTest)
        initView()
    }

    fun initView() {
        btnScope.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    CoroutineScopeActivity::class.java
                )
            )
        }
        btnKotlinTest.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    KotlinMainActivity::class.java
                )
            )
        }
    }


}