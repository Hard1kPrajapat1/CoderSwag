package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Henry's Graphic Beanie ", "180 Rs", "hat1"),
        Product("Henry's Hat Black ", "200 Rs", "hat2"),
        Product("Henry's Hat White ", "220 Rs", "hat3"),
        Product("Henry's Hat Snapback ", "190 Rs", "hat4"),
        Product("Henry's Graphic Beanie ", "180 Rs", "hat1"),
        Product("Henry's Hat Black ", "200 Rs", "hat2"),
        Product("Henry's Hat White ", "220 Rs", "hat3"),
        Product("Henry's Hat Snapback ", "190 Rs", "hat4")
    )

    val hoodies = listOf(
        Product("Henry's Gray Hoodie", "250 Rs","hoodie1"),
        Product("Henry's Red Hoodie", "280 Rs","hoodie2"),
        Product("Henry's Gray Hoodie", "270 Rs","hoodie3"),
        Product("Henry's Black Hoodie", "300 Rs","hoodie4"),
        Product("Henry's Gray Hoodie", "250 Rs","hoodie1"),
        Product("Henry's Red Hoodie", "280 Rs","hoodie2"),
        Product("Henry's Gray Hoodie", "270 Rs","hoodie3"),
        Product("Henry's Black Hoodie", "300 Rs","hoodie4")
    )

    val shirts = listOf(
        Product("Henry's Black Shirt", "300 Rs", "shirt1"),
        Product("Henry's Badge Light Gray Shirt", "300 Rs", "shirt2"),
        Product("Henry's Red Logo Shirt", "300 Rs", "shirt3"),
        Product("Henry's Hustle", "300 Rs", "shirt4"),
        Product("KickFlip studios", "300 Rs", "shirt5"),
        Product("Henry's Black Shirt", "300 Rs", "shirt1"),
        Product("Henry's Badge Light Gray Shirt", "300 Rs", "shirt2"),
        Product("Henry's Red Logo Shirt", "300 Rs", "shirt3"),
        Product("Henry's Hustle", "300 Rs", "shirt4"),
        Product("KickFlip studios", "300 Rs", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}