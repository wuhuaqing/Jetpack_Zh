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

class Demo {

    fun main() {
        var sample: Sample = User("whq");
        if (sample is User) { //多态 类型判断，
            sample.testMethod(); //调用子类方法，无需显示强转
        }
        // 强转使用
        (sample as User).testMethod();

        //防止强转异常 报错   强转异常后，实例为空，避免空指针
        (sample as? User)?.testMethod();

    }
}


abstract class Sample {
    //可变变量
    var str: String = "whw";

    //不可变量
    val number: Int = 0;

    //延迟初始化
    lateinit var sample: Sample;

    fun main() {
        Log.e("Kotlin", "hello kotlin !")
        testLaug(str)
    }

    abstract fun testLaug(str: String)
}

//类如可被继承，需加open字符
open class User constructor(name: String) : Sample() {

    var name = "Mike"
        get() {
            return field + " nb"
        }
        set(value) {
            field = "Cute " + value
        }

    override fun testLaug(str: String) {
        TODO("Not yet implemented")
        print(str)
    }

    fun testMethod() {

    }
}

class People constructor() : User("hh") {

}

