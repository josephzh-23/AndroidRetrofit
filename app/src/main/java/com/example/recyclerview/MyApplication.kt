package com.example.recyclerview

import android.app.Application


class MyApplication: Application() {

    //Create a singleton here
    companion object {
        lateinit var instance: MyApplication
        private set
    }

    override fun onCreate() {
        super.onCreate()
        instance= this
    }


}