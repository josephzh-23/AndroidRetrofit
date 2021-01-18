package com.example.recyclerview

import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.RecyclerViewBasics.MainActivity2
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.requests.ServiceGenerator
import com.example.recyclerview.requests.responses.RecipeSearchResponse
import com.example.recyclerview.util.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity<ActivityMainBinding>(),ProductsAdapter.OnItemClickListener {

    //Use the databinding in BaseActivity
//    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy {
        ProductsAdapter(this)
    }

    fun openAct2(){
        val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
    }
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindView(R.layout.activity_main)
//        showProgressBar(true)

//        baseViewModel = MainActivityViewModel()
//        baseViewModel.attachView(this)


        dataBinding.toActivity2.setOnClickListener({
//            LoadingDialog.startLoadingDialog()
//            openAct2()
        })
        val recycler_view=findViewById<RecyclerView>(R.id.recycler_view)
        val products = listOf(
            Product(
                R.drawable.ic_launcher_background,
                "Dell Inspiron",
                "15.6Inch, Full HD",
                40000.0,
                "4.5"
            ),
            Product(
                R.drawable.ic_launcher_background,
                "Apple Macbook Air",
                "13.3Inch, HD",
                50000.0,
                "4.7"
            ),
            Product(
                R.drawable.ic_launcher_background,
                "Microsoft Surface",
                "13.3Inch, HD",
                50000.0,
                "4.7"
            )
        )

        recycler_view.adapter = adapter
        adapter.addItems(products)

        adapter.listener = { view, item, position ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onItemClick(view: View, position: Int) {
        Log.i("cool", "$position")
    }

    fun testRetroRequest(){

        var recipeApi = ServiceGenerator.recipeApi

        var responseCall: Call<RecipeSearchResponse?>? = recipeApi.searchRecipe(
            Constants.API_KEY,
            "chicken breast",
            "1"
        )

        responseCall?.enqueue(object:Callback<RecipeSearchResponse?>{
            override fun onFailure(call: Call<RecipeSearchResponse?>?, t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<RecipeSearchResponse?>?,
                response: Response<RecipeSearchResponse?>?
            ) {
                TODO("Not yet implemented")
            }

        }

    }

}
