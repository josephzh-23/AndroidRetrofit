package com.example.recyclerview.viewModel

import androidx.lifecycle.LiveData
import com.example.recyclerview.RecipeRepository
import com.example.recyclerview.models.Recipe

class RecipeListViewModel(val repo: RecipeRepository) {

    fun getRecipes(): LiveData<List<Recipe?>?>? {
        return repo.getRecipes()
    }


}