package com.example.myapplication

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/15 16:10
 */
class Sample {

    var view : View ?= null

    fun main(){
        Log.e("Kotlin","hello kotlin !")

        view?.setBackgroundColor(Color.RED)
    }
}