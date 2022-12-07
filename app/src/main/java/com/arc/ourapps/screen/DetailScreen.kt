package com.arc.ourapps.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(){
    Column(
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {

            Image(
                painter = painterResource
                    (id = R.drawable.ic_launcher_background),
                contentDescription = "Movie Poster",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Title Title",
                style = MaterialTheme.typography.h6
            )

            Spacer(modifier = Modifier.height(1.dp))

            Text(text = "Release")

            Spacer(modifier = Modifier.height(1.dp))

            Text(text = "Director")

            Spacer(modifier = Modifier.height(1.dp))

            Text(text = "Rating")

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis Synopsis")

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Cast")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DetailScreenPreview(){
    DetailScreen()
}
