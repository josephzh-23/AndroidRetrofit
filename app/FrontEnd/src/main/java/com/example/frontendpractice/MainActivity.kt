package com.example.frontendpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(findViewById<FrameLayout>(R.id.fragment_container)!=null){

            if(savedInstanceState!=null){
                return
            }

            var messageFragment= MessageFragment()
            var fragTrans = supportFragmentManager.beginTransaction().add(R.id.fragment_container, null)
        }
    }



}