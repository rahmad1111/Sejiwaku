package com.msv.sejiwaku.navigator

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding1
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding2
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding3
import com.msv.sejiwaku.bagianonboardingnya.OnboardingHasil
import com.msv.sejiwaku.loginpage.LoginPage
import com.msv.sejiwaku.loginpage.LupaPassword
import com.msv.sejiwaku.loginpage.RegisterPage

fun NavGraphBuilder.bagianlogindantemannya(navController: NavHostController){
    navigation(
        route = Urutan.BAGIANLOGINDANTEMANNYA,
        startDestination = BagianLoginDanTemannya.Login.route
    ){
        // Autentikasi
        composable(route = BagianLoginDanTemannya.Login.route){
            LoginPage(navController = navController)
        }
        composable(route = BagianLoginDanTemannya.Register.route){
            RegisterPage(navController = navController)
        }
        composable(route = BagianLoginDanTemannya.LupaPassword.route){
            LupaPassword(navController = navController)
        }

        // Onboarding
        composable(route = BagianLoginDanTemannya.OnboardingPertama.route){
            HalamanOnboarding1(navController = navController)
        }
        composable(route = BagianLoginDanTemannya.OnboardingKedua.route){
            HalamanOnboarding2(navController = navController)
        }
        composable(route = BagianLoginDanTemannya.OnboardingKetiga.route){
            HalamanOnboarding3(navController = navController)
        }
        composable(route = BagianLoginDanTemannya.HasilOnboarding.route){
            OnboardingHasil(navController = navController)
        }
    }
}

sealed class BagianLoginDanTemannya(val route: String){
    object Login : BagianLoginDanTemannya(route = "LOGIN")
    object Register : BagianLoginDanTemannya(route = "REGISTER")
    object LupaPassword : BagianLoginDanTemannya(route = "LUPAPASSWORD")
    object OnboardingPertama : BagianLoginDanTemannya(route = "ONBOARDINGPERTAMA")
    object OnboardingKedua : BagianLoginDanTemannya(route = "ONBOARDINGKEDUA")
    object OnboardingKetiga : BagianLoginDanTemannya(route = "ONBOARDINGKETIGA")
    object HasilOnboarding : BagianLoginDanTemannya(route = "HASILONBOARDING")
}