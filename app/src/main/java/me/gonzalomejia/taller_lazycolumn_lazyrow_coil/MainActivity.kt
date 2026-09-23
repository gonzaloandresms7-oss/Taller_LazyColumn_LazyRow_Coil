package me.gonzalomejia.taller_lazycolumn_lazyrow_coil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.model.Post
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.ui.theme.Taller_LazyColumn_LazyRow_CoilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Taller_LazyColumn_LazyRow_CoilTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val post = Post(
        id = 1,
        username = "Gonzalo",
        profileImageURL = "https://www.significados.com/url/",
        imageUrl = "https://www.significados.com/url/",
        likes = 900,
        caption = "Hola chicos",
        isLiked = false
    )

    val post2 = post.copy(isLiked = true)

    println(post)
    println(post2)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Taller_LazyColumn_LazyRow_CoilTheme {
        Greeting("Android")
    }
}