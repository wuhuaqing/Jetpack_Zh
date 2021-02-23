package com.example.myapplication.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import kotlindemo.Sample
import kotlindemo.User
import java.lang.Exception

class KotlinMainActivity : AppCompatActivity() {

    val TAG: String = this::class.java.simpleName
    lateinit var tvContent: TextView
    lateinit var btnFunStr: Button
    lateinit var btnSwitch: Button
    lateinit var btnCollect: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinmain)
        tvContent = findViewById<TextView>(R.id.tvcontent)
        btnFunStr = findViewById<Button>(R.id.btnFunStr)
        btnSwitch = findViewById<Button>(R.id.btnSwitch)
        btnCollect = findViewById<Button>(R.id.btnCollect)

        initView()
    }

    fun initView() {
        btnFunStr.setOnClickListener {  showUserInfo() }
        btnSwitch.setOnClickListener {  showSample() }
        btnCollect.setOnClickListener {  showSample() }

    }

    fun showUserInfo() {
        var user = User("whq", 20, true);
        var str =  user.strTest()
        try {
            user.login("", "", "登录验证：用户名/密码为空，请检查")
        } catch (er: Exception) {
            Log.e(TAG, er.message)
        }
        tvContent.text =  str
    }

    fun showSample() {
        var sample = Sample()
        var num = sample.switchCase(2)
        tvContent.text =  num.toString()
    }
}