package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication.net.NetClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var tVContent: TextView? = null;

    lateinit var netClient: NetClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tVContent = findViewById<TextView>(R.id.tvcontent)
        netClient = NetClient()

        showData()

    }

      fun showData(){
          GlobalScope.launch {
              var newsData = netClient.getNewsData()
              Log.e("MainActivity","resp:" +  newsData)
              // tVContent!!.text = newsData.date
          }
    }


}