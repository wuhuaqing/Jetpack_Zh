package kotlindemo

import android.util.Log

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2/23/21 14:24
 */

class User(val name: String, val age: Int) {

    val TAG :String = this::class.java.simpleName

    //构造器与次构造器
    constructor(name: String, age: Int, male: Boolean) : this(name, age) {
        //使用命名函数
        sayHi("whq", ageN = 20)
    }

    //函数简化
    fun area(width: Int, height: Int): Int {
        return width * height;
    }

    fun areaS(width: Int, height: Int): Int = width * height;


    //函数重载 这里的 world 是参数 name 的默认值，当调用该函数时不传参数，就会使用该默认值。
    fun sayHi(world: String = "hi", ageN: Int, heightN: Int = 10) = Log.e(TAG,"enen " + world)
//    sayHi()
//    sayHi("whq")


    //内联函数 实现验证逻辑
    fun login(name: String, password: String, illegalStr: String) {
        fun validate(value: String) {
            if (value.isEmpty()) {
                throw  IllegalArgumentException(illegalStr)
            }
        }

        validate(name)
        validate(password)
    }

    // 验证逻辑的简略写法
    fun loginPlus(name: String, password: String, illegalStr: String) {
        require(name.isNotEmpty()) { illegalStr }//require 是kotlin 的内置函数
        require(password.isNotEmpty()) { illegalStr }
    }


    // 字符串相关

    fun strTest() {
        val nameN = "whq"
        //引用参数
        println("hi $nameN")
        //引用表达式
        println("hi ${nameN.length}")

        val text = """
            hi $name,
            this is kotlin!
        """
        Log.e(TAG,text)

        val textTrim = """
            | hi $name
        | this is kotlin!
        """.trimMargin()
        Log.e(TAG,textTrim)


    }

}
