//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import androidx.navigation.compose.*
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.ui.theme.*
//
//@Composable
//fun SignupPage(navController: NavController) {
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(text = "Signup Page", style = typography.h4)
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        BasicTextField(
//            value = email,
//            onValueChange = { email = it },
//            placeholder = { Text(text = "Email") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//        BasicTextField(
//            value = password,
//            onValueChange = { password = it },
//            placeholder = { Text(text = "Password") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            TextButton(
//                onClick = {
//                    // Navigate to the Login page
//                    navController.navigate("login")
//                }
//            ) {
//                Text(text = "Login Instead")
//            }
//
//            Button(
//                onClick = {
//                    // Perform signup logic here
//                }
//            ) {
//                Text(text = "Signup")
//            }
//        }
//    }
//}
//
//@Composable
//fun LoginPage(navController: NavController) {
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(text = "Login Page", style = typography.h4)
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        BasicTextField(
//            value = email,
//            onValueChange = { email = it },
//            placeholder = { Text(text = "Email") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//        BasicTextField(
//            value = password,
//            onValueChange = { password = it },
//            placeholder = { Text(text = "Password") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            TextButton(
//                onClick = {
//                    // Navigate to the Signup page
//                    navController.navigate("signup")
//                }
//            ) {
//                Text(text = "Signup Instead")
//            }
//
//            Button(
//                onClick = {
//                    // Perform login logic here
//                }
//            ) {
//                Text(text = "Login")
//            }
//        }
//    }
//}
//
//@Composable
//fun MyApp() {
//    val navController = rememberNavController()
//
//    NavHost(navController = navController, startDestination = "login") {
//        composable("login") { LoginPage(navController) }
//        composable("signup") { SignupPage(navController) }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewSignupPage() {
//    MyApp()
//}
