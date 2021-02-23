package kotlindemo

import android.util.Log

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/15 16:17
 */
class Sample {

    var TAG:String  = this::class.java.simpleName

    /**
     * 分支功能
     */
    fun switchCase(x:Int) : Int{
        return   when(x){
            1->{
                Log.e(TAG,"this value is ${x}")
                x
            }
            2->{
                Log.e(TAG,"this value is ${x} ${x*3}")
                x*3
            }
            else ->{
                Log.e(TAG,"this value is no matched")
                x
            }
        }

    }
}