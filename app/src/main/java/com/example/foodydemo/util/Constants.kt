package com.example.foody.util

class Constants {

    companion object {

        const val BASE_URL = "https://api.spoonacular.com"
        //const val API_KEY = "[YOUR API KEY HERE]"
        const val API_KEY = "d16fba4a3aea4b79afbcd5a35d40bd1b"

        // API Query Keys
        const val QUERY_NUMBER = "number"
        const val QUERY_API_KEY = "apiKey"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "diet"
        const val QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation"
        const val QUERY_FILL_INGREDIENTS = "fillIngredients"

        // ROOM Database
        const val DATABASE_NAME="recipes_databse"
        const val RECIPES_TABLE="recipes_table"

    }

}