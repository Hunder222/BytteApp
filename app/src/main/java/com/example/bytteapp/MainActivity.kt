package com.example.bytteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bytteapp.ui.theme.BytteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFrontPage()
        }
    }
}

@Composable
fun AppFrontPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Recommended Articles",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 50.dp)
            )

            LazyVerticalGrid(
                columns = GridCells.FixedSize(190.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                items(10) {
                    Article()
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .background(color = Color(0xFFA93319))
                .align(alignment = Alignment.BottomStart)
        ) {
            val navIconSpacing = 10.dp

            Image(
                painterResource(R.drawable.home),
                contentDescription = "Home",
                modifier = Modifier.padding(navIconSpacing)

            )
            Image(
                painterResource(R.drawable.search),
                contentDescription = "Home",
                modifier = Modifier.padding(navIconSpacing)
            )
            Image(
                painterResource(R.drawable.chat),
                contentDescription = "Home",
                modifier = Modifier.padding(navIconSpacing)
            )
            Image(
                painterResource(R.drawable.fav),
                contentDescription = "Home",
                modifier = Modifier.padding(navIconSpacing)
            )
            Image(
                painterResource(R.drawable.profile),
                contentDescription = "Home",
                modifier = Modifier.padding(navIconSpacing)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Article() {

    Box(
        modifier = Modifier
            .width(190.dp)
            .height(400.dp)
            .padding(5.dp)
    ) {
        // Content eks. heart
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Image card
            Image(
                painterResource(R.drawable.magnolia),
                contentDescription = "Lol",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(20.dp)
                    )
            )

            // Title, description and price container
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp)
            ) {
                // Title
                Text(
                    text = "Magnolia",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                // Set-type
                Text(
                    text = "Botanicals",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                // brick-count
                Text(
                    text = "435 bricks",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                // Price
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(top = 5.dp)
                ) {
                    Image(
                        painterResource(R.drawable.stud),
                        contentDescription = "Placeholder",
                        modifier = Modifier
                            .width(35.dp)
                            .padding(end = 10.dp)
                    )
                    Text(
                        text = "420",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }

        // heart
        Image(
            painterResource(R.drawable.heart_filled), // ikke fyldt hjerte: "heart"
            contentDescription = "Heart icon",
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .align(alignment = Alignment.TopEnd)
                .padding(10.dp)
        )
    }
}