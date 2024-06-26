package com.msv.sejiwaku.homepage.tigajournalscreen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun LihatRiwayatJurnal(
    onClick:()->Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .height(58.dp)
                    .width(340.dp)
                    .clickable { onClick() },
                border = BorderStroke(1.5.dp, Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                )
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Row {

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 17.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.journallanjut),
                            contentDescription = null,
                            modifier = Modifier.size(27.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(12.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 17.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Lihat Riwayat Jurnal", fontSize = 9.sp)
                        Text(text = "Daftar jurnal yang telah selesai kamu tulis", fontSize = 7.sp)
                    }
                    Spacer(modifier = Modifier.size(58.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 17.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.journalwaktu), contentDescription = null, modifier = Modifier.size(23.dp))
                    }
                }
            }

        }
    }
}

@Preview
@Composable
private fun PreviewOke() {
    LihatRiwayatJurnal(
        onClick = {}
    )
}