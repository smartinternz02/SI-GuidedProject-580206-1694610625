
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
            text = "Dishes", style = MaterialTheme.typography.headlineLarge,
            fontSize = 48.sp, color = Color.DarkGray)

        Spacer(modifier = Modifier.height(10.dp))

        val dishNames = listOf<String>("Pizza","Spaghetti","Chicken Tikka Masala","Burger","Shahi Paneer")
        val costs = listOf<String>("789","1234","569","349")
        val isVegetarians = listOf<Boolean>(false, true, false, true, true)
        val isBestsellers = listOf<Boolean>(true, false, true, false, true)
        val isNew = listOf<Boolean>(false, false, true, true, false)
        val myImgList = listOf(
            R.drawable.restaurant_image_5,
            R.drawable.restaurant_image_6,
            R.drawable.restaurant_image_7,
            R.drawable.restaurant_image_8,
            R.drawable.restaurant_image_4,
        )
        LazyColumn(){
            items(6){
                    index -> DishCard(
                dishName = dishNames[index],
                cost = "₹${costs[index]}",
                description =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                isVegetarian = isVegetarians[index],
                isBestseller = isBestsellers[index],
                isNew = isNew[index],
                imageResId = myImgList[index]
            )
            }
        }


    }
}
@Composable
fun DishCard(
    dishName: String,
    cost: String,
    description: String,
    isVegetarian: Boolean,
    isBestseller: Boolean,
    isNew: Boolean,
    imageResId: Int
){
    val configuration = LocalConfiguration.current
    val height = configuration.screenHeightDp
    val width = configuration.screenWidthDp
    val cardPadding = 12;
    val cardWidth = width*0.94;

//    println("width = "+width)
//    println("height = "+height)

    Card(
        modifier = Modifier
            .width(cardWidth.dp)
            .height(200.dp)
            .padding(cardPadding.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 12.dp
        )
    ) {
        Row {
            val col_wid = (cardWidth-(cardPadding*2))/2
           Column(modifier = Modifier
               .width(col_wid.dp)
               .background(color = Color.White)
               .fillMaxHeight()
               .padding(
                   start = 10.dp, top = 10.dp
               )

           ) {
               Row(
                   verticalAlignment = Alignment.CenterVertically,
                   modifier = Modifier.fillMaxWidth()
               ) {
                   // Vegetarian Indicator (Dot)
                   if (isVegetarian) {
                       Box(
                           modifier = Modifier
                               .size(16.dp)
                               .clip(RoundedCornerShape(6.dp))
                               .background(Color.Transparent)
                               .align(Alignment.CenterVertically)
                               .border(
                                   width = 1.dp,
                                   color = Color(0xff3ea105),
                                   shape = RoundedCornerShape(6.dp)
                               )
                               .padding(3.dp)

                       ){ Box(modifier = Modifier
                           .size(9.dp)
                           .clip(RoundedCornerShape(12.dp))
                           .background(color = Color(0xff3ea105))
                           .align(Alignment.Center)
                       )
                       }
                   }
                   else{
                       Box(
                           modifier = Modifier
                               .size(16.dp)
                               .clip(RoundedCornerShape(6.dp))
                               .background(Color.Transparent)
                               .align(Alignment.CenterVertically)
                               .border(
                                   width = 1.dp,
                                   color = Color(0xfffc144e),
                                   shape = RoundedCornerShape(6.dp)
                               )
                               .padding(3.dp)

                       ){ Box(modifier = Modifier
                           .size(9.dp)
                           .clip(RoundedCornerShape(12.dp))
                           .background(color = Color(0xfffc144e))
                           .align(Alignment.Center)
                       )
                       }
                   }
                   Spacer(modifier = Modifier.width(8.dp))
                   // Bestseller/Popular/New Indicator
                   if (isBestseller) {
                       Box(modifier = Modifier.clip(shape = RoundedCornerShape(7.dp))) {
                           Text(
                               text = "Bestseller",
                               color = Color.White, // Customize the color
                               fontSize = 12.sp, // Customize the font size
                               modifier = Modifier
//                                    .padding(start = 8.dp)
                                   .background(color = Color(0xFFe09c02))
                                   .padding(4.dp)
                                   .clip(
                                       RoundedCornerShape(7.dp)
                                   ),

                               )
                       }
                   } 
                   Spacer(modifier = Modifier.width(3.dp))
                   if (isNew) {
                       Box(modifier = Modifier.clip(shape = RoundedCornerShape(7.dp))) {
                           Text(
                               text = "New Launch !",
                               color = Color.White, // Customize the color
                               fontSize = 12.sp, // Customize the font size
                               modifier = Modifier
//                                    .padding(start = 8.dp)
                                   .background(color = Color(0xFF8A2BE2))
                                   .padding(4.dp)
                                   .clip(
                                       RoundedCornerShape(7.dp)
                                   ),

                               )
                       }
                   }
               }

               Spacer(modifier = Modifier.height(8.dp))

               // Dish Name
               Row {
                   Text(
                       text = dishName,
                       style = MaterialTheme.typography.titleLarge,
                       modifier = Modifier.fillMaxWidth()
                   )
                   Spacer(modifier = Modifier.width(10.dp))
                   StarRating(rating = 4f, maxRating = 5)

               }
               Spacer(modifier = Modifier.height(4.dp))
               Text(
                   text = "Cost: ${cost}",
                   style = MaterialTheme.typography.bodyLarge,
                   color = Color(0xFF3e78cc), // Customize the color
                   modifier = Modifier.width((width*0.3).dp)
               )

               Spacer(modifier = Modifier.height(8.dp))

               // Dish Description
               TruncatedText(
                   text = description,
                   maxWords = 21,
                   modifier = Modifier
                       .fillMaxWidth()
                       .fillMaxHeight()
                       .padding(bottom = 4.dp)
               )

               Spacer(modifier = Modifier.height(14.dp))

               // Dish Image

           }
            Column(modifier = Modifier
                .width(col_wid.dp)
                .background(color = Color.White)
                .fillMaxHeight()
                .padding(start = 10.dp, top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(6.dp)
                        .clip(shape = MaterialTheme.shapes.medium),

                )

                Spacer(modifier = Modifier.height(8.dp))

                // Add to Cart Button
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)) {
                    CustomAddButton()
                }
//                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }}



@Composable
fun CustomAddButton() {
    var itemCount by remember { mutableStateOf(0) }

    Row(
        verticalAlignment = Alignment.CenterVertically,modifier = Modifier
            .width(100.dp)
            .height(40.dp)
            .background(color = Color(0xFFfcc8c8))
            .clip(shape = RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = Color(0xFFd94f61), shape = RoundedCornerShape(8.dp))

    ) {
        Icon(
            painter = painterResource(id = R.drawable.line),
            contentDescription = "Plus",
            tint = Color.White,
            modifier = Modifier
                .weight(1f)
                .size(28.dp)
                .clickable { itemCount-- }

        )

        Spacer(modifier = Modifier.width(2.dp))

        Text(
            text = if (itemCount > 0) itemCount.toString() else "Add",
            color = Color.White,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
            ,modifier = Modifier.weight(1f)
        )

        Spacer(modifier = Modifier.width(2.dp))

        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Plus",
            tint = Color.White,
            modifier = Modifier
                .weight(1f)
                .size(24.dp)
                .clickable { itemCount++ }
        )
    }
}

@Composable
fun TruncatedText(
    text: String,
    maxWords: Int,
    modifier: Modifier = Modifier,
    ellipsis: String = "..."
) {
    var truncatedText by remember {
        mutableStateOf(text)
    }

    // Truncate the text to the first 'maxWords' words and add ellipsis if needed
    if (text.split(" ").size > maxWords) {
        val words = text.split(" ").take(maxWords)
        truncatedText = words.joinToString(" ") + ellipsis
    }

    Text(
        text = truncatedText,
        modifier = modifier,
        fontSize = 10.sp, // Customize the font size
        color = Color.Gray, // Customize the text color
        style = MaterialTheme.typography.bodyMedium,
        lineHeight = 13.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Justify

    )
}
@Preview(showBackground = true)
@Composable
fun Preview() {
//    val navController = rememberNavController();
    DishPage()
}
