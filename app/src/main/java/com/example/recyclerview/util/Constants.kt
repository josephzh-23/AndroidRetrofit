package com.example.recyclerview.util


object Constants {
    const val BASE_URL = "https://recipesapi.herokuapp.com"
    const val NETWORK_TIMEOUT = 3000

    // YOU NEED YOUR OWN API KEY!!!!!!!!!!!!! https://www.food2fork.com/about/api
    const val API_KEY = "dadc63b6325aaf398163b40fea9b5e79"
    val DEFAULT_SEARCH_CATEGORIES = arrayOf(
        "Barbeque",
        "Breakfast",
        "Chicken",
        "Beef",
        "Brunch",
        "Dinner",
        "Wine",
        "Italian"
    )
    val DEFAULT_SEARCH_CATEGORY_IMAGES = arrayOf(
        "barbeque",
        "breakfast",
        "chicken",
        "beef",
        "brunch",
        "dinner",
        "wine",
        "italian"
    )
}
