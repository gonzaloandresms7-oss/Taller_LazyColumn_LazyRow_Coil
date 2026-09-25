package me.gonzalomejia.taller_lazycolumn_lazyrow_coil.model

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BasicFeedList(posts: List<Post>)
{
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text("-- Inicio del Feed --")
        }
        items(
            items=posts,
            key= { post -> post.id}
        ){post -> PostCard(post=post)}
    }
}

@Composable
fun PostCard(post: Post) {
    TODO("Not yet implemented")
}


@Composable
fun FeedWithIndex(posts: List<Post>){
    LazyColumn {
        itemsIndexed(posts){
            index, post ->
            Text("Post #$index: ${post.username}")
        }
    }
}