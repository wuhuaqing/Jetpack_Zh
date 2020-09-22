package com.example.myapplication.bean.resp

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/22 11:35
 */
class StoryResp {

    var  image_hue :String ?=null //: "0x49499b",
    var  title :String ?=null //: "人类可以凭空想象出并不存在的颜色吗？",
    var  url  :String ?=null // "https://daily.zhihu.com/story/9728160",
    var  hint  :String ?=null // "卜仆 · 2 分钟阅读",
    var ga_prefix  :String ?=null // "092207",
    var  images: List<String>?= null  // [ var"https://picb.zhimg.com/v2-4497d2a4e1141226c0e52abb40ea2e1c.jpg?source=8673f162"],
    var  type : Int = 0
    var  id : Int = 0 // 9728160
}