package com.example.recyclerview.requests.responses

import com.example.recyclerview.models.Recipe
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse {
    @SerializedName("count")
    @Expose
    val count = 0

    @SerializedName("recipes")
    @Expose
    private val recipes: List<Recipe>? = null

    fun getRecipes(): List<Recipe>? {
        return recipes
    }

    override fun toString(): String {
        return "RecipeSearchResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                '}'
    }
}
