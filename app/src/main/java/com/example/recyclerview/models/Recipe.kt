package com.example.recyclerview.models

import android.os.Parcel
import android.os.Parcelable
import java.util.*


class Recipe : Parcelable {
    var title: String? = null
    var publisher: String? = null
    var ingredients: Array<String>? = null
    var recipe_id: String? = null
    var image_url: String? = null
    var social_rank = 0f

    constructor(
        title: String?,
        publisher: String?,
        ingredients: Array<String>?,
        recipe_id: String?,
        image_url: String?,
        social_rank: Float
    ) {
        this.title = title
        this.publisher = publisher
        this.ingredients = ingredients
        this.recipe_id = recipe_id
        this.image_url = image_url
        this.social_rank = social_rank
    }

    constructor() {}
    protected constructor(`in`: Parcel) {
        title = `in`.readString()
        publisher = `in`.readString()
        ingredients = `in`.createStringArray()
        recipe_id = `in`.readString()
        image_url = `in`.readString()
        social_rank = `in`.readFloat()
    }

    override fun toString(): String {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", recipe_id='" + recipe_id + '\'' +
                ", image_url='" + image_url + '\'' +
                ", social_rank=" + social_rank +
                '}'
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(title)
        dest.writeString(publisher)
        dest.writeStringArray(ingredients)
        dest.writeString(recipe_id)
        dest.writeString(image_url)
        dest.writeFloat(social_rank)
    }

    companion object {
        val CREATOR: Parcelable.Creator<Recipe?> = object : Parcelable.Creator<Recipe?> {
            override fun createFromParcel(`in`: Parcel): Recipe? {
                return Recipe(`in`)
            }

            override fun newArray(size: Int): Array<Recipe?> {
                return arrayOfNulls(size)
            }
        }
    }
}