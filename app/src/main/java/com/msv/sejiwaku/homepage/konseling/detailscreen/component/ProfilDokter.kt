package com.msv.sejiwaku.homepage.konseling.detailscreen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.homepage.konseling.component.Bintang

@Composable
fun ProfileDokter(
    screen:()->Unit
) {
    val ukuran = 97.dp
    Box {
        Surface(
            modifier = Modifier
                .clickable { }
                .height(ukuran)
                .fillMaxWidth(),
            color = Color(
                red = 0.2f,
                green = 0.725f,
                blue = 0.675f,
                alpha = 1.0f
            ),
            shape = RoundedCornerShape(10.dp),

            ) {
        }
        Surface(
            onClick = screen,
            modifier = Modifier
                .height(94.dp)
                .fillMaxWidth(),
            color = Color.White,
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color = Color(
                red = 0.2f,
                green = 0.725f,
                blue = 0.675f,
                alpha = 1.0f
            ),)
        ) {
            Column {
                Text(text = "deskripsidokter")
            }
        }
    }
}

@Preview
@Composable
private fun PreviewProfileDokter() {
    //ProfileDokter()
}