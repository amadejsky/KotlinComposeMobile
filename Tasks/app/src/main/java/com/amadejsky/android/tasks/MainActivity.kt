package com.amadejsky.android.tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
            //MyText()
           //MyTextAlignment()
            //MyIcon()
            //MySpacer()
            //MyProgressExercise()
            //MyButton()
            //MySurface()
            //MyCard()
            //MyBox()
            //MyLayoutWeight()
            MyExercise2()

        }
    }
    @Composable
    fun MyExercise2(){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                MyUdemyInfoView()
                MyUdemyPriceView()
            }
        }

    }
    @Composable
    fun MyUdemyInfoView(){
        Column(modifier = Modifier
            .background(Color.DarkGray)
        ){
            Text(
                text = "Kotlin Course + comparision Java vs Kotlin and more",
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "4,7",
                    color = Color.Yellow
                )
                Spacer(modifier = Modifier.width(2.dp))
                Icon(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = "Star icon",
                    tint = Color.Yellow
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = "Ratings: 560",
                    color = Color.Magenta,
                    textDecoration = TextDecoration.Underline

                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "1056 participants",
                    color = Color.White
                )
            }
        }

    }
    @Composable
    fun MyUdemyPriceView(){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ){
            Column(
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = "49.99",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 20.sp

                )
                Text(
                    text = "299.99",
                    color = Color.LightGray,
                    textDecoration = TextDecoration.LineThrough,
                    fontSize = 14.sp
                    )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {} ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                shape = RectangleShape,
                contentPadding = PaddingValues(8.dp)
            ) {
                Text(text = "Buy now",
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }

    }
    @Composable
    fun MyLayoutWeight(){
        Row(
        ){
            Text(
                text = "Text1",
                modifier = Modifier
                    .background(Color.Green)
                    .weight(1f)
            )
            Text(
                text = "Text2",
                modifier = Modifier
                    .background(Color.Yellow)
                    .weight(1f)
            )
            Text(
                text = "Text3",
                modifier = Modifier
                    .background(Color.Red)
                    .weight(1f)
            )
        }

    }
    @Composable
    fun MyBox(){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(text = "Box1", modifier = Modifier.align(Alignment.BottomEnd))
            Text(text = "Box2", modifier = Modifier.align(Alignment.BottomCenter))
            Text(text = "Box3", modifier = Modifier.align(Alignment.BottomStart))
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                    .align(Alignment.Center)
            ){
                Spacer(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Magenta, RoundedCornerShape(8.dp))
                        .align(Alignment.Center)
                )
                Spacer(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Magenta, RoundedCornerShape(8.dp))
                        .align(Alignment.TopStart)
                )
                Spacer(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Magenta, RoundedCornerShape(8.dp))
                        .align(Alignment.BottomEnd)
                )
            }
        }
    }
    @Composable
    fun MyCard(){
        Card(
            modifier = Modifier.padding(40.dp),
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(Color.Blue)
        ){
            Text(
                text = "Card",
                modifier = Modifier.padding(10.dp)
            )
        }
    }

    @Composable
    fun MyButton(){
        Column(){
            Button(onClick = {}) {
                Text(text="Button")
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, Color.Red),
                contentPadding = PaddingValues(30.dp),
                modifier = Modifier.padding(10.dp),

                //enabled = false
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(imageVector = Icons.Default.Add, contentDescription = null)
                    Text(text = "Add")
                }
            }
        }
    }

    @Composable
    fun MySurface(){
        Surface(
            modifier = Modifier
                .size(200.dp)
                .fillMaxSize(),
            color = Color.Red,
            contentColor = Color.Blue,
            border = BorderStroke(2.dp,Color.Green)
        ){
            Column(){
                Text(
                    text = "Surface",
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "Surface",
                    modifier = Modifier.padding(10.dp)
                )
            }

        }
    }

    @Composable
    fun MyProgressExercise(){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Hello User!",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Thin,
                textAlign = TextAlign.End,

                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Magenta)
            )
            Divider()
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Divider()
            Text(text = "Cool layout",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 20.dp))

        }
    }
    @Composable
    fun MyProgress(){
        Column(modifier = Modifier.padding(10.dp)){
            CircularProgressIndicator(color = Color.Magenta)
            Spacer(modifier = Modifier.height(40.dp))
            CircularProgressIndicator(progress = 0.8f)
            LinearProgressIndicator(color = Color.Red,
                modifier = Modifier.fillMaxWidth(),
                trackColor = Color.Magenta)
        }
    }
    @Composable
    fun MyDivider(){
        Column(){
            Text(text = "Im UP")
            Divider()
            Text(text = "IM DOWN")
        }
    }

    @Composable
    fun MySpacer(){
        Column(){
            Text(text = "Im UP!",
//                modifier = Modifier.padding(bottom = 20.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .background(Color.Green)
            )
            Text(text = "Im Down")
        }
    }
    @Composable
    fun MyIcon(){
        Column(){
            Icon(imageVector = Icons.Default.Email, contentDescription = "email Icon",
                    modifier = Modifier.padding(50.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Email, contentDescription = "outlined email"
            )
            Icon(
                imageVector = Icons.Outlined.Done, contentDescription = "", tint = Color.Green
            )
            Icon(
                imageVector = Icons.Default.Done,
                contentDescription = "done icon",
                tint = Color.White,
                modifier = Modifier
                    .background(Color.Green, CircleShape)
                    .border(1.dp, Color.Black, CircleShape)
                    .padding(3.dp)
            )

        }
    }
    @Composable
    fun MyTextAlignment(){
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(top = 50.dp),

//            horizontalAlignment = Alignment.End

        ){
            Text(
                text = "Text1",
                modifier = Modifier
                    .background(Color.Green)
                    .align(Alignment.Start)
                    .fillMaxWidth(),
                textAlign = TextAlign.End
            )
            Text(
                text = "Text2",
                modifier = Modifier
                    .background(Color.Yellow)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Text3",
                modifier = Modifier
                    .background(Color.Red)
                    .align(Alignment.End)
                    .fillMaxWidth()
                    .height(50.dp)
                    .wrapContentSize()
            )
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

