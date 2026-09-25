package me.gonzalomejia.taller_lazycolumn_lazyrow_coil.data


import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.model.Post
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.model.Story
// En esta parte debia ir package com.example.instagramclone.data sin embargo no me lo recibe y me da error
// Ademas de hizo importar mi codigo de Post y Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1_204,
            caption = "Explorando Jetpack Compose #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3_456,
            caption = "Material3 + Compose = perfecta combinación"
        ),
        Post(
            id = 4,
            username = "google_devs",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 12_891,
            caption = "Android 15 trae increíbles mejoras de performance"
        ),
        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/800/800",
            likes = 629,
            caption = "LazyColumn vs RecyclerView: ¿cuál prefieres?"
        ),
        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/800/800",
            likes = 2_103,
            caption = "Animaciones fluidas con animateAsState",
            isLiked = true
        ),
        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/800/800",
            likes = 445,
            caption = "Coil hace super fácil cargar imágenes en Compose"
        ),
        Post(
            id = 8,
            username = "kotlin_master",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/800/800",
            likes = 1_567,
            caption = "Aprendiendo Kotlin paso a paso"
        ),
        Post(
            id = 9,
            username = "android_world",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/800/800",
            likes = 2_784,
            caption = "Jetpack Compose hace el desarrollo más sencillo"
        ),
        Post(
            id = 10,
            username = "code_colombia",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/800/800",
            likes = 956,
            caption = "Un nuevo proyecto Android comienza hoy"
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia","", hasSeen = false),

        Story(
            2,
            "android_dev",
            "https://picsum.photos/seed/s2/200/200"
        ),

        Story(
            3,
            "kotlin_fan",
            "https://picsum.photos/seed/s3/200/200"
        ),

        Story(
            4,
            "google_io",
            "https://picsum.photos/seed/s4/200/200",
            hasSeen = true
        ),

        Story(
            5,
            "kotlin_master",
            "https://picsum.photos/seed/s5/200/200"
        ),

        Story(
            6,
            "android_world",
            "https://picsum.photos/seed/s6/200/200"
        ),

        Story(
            7,
            "code_colombia",
            "https://picsum.photos/seed/s7/200/200"
        )
    )
}