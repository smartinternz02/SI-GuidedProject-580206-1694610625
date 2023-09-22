
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment4.R
import com.example.assignment4.Routes

@Composable
fun LoginPage(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val emailLeadingIcon: @Composable (() -> Unit) by remember {
        mutableStateOf({
            Image(
                painter = painterResource(id = R.drawable.mail_unfocused),
                contentDescription = "Star Icon",
                modifier = Modifier.size(36.dp)

            )
        })
    }
    val passwordLeadingIcon: @Composable (() -> Unit) by remember {
        mutableStateOf({
            Box(modifier = Modifier.size(32.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.password_focused),
                    contentDescription = "Star Icon",
                    modifier = Modifier.size(32.dp)

                )
            }
        })
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        androidx.compose.material.Text(
            text = "Login Page", style = MaterialTheme.typography.headlineLarge,
            fontSize = 48.sp, color = Color.hsl(270F, 0.90F, 0.50F))

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "example@domain.com") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done),
            value = email,
            onValueChange = {
                    newEmail -> email = newEmail;},
            leadingIcon = emailLeadingIcon,
            singleLine = true
        )


        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done),
            value = password,
            onValueChange = { newPassword -> password = newPassword },
            singleLine = true,
            leadingIcon = passwordLeadingIcon

        )



        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                onClick = {
                    // Navigate to the Login page
                    navController.navigate(Routes.Signup.route)
                },
                modifier = Modifier.padding(10.dp)
            ) {
                androidx.compose.material.Text(
                    text = "Signup Instead",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W300,
                    fontStyle = FontStyle.Italic )
            }

            Button(
                onClick = {
                    // Perform signup logic here
                          navController.navigate(Routes.Home.route)
                },
                modifier = Modifier
                    .width(150.dp)
                    .padding(5.dp)
                    .height(45.dp)
            ) {
                androidx.compose.material.Text(
                    text = "Login",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.W500,
                )
            }
        }
    }
}