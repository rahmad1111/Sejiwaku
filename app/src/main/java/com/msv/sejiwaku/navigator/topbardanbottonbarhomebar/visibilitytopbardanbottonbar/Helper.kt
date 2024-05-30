package com.msv.sejiwaku.navigator.topbardanbottonbarhomebar.visibilitytopbardanbottonbar

import com.msv.sejiwaku.navigator.BottonBarScreen
//import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi


fun String?.shouldShowBottomBar():Boolean{
    return this in setOf(
        BottonBarScreen.Home.route,
        BottonBarScreen.Konseling.route,
        BottonBarScreen.Journal.route,
        BottonBarScreen.Journey.route
    )
}