package calculator.composecalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun CalculatorScreen(){
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0) }

     val numberKeypad =
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
        TextField(value = num1,
            onValueChange = {num1 = it},
            placeholder = {
                Text(text = "Enter num1")
            },

            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        TextField(value = num2,
            onValueChange = {num2 = it},
            placeholder = {
                Text(text = "Enter num2")
            },
            modifier = Modifier.fillMaxWidth(),
//            KeyboardOptions = KeyboardOptions()
        )
//        Spacer(modifier = )
        Row {

            Button(onClick = {}) {
                Text(text = "+")
            }

            Button(onClick = {}) {
                Text(text = "-")
            }

            Button(onClick = {}) {
                Text(text = "*")
            }

            Button(onClick = {}) {
                Text(text = "/")
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Result" ,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Text(text = "$result",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold

        )
    }
}
@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview(){
    CalculatorScreen()
}
