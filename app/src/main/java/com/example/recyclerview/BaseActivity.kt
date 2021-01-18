package com.example.recyclerview


import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


//import com.example.recyclerview.viewModel.BaseViewModel


abstract class BaseActivity<B:ViewDataBinding> : AppCompatActivity() {

    //THis is directly inherited
    lateinit var dataBinding:B
  //  lateinit var baseViewModel:T
    var mProgressBar: ProgressBar? = null

    protected open fun bindView(layoutId: Int) {
        dataBinding = DataBindingUtil.setContentView(this, layoutId)
    }


    override fun onDestroy() {
//        baseViewModel.detachView()
        super.onDestroy()
    }
//    override fun setContentView(layoutResID: Int) {
//        val constraintLayout: ConstraintLayout = layoutInflater.inflate(R.layout.activity_base, null) as ConstraintLayout
//        val frameLayout: FrameLayout = constraintLayout.findViewById(R.id.activity_content)
//        mProgressBar = constraintLayout.findViewById(R.id.progress_bar)
//        layoutInflater.inflate(layoutResID, frameLayout, true)
//        super.setContentView(constraintLayout)
//    }

    //
    fun showProgressBar(visible: Boolean) {
        mProgressBar!!.visibility = if (visible) View.VISIBLE else View.INVISIBLE
    }
}