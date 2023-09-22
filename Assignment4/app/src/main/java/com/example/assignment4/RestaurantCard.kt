
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.assignment4.R
import com.example.assignment4.Routes
import com.example.assignment4.ui.theme.Assignment4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantCard(
    navController: NavController,
    imageList: List<Int> = listOf(R.drawable.restaurant_image_5,
    R.drawable.restaurant_image_6,
    R.drawable.restaurant_image_7,
    R.drawable.restaurant_image_8,
    R.drawable.restaurant_image_4,),
    RestaurantName: String = "name",
    rating: Float = 1f,
    reviews: Int = 10,
    cuisine: String = "Tribal",
    isOpen: Boolean = true,
    startTime: String = "03:00",
    endTime: String = "00:00") {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp)
            .padding(horizontal = 8.dp, vertical = 8.dp)
            ,
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 15.dp
        ),
        border = BorderStroke(1.5.dp, color =  MaterialTheme.colorScheme.primary),
        onClick = {navController.navigate(Routes.Dish.route)}

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 10.dp)
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
        ) {
            // Section 1: Scrollable Images
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(105.dp)
            ) {

                items(imageList) { image ->
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 8.dp)
                            .clip(shape = MaterialTheme.shapes.medium)
                            .aspectRatio(1f)
                    )
                }
            }

            // Section 2: Restaurant Details
            Text(
                text = RestaurantName,
                style = MaterialTheme.typography.headlineLarge,
                color = Color.Black
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 4.dp)
            ) {
                StarRating(rating = 3.0f, maxRating = 5)
                Text(
                    text = "($rating reviews)",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Text(
                text = "Cuisine: $cuisine",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = if (isOpen) "Open Now" else "Closed",
                style = MaterialTheme.typography.bodyLarge,
                color = if (isOpen) Color.hsl(115f, 0.82f, 0.5f) else Color(0xfffc144e),
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "Timing: $startTime AM - $endTime PM",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray,
                modifier = Modifier.padding(top = 4.dp)
            )

            // Section 3: Action Buttons
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ActionButton(text = "Call", icon = Icons.Default.Phone, clr = Color.hsl(115f, 0.82f, 0.5f))
                ActionButton(text = "Direction", icon = Icons.Default.LocationOn, clr = MaterialTheme.colorScheme.primary)
                ActionButton(text = "Save", icon = Icons.Default.Favorite, clr = Color(0xfffc144e))
            }
        }
    }
}

@Composable
fun StarRating(rating: Float, maxRating: Int) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.Transparent)
    ) {
        for (i in 1..maxRating) {
            val painterID = if (i <= rating) painterResource(R.drawable.rating_filled) else painterResource(R.drawable.rating_unfilled)
            Icon(painter = painterID, contentDescription = null, modifier = Modifier.size(16.dp), tint = Color(0xFFFFD700))
        }
    }
}

@Composable
fun ActionButton(text: String, icon: ImageVector, clr : Color) {
    Box(
        modifier = Modifier
            .clip(MaterialTheme.shapes.small)
            .clickable { /* Handle button click */ }
            .background(Color(0xFFFFFFFF))
            .padding(end = 15.dp).
            border(width = 1.dp, color = clr,shape  = RoundedCornerShape(8.dp))
            .padding(2.dp)
//            .height(130.dp).width(100.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(4.dp)
        ) {
            Icon(imageVector = icon, contentDescription = null, tint = clr, modifier = Modifier.size(26.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium,
                color = clr,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    val navController = rememberNavController();
    Assignment4Theme {
        RestaurantCard(navController = navController);
    }
}