
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
        val restaurantImageSet1 = listOf(
            R.drawable.restaurant_image_1,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )
        val restaurantImageSet2 = listOf(
            R.drawable.restaurant_image_5,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )
        val restaurantImageSet3 = listOf(
            R.drawable.restaurant_image_5,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )
        val restaurantImageSet4 = listOf(
            R.drawable.restaurant_image_5,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )

        val restrImgData = listOf(restaurantImageSet1,restaurantImageSet2,restaurantImageSet3,restaurantImageSet4)
        val cuisines = listOf<String>("Indian","Italian","Chinese","Continental")
        val endTimes = listOf<String>("11:15","10:30","11:59","10:45")
        val isOpens = listOf(true,false,true,true)
        val ratings = listOf(5f,4f,3f,2f,4f)
        val names  = listOf<String>("Hotel HindMata"," Hotel Olivia","Panda Express","Coup De Gras")
        val reviews = listOf(12870,4305,659,8132)
        val startTime = listOf<String>("07:30","08:15","08:00","11:45")
        LazyColumn(){
            items(5){
                index ->  RestaurantCard(
                cuisine = cuisines[index],
                endTime = endTimes[index],
                imageList = restrImgData[index],
                isOpen = isOpens[index],
                rating = ratings[index],
                RestaurantName = names[index],
                reviews = reviews[index],
                startTime = startTime[index] ,
                navController = navController)
            }
        }


    }
}