//Column(
//modifier = Modifier
//.fillMaxHeight()
//.padding(16.dp)
//.width((width * 0.4).dp)
//) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier.width((width*0.3).dp)
//    ) {
//        // Vegetarian Indicator (Dot)
//        if (isVegetarian) {
//            Box(
//                modifier = Modifier
//                    .size(16.dp)
//                    .clip(RoundedCornerShape(6.dp))
//                    .background(Color.Transparent)
//                    .align(Alignment.CenterVertically)
//                    .border(
//                        width = 1.dp,
//                        color = Color(0xff3ea105),
//                        shape = RoundedCornerShape(6.dp)
//                    )
//                    .padding(3.dp)
//
//            ){ Box(modifier = Modifier
//                .size(9.dp)
//                .clip(RoundedCornerShape(12.dp))
//                .background(color = Color(0xff3ea105))
//                .align(Alignment.Center)
//            )
//            }
//        }
//        else{
//            Box(
//                modifier = Modifier
//                    .size(16.dp)
//                    .clip(RoundedCornerShape(6.dp))
//                    .background(Color.Transparent)
//                    .align(Alignment.CenterVertically)
//                    .border(
//                        width = 1.dp,
//                        color = Color(0xfffc144e),
//                        shape = RoundedCornerShape(6.dp)
//                    )
//                    .padding(3.dp)
//
//            ){ Box(modifier = Modifier
//                .size(9.dp)
//                .clip(RoundedCornerShape(12.dp))
//                .background(color = Color(0xfffc144e))
//                .align(Alignment.Center)
//            )
//            }
//        }
//        Spacer(modifier = Modifier.width(8.dp))
//        // Bestseller/Popular/New Indicator
//        if (isBestseller) {
//            Box(modifier = Modifier.clip(shape = RoundedCornerShape(7.dp))) {
//                Text(
//                    text = "Bestseller",
//                    color = Color.White, // Customize the color
//                    fontSize = 12.sp, // Customize the font size
//                    modifier = Modifier
////                                    .padding(start = 8.dp)
//                        .background(color = Color(0xFFe09c02))
//                        .padding(4.dp)
//                        .clip(
//                            RoundedCornerShape(7.dp)
//                        ),
//
//                    )
//            }
//        } else if (isNew) {
//            Text(
//                text = "New",
//                color = Color.Blue, // Customize the color
//                fontSize = 12.sp, // Customize the font size
//                modifier = Modifier
//                    .padding(start = 8.dp)
//                    .background(color = Color.Blue)
//                    .padding(4.dp)
//                    .clip(
//                        RoundedCornerShape(7.dp)
//                    ),
//            )
//        }
//    }
//
//    Spacer(modifier = Modifier.height(8.dp))
//
//    // Dish Name
//    Text(
//        text = dishName,
//        style = MaterialTheme.typography.titleLarge,
//        modifier = Modifier.width((width*0.3).dp)
//    )
//    Spacer(modifier = Modifier.height(4.dp))
//    Text(
//        text = "Cost: ${cost}",
//        style = MaterialTheme.typography.bodyLarge,
//        color = Color.Black, // Customize the color
//        modifier = Modifier.width((width*0.3).dp)
//    )
//
//    Spacer(modifier = Modifier.height(8.dp))
//
//    // Dish Description
//    TruncatedText(
//        text = description,
//        maxWords = 12,
//        modifier = Modifier.width((width*0.4).dp)
//    )
//
//    Spacer(modifier = Modifier.height(8.dp))
//
//    // Dish Image
//
//}
//Column(
//modifier = Modifier
//.fillMaxHeight()
//.padding(16.dp)
//.width((width * 0.4).dp)
//) {
//    Image(
//        painter = painterResource(id = imageResId),
//        contentDescription = null,
//        contentScale = ContentScale.Crop,
//        modifier = Modifier
//            .fillMaxWidth()
//            .size(90.dp)
//    )
//
//    Spacer(modifier = Modifier.height(8.dp))
//
//    // Add to Cart Button
//    Button(
//        onClick = {
////                    handle later
//        },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp)
//    ) {
//        Text(text = "Add to Cart")
//    }
//}