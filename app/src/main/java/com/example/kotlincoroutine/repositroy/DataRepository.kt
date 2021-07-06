package com.example.kotlincoroutine.repositroy

import com.example.kotlincoroutine.bean.KeyWord
import com.yt.lantianstore.net.RetrofitManager

class DataRepository {

    suspend fun getdata(key: String,domain: String,keyword: String,boolean: Boolean):KeyWord{

        return  RetrofitManager.service.getdata(key,domain,keyword)
    }
}