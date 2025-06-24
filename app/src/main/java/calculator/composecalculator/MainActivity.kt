package calculator.composecalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import calculator.composecalculator.ui.theme.ComposeCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCalculatorTheme {
              Surface(modifier = Modifier.fillMaxSize().safeDrawingPadding()){
                  CalculatorScreen()
              }
            }
        }
    }
}

@Composable
fun ButtonCounter(){
//    var count by remember { mutableStateOf(0) }
    var count = 0
    val ctx = LocalContext.current
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Count:$count", fontSize = 26.sp)
        Button(onClick = {
            count++
            Toast.makeText(ctx, "$count",Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Increment")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ButtonCounterPreviewScreen(){
    ButtonCounter()
}