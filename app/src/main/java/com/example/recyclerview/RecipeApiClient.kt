package com.example.recyclerview

import androidx.lifecycle.MutableLiveData
import com.example.recyclerview.models.Recipe
import com.example.recyclerview.util.Constants.NETWORK_TIMEOUT
import java.util.concurrent.TimeUnit


//THis is the class that does the heavy lifiting for the
//repository layer

class RecipeApiClient{
    private val TAG = "RecipeApiClient"

    private var instance: RecipeApiClient? = null
    private val mRecipes: MutableLiveData<List<Recipe>>? = null
//    private val mRetrieveRecipesRunnable: com.codingwithmitch.foodrecipes.requests.RecipeApiClient.RetrieveRecipesRunnable? = null
    private val mRecipe: MutableLiveData<Recipe>? = null
//    private val mRetrieveRecipeRunnable:
    private val mRecipeRequestTimeout: MutableLiveData<Boolean> = MutableLiveData()

    fun getInstance(): RecipeApiClient? {
        if (instance == null) {
            instance = RecipeApiClient()
        }
        return instance
    }

    fun searchRecipeApi(){
        val handler= AppExecutors.instance?.networkIO()?.submit(Runnable(){

           //Retrieve data from the rest api
            // mRecipes.postValue()
        })


        // To let user know it has timed out
        AppExecutors.instance?.networkIO()?.schedule({
            handler?.cancel(true)},
            1000,TimeUnit.MILLISECONDS
        )
    }


//    public class RetrieveRecipeReunnable:Runnable(val query: String,
//    val pageNumber:Int, val cancelRequest: Boolean?=false){
//
//        fun Run(){
//
//
//        }
//    }
}