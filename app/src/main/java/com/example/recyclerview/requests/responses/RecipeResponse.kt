package com.example.recyclerview.requests.responses

import com.example.recyclerview.models.Recipe
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RecipeResponse {
    @SerializedName("recipe")
    @Expose
    private val recipe: Recipe? = null
    fun getRecipe(): Recipe? {
        return recipe
    }

    override fun toString(): String {
        return "RecipeResponse{" +
                "recipe=" + recipe +
                '}'
    }
}
