
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment4.R

@Composable
fun HomePage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 6.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        androidx.compose.material.Text(
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
                index ->  RestaurantCard(cuisine = "Indian",
                endTime = "11:30",
                imageList = myImgList,
                isOpen = false,
                rating = 4f,
                RestaurantName = "The Taj",
                reviews = 985,
                startTime = "08:30", navController = navController)
            }
        }


    }
}