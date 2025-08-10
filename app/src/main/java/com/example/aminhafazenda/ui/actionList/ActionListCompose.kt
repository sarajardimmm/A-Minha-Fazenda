package com.example.aminhafazenda.ui.actionList

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ActionListCompose(navController: NavHostController, actionListViewModel: ActionListViewModel) {
    val items = (1..20).toList()
    LazyColumn {
        items(items) { item ->
            Text(
                text = "Item $item",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }
    }
}