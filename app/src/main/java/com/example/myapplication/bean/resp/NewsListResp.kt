package com.example.myapplication.bean.resp

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/22 11:33
 */
class NewsListResp {
    var date: String = ""
    var stories:List<StoryResp> ?=null
    var top_stories:List<StoryResp> ?=null
    override fun toString(): String {
        return "NewsListResp(date='$date', stories=$stories, top_stories=$top_stories)"
    }
}