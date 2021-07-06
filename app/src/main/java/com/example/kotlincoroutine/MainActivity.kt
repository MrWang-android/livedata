package com.example.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlincoroutine.databinding.ActivityMainBinding
import com.example.kotlincoroutine.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   val  dataBindingUtil =  DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)




        var  activityMainBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.getRoot())


        val myViewModel =
                ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(
                        MyViewModel::class.java
                )
        activityMainBinding.keywordviewmodel = myViewModel
        activityMainBinding.lifecycleOwner = this

        myViewModel.getdata("b0bd56594c1e4870a2c5d869b6d3c61d","baidu.com","战争",false)


    }
}