package com.example.kotlincoroutine.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlincoroutine.bean.KeyWord
import com.example.kotlincoroutine.repositroy.DataRepository
import kotlinx.coroutines.launch

class MyViewModel :ViewModel() {

    val keyWordviewmodel = MutableLiveData<KeyWord>()

    val dataRepository by lazy {
        DataRepository()
    }


    fun getdata(key: String,domain: String,keyword: String,boolean: Boolean){

        viewModelScope.launch {
            keyWordviewmodel.value =  dataRepository.getdata(key,domain, keyword, boolean)
        }

    }

}