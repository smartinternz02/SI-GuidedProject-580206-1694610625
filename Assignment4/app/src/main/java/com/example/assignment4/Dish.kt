
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment4.R

@Composable
fun DishPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 6.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Restaurants", style = MaterialTheme.typography.headlineLarge,
            fontSize = 48.sp, color = Color.hsl(270F, 0.90F, 0.50F))

        Spacer(modifier = Modifier.height(10.dp))
        val myImgList = listOf(
            R.drawable.restaurant_image_5,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )
        LazyColumn(){
            items(5){
                    index ->
            }
        }


    }
}
//
//fun DishCard(){
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(340.dp)
//            .padding(horizontal = 8.dp, vertical = 8.dp)
//        ,
//        colors = CardDefaults.cardColors(
//            containerColor = Color.White
//        ),
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 15.dp
//        ),
//        border = BorderStroke(1.5.dp, color =  MaterialTheme.colorScheme.primary),
//        onClick = {navController.navigate(Routes.Dish.route)}
//
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(horizontal = 16.dp, vertical = 10.dp)
//                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
//        ) {
//            // Section 1: Scrollable Images
//            LazyRow(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(105.dp)
//            ) {
//
//                items(imageList) { image ->
//                    Image(
//                        painter = painterResource(id = image),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier
//                            .size(100.dp)
//                            .padding(end = 8.dp)
//                            .clip(shape = MaterialTheme.shapes.medium)
//                            .aspectRatio(1f)
//                    )
//                }
//            }
//
//            // Section 2: Restaurant Details
//            Text(
//                text = RestaurantName,
//                style = MaterialTheme.typography.headlineLarge,
//                color = Color.Black
//            )
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier.padding(top = 4.dp)
//            ) {
//                StarRating(rating = 3.0f, maxRating = 5)
//                Text(
//                    text = "($rating reviews)",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.Gray,
//                    modifier = Modifier.padding(start = 4.dp)
//                )
//            }
//            Text(
//                text = "Cuisine: $cuisine",
//                style = MaterialTheme.typography.bodyLarge,
//                color = Color.Gray,
//                modifier = Modifier.padding(top = 4.dp)
//            )
//            Text(
//                text = if (isOpen) "Open Now" else "Closed",
//                style = MaterialTheme.typography.bodyLarge,
//                color = if (isOpen) Color.hsl(115f, 0.82f, 0.5f) else Color(0xfffc144e),
//                modifier = Modifier.padding(top = 4.dp)
//            )
//            Text(
//                text = "Timing: $startTime AM - $endTime PM",
//                style = MaterialTheme.typography.bodyLarge,
//                color = Color.Gray,
//                modifier = Modifier.padding(top = 4.dp)
//            )
//
//            // Section 3: Action Buttons
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 6.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ActionButton(text = "Call", icon = Icons.Default.Phone, clr = Color.hsl(115f, 0.82f, 0.5f))
//                ActionButton(text = "Direction", icon = Icons.Default.LocationOn, clr = MaterialTheme.colorScheme.primary)
//                ActionButton(text = "Save", icon = Icons.Default.Favorite, clr = Color(0xfffc144e))
//            }
//        }
//    }
//}
