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
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.ui.screens.FeedScreen
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.ui.screens.InstagramTopBar
import me.gonzalomejia.taller_lazycolumn_lazyrow_coil.ui.theme.Taller_LazyColumn_LazyRow_CoilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Intente poner el InstagramCloneTheme pero no pude, me salia como error
            //Por ahora voy a dejarlo asi porque me ejecuta el feed de instagram pero voy a mandarle un correo al profesor
                FeedScreen()
            }
        }
    }


