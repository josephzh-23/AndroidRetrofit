package com.example.recyclerview.requests

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.recyclerview.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    @RequiresApi(Build.VERSION_CODES.N)
    private val retrofitBuilder: Retrofit.Builder = Retrofit.Builder().baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
    @RequiresApi(Build.VERSION_CODES.N)
    private val retrofit: Retrofit = retrofitBuilder.build()
    val recipeApi:RecipeApi by lazy {
        retrofit.create(RecipeApi::class.java)
    }

//    fun getRecipeApi(): RecipeApi? {
//        return recipeApi
//    }
}
