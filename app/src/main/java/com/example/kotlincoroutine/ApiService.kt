package com.example.kotlincoroutine

import com.example.kotlincoroutine.bean.KeyWord
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {


    //key=申请的key
    //&domain=域名&keyword=关键词
    //top100
    @GET("/single/baidupc/keywordranking")
    suspend fun  getdata(@Query("key")key:String, @Query("domain")domain:String,
                         @Query("keyword")keyword:String):KeyWord
}