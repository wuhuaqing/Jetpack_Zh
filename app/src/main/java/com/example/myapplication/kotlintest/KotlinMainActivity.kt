package com.example.myapplication.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication.R
import kotlindemo.User
import java.lang.Exception

class KotlinMainActivity : AppCompatActivity() {

    val TAG: String = this::class.java.simpleName
    lateinit var tvContent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinmain)
        var tvContent = findViewById<TextView>(R.id.tvcontent)
        showUserInfo()
    }

    fun showUserInfo() {
        var user = User("whq", 20, true);
        user.strTest()
        try {
            user.login("", "", "登录验证：用户名/密码为空，请检查")
        } catch (er: Exception) {
            Log.e(TAG, er.message)
        }
    }
}