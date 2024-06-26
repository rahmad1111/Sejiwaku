package com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.curhatpadadirisendiri.musik

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.component.WaktuTimerDalam
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import kotlinx.coroutines.launch

@Composable
fun MusikDua(
    navController: NavController
) {
    val mContext = LocalContext.current
    val mMediaPlayer = MediaPlayer.create(mContext, R.raw.audio1)
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val dataStore = DataStoreJourneyDua(context)

    Box(
        modifier = with(Modifier){
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.backgroundmusik),
                    contentScale = ContentScale.FillBounds
                )
        }
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.backdua), contentDescription = "tombol back",modifier = Modifier
                    .size(20.dp)
                    .clickable { navController.navigate(BottonBarScreen.DetailCurhatPadaDiriSendiri.route) })
                Image(painter = painterResource(id = R.drawable.nextdua), contentDescription = "tombol next", modifier = Modifier
                    .size(width = 45.dp, height = 20.dp)
                    .clickable {
                        coroutineScope.launch {
                            dataStore.saveStatus(true)
                        }
                        navController.navigate(BottonBarScreen.DetailKamuPastiBisaTiga.route){
                            popUpTo(BottonBarScreen.DetailMusikDua.route){
                                inclusive = true
                            }
                        }
                    }
                )
            }
            Spacer(modifier = Modifier.size(170.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.logomusik), contentDescription = "logo musik", modifier = Modifier.size(203.dp))
            }
            Spacer(modifier = Modifier.size(169.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Divider(color = Color.White, thickness = 1.dp)
                Spacer(modifier = Modifier.size(10.dp))
                WaktuTimerDalam(
                    timer = "15 : 00",
                    colortext = Color.White,
                    colorbackground = Color.Transparent,
                    colorborder = Color.White,
                    ukuranborder = 2,
                    onClicksatu = { mMediaPlayer.start() },
                    onClickdua = { mMediaPlayer.pause() }
                )
                Spacer(modifier = Modifier.size(10.dp))
                Divider(color = Color.White, thickness = 1.dp)
            }
        }
    }
}

@Preview
@Composable
private fun PreviewMusikSatu() {
    MusikDua(navController = rememberNavController())
}