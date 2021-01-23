package com.example.recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.example.recyclerview.models.Recipe

class RecipeRepository {

    private var instance: RecipeRepository? = null
//    private val mRecipeApiClient: RecipeApiClient? = null
    private val mQuery: String? = null
    private val mPageNumber = 0
    private val mIsQueryExhausted: MutableLiveData<Boolean> = MutableLiveData()
    private val mRecipes: MediatorLiveData<List<Recipe>> = MediatorLiveData()

    fun getInstance(): RecipeRepository? {
        if (instance == null) {
            instance = RecipeRepository()
        }
        return instance
    }

    fun getRecipes(): MediatorLiveData<List<Recipe>> {
        return mRecipes
    }
}