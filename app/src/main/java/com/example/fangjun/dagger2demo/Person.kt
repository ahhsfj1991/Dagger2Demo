package com.example.fangjun.dagger2demo

import android.util.Log

/**
 * Created by fangjun on 2017/10/18.
 */
data class Person(var name: String, var age: Int){
    init {
        Log.e("dagger2demo", this.toString())
    }
}