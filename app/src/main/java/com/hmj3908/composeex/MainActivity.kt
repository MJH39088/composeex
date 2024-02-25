package com.hmj3908.composeex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hmj3908.composeex.ui.theme.ThoughtofthedayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //프로젝트명 + Theme
            ThoughtofthedayTheme {
//                    Greeting("Android")
//                Buttonfun(onButtonClicked = {
//                    Toast.makeText(this, "Send clicked", Toast.LENGTH_SHORT).show()
//                })
//                ModifierEx()
//                SurfaceEx("Android")
//                BoxEx()
//                RowEx()
//                ColumnEx()
                Outer()
            }
        }
    }
}

// 2차원
//@Composable
//fun BoxEx() {
//    // 2가지 용도 1. 박스 그 자체, 2. 안드로이드 프레임워크에 있는 FrameLayout 중첩 용도
//    Box {
////        Text(
////            text = "Hello World",
////            modifier = Modifier.align(Alignment.BottomEnd)
////            )
////        Text(
////            text = "Jetpack",
////            modifier = Modifier.align(Alignment.CenterEnd)
////        )
////        Text(
////            text = "Compose",
////            modifier = Modifier.align(Alignment.TopStart)
////        )
//        Box(modifier = Modifier.matchParentSize().background(Color.Cyan).align(Alignment.CenterStart)){
//
//        }
//        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.Center)) {
//
//        }
//    }
//}

//@Composable
//fun SurfaceEx(name: String) {
//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 15.dp,
//        shape = CircleShape,
//        // 백그라운드 컬러는 내가 설정한 색깔, 콘텐트 컬러는 이에 대응한 on이 붙어있는 색깔. ex) onerror
//        color = MaterialTheme.colorScheme.error
//    ) {
//        Text(
//            text = "Hello $name",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
//}

//@Composable
//fun ModifierEx() {
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta,
//            contentColor = Color.Cyan,
//        ),
//        onClick = {},
////        enabled = false,
//        modifier = Modifier.size(200.dp, 100.dp).padding(10.dp)
////        modifier = Modifier.height(100.dp)
////            .width(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = "Search",
//            modifier = Modifier.background(Color.Blue)
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing).background(Color.Blue)
//        )
//        Text(
//            "Search",
//            modifier = Modifier.offset(x = 10.dp, y = 10.dp).background(Color.Blue)
////            modifier = Modifier.clickable { }
//        )
//    }
//}

//@Composable
//fun Greeting(name: String) {
//    Text(
//        modifier = Modifier.size(300.dp),
//        color = Color.Red,
//        text = "Hello World\nHello World\nHello World",
//        fontSize = 16.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 10.sp,
//        maxLines = 2,
//        textDecoration = TextDecoration.Underline,
//        textAlign = TextAlign.Center,
//    )
//}
//
//@Composable
//fun Buttonfun(onButtonClicked: () -> Unit) {
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta),
//        //RoundedShape 설정가능
//        shape = CircleShape,
//        contentPadding = PaddingValues(20.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(text = "Send")
//    }
//}

// 가로 horizontal 1차원
//@Composable
//fun RowEx() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .height(40.dp)
//            .width(200.dp)
//    ) {
//        Text(
//            text = "첫 번째!",
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.Top)
//                .weight(3f)
//                .background(Color.Magenta)
//        )
//        Icon(
//            imageVector = Icons.Filled.AccountBox,
//            contentDescription = "추가",
//            modifier = Modifier.weight(1f)
//                .background(Color.Cyan)
//        )
//        Text(
//            text = "세 번째!",
//            textAlign = TextAlign.End,
//            modifier = Modifier.weight(3f)
//                .background(Color.Blue)
//                .align(Alignment.Bottom)
//        )
//    }
//}

// 세로 vertical 1차원
//@Composable
//fun ColumnEx() {
//    Column(
//        //Alignment는 진행 방향과 반대, Arrangment는 진행 방향
//        horizontalAlignment = Alignment.End,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.size(100.dp)
//    ) {
//        Text(
//            text = "첫 번째",
//            modifier = Modifier.align(Alignment.CenterHorizontally)
//        )
//        Text(text = "두 번째")
//        Text(
//            text = "세 번째",
//            modifier = Modifier.align(Alignment.Start)
//        )
//    }
//}

@Composable
fun Outer() {
    // 외부에서 width를 강제로 150dp로 설정, 유동적으로 width, height가 얼마 이상일 때 뭘 넣겠다에 사용
    Column(modifier = Modifier.width(150.dp)) {
        Inner(modifier = Modifier
            .widthIn(min = 100.dp, max = 400.dp)
            .heightIn(min = 50.dp, max = 300.dp)
            .width(200.dp)
            .height(160.dp)
        )
        Inner(modifier = Modifier
            .widthIn(min = 100.dp, max = 400.dp)
            .heightIn(min = 50.dp, max = 300.dp)
            .width(200.dp)
            .height(140.dp)
        )

    }
}

@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier) {
        if (maxHeight > 150.dp) {
            Text(
                text = "여기 꽤 길군요",
                modifier = Modifier.align(Alignment.BottomEnd)
                )
        }
        Text("maxW:$maxWidth maxH:$maxHeight minW:$minWidth minH:$minHeight")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThoughtofthedayTheme {
//        Greeting("Android")
//        Buttonfun(onButtonClicked = {})
//        SurfaceEx("Android")
//        BoxEx()
        /*RowEx()*/
//        ColumnEx()
        Outer()
    }
}