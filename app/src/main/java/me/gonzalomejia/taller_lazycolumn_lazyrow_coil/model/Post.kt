package me.gonzalomejia.taller_lazycolumn_lazyrow_coil.model


data class Post(
    val id: Int,
    val username: String,
    val profileImageURL: String,
    val imageUrl: String,
    val likes:Int,
    val caption:String,
    val isLiked: Boolean=false
)

data class Story(
    val id:Int,
    val username: String,
    val profileImageURL: String,
    val hasSeen: Boolean=false
)

