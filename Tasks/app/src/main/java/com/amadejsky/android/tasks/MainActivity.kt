package com.amadejsky.android.tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amadejsky.android.tasks.ui.theme.TasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //MyModifier()
           //MyColumn()
           //MyRow()
            //MyModifierExercise()
            MyText()
        }
    }

    @Composable
    fun MyText(){
        Text(
            text = "Style of a mighty Text!",
            fontSize = 20.sp,
            color = Color.Magenta,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .padding(top = 30.dp)

        )
    }

    @Composable
    fun MyModifierExercise(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Top",
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray, RectangleShape)

            )
            Text(
                text = "Bottom",
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray, CircleShape)
                    .border(2.dp, Color.White, shape = CircleShape)


            )
        }
    }

    @Composable
    fun MyModifier(){
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                //.fillMaxHeight()
                .fillMaxSize()
                //.height(100.dp)
                .padding(50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "We're testing modifier",
                modifier = Modifier
                    .width(75.dp)
                    .background(Color.Magenta, CircleShape)
                    .padding(10.dp)
                    .rotate(45f)
                    .border(2.dp, Color.Red)

            )
            Text(
                text = "Android",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(20.dp)
            )
        }
    }
    @Composable
    fun MyColumn(){
        Column(
            modifier = Modifier.background(Color.Magenta).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "Hello Android!")
            Text(text = "Is it me you looking for")
            Text(text = "Test!")
        }
    }

    @Composable
    fun MyRow(){
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "Hello Android!")
            Text(text = "Is it me you looking for")
            Text(text = "Test!")
        }
    }
}

