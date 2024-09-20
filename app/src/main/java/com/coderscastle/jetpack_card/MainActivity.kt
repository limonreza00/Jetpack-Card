package com.coderscastle.jetpack_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coderscastle.jetpack_card.ui.theme.JetpackCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCardTheme {
                MyCard()
            }
        }
    }
}

@Composable
fun MyCard () {
    Column {

        Row {
            CardDesign()
            CardDesign()
            CardDesign()
            CardDesign()
        }
        Row {
            CardDesign()
            CardDesign()
            CardDesign()
            CardDesign()
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCardPreview() {
    MyCard()
}



@Composable
fun CardDesign (){
    Card(modifier = Modifier.size(100.dp,100.dp).padding(5.dp),
        colors = CardDefaults.cardColors(Color.Yellow),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = CardDefaults.shape) {

        Box(modifier = Modifier.fillMaxSize()) {

            Column (modifier = Modifier.align(Alignment.Center)){
                Icon(imageVector = Icons.Default.Face, contentDescription = null)
                Text(text = "Hello")
            }

        }

    }
}