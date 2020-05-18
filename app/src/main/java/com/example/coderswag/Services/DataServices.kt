package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Henry's Graphic Beanie ", "180 Rs", "hat01"),
        Product("Henry's Hat Black ", "200 Rs", "hat02"),
        Product("Henry's Hat White ", "220 Rs", "hat03"),
        Product("Henry's Hat Snapback ", "190 Rs", "hat04")
    )

    val hoodies = listOf(
        Product("Henry's Gray Hoodie", "250 Rs","hoodie01"),
        Product("Henry's Red Hoodie", "280 Rs","hoodie02"),
        Product("Henry's Gray Hoodie", "270 Rs","hoodie03"),
        Product("Henry's Black Hoodie", "300 Rs","hoodie04")
    )

    val shirts = listOf(
        Product("Henry's Black Shirt", "300 Rs", "shirt01"),
        Product("Henry's Badge Light Gray Shirt", "300 Rs", "shirt01"),
        Product("Henry's Red Logo Shirt", "300 Rs", "shirt01"),
        Product("Henry's Hustle", "300 Rs", "shirt01"),
        Product("KickFlip studios", "300 Rs", "shirt01")
    )
}