package com.msv.sejiwaku.inJurnal.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun topbarJournal(navController: NavController, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Tosca
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = title,
            color = Tosca,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.saveicon),
                contentDescription = "save",
                modifier = Modifier.size(20.dp),
                tint = Tosca
            )
        }
    }
}

@Preview
@Composable
private fun topbarJournalPrev() {
    val navController = rememberNavController()
    SejiwakuTheme {
        topbarJournal(navController = navController, title = "Menggambar")
    }
}