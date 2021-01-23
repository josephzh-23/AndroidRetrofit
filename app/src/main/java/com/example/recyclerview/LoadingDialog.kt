//package com.example.recyclerview
//
//import android.app.Activity
//import android.app.AlertDialog
//import android.os.Build
//import android.view.LayoutInflater
//import androidx.annotation.RequiresApi
//import kotlin.math.acos
//
//class LoadingDialog (var activity: Activity){
//
//    companion object {
//        lateinit var dialog: AlertDialog
//
//
//        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
//        fun startLoadingDialog() {
//            var builder: AlertDialog.Builder = AlertDialog.Builder(MyApplication.instance)
//
//            val inflater =
//            builder.setView(R.layout.custom_dialog)
//            builder.setCancelable(true)
//            dialog = builder.create()
//
//            dialog.show()
//
//        }
//
//        fun dismissDialog() {
//            dialog.dismiss()
//        }
//    }
//}