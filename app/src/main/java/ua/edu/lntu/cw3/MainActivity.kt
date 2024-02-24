package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw3.ui.theme.IPZ_KR_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_KR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun CustomListItem(
    title: String,
    subtitle: String,
    description: String
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(text = title, style = TextStyle(fontWeight = FontWeight.Bold,
            color = Color.White,
            background = Color.Blue,
            fontSize = 23.sp))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = subtitle, style = TextStyle(fontSize = 18.sp, color = Color.Cyan, fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = description, style = TextStyle(fontSize = 14.sp, color = Color.Red, background = Color.Green))
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_KR_3Theme {
        Greeting("Android")
    }
}