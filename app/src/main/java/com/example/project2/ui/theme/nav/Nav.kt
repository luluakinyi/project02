package com.example.project2.ui.theme.nav


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproject.navigation.OrderingScreen
import com.example.myproject.navigation.RestaurantsScreen
//import com.example.myproject.ui.theme.nav.Nav.kt
//import com.example.myproject.ui.theme.screens.home.homeScreen
//import com.example.myproject.ui.theme.screens.flight.OrderingScreen
//import com.example.myproject.ui.theme.screens.train.PaymentScreen
//import com.example.myproject.ui.theme.screens.login.LoginScreen
//import com.example.myproject.ui.theme.screens.logout.LogOutScreen
//import com.example.myproject.ui.theme.screens.means.HomeScreen
//import com.example.myproject.ui.theme.screens.mybookings.MyBookingScreen
//import com.example.myproject.ui.theme.screens.mybookings.UpdateFlightScreen
//import com.example.myproject.ui.theme.screens.register.RegisterScreen
//import com.example.myproject.ui.theme.screens.welcome.WelcomeScreen
import com.example.project2.navigation.ROUTE_HOME
import com.example.project2.navigation.ROUTE_LOGIN
import com.example.project2.navigation.ROUTE_LOGOUT
import com.example.project2.navigation.ROUTE_ORDERING
import com.example.project2.navigation.ROUTE_REGISTER
import com.example.project2.navigation.ROUTE_RESTAURANTS
import com.example.project2.navigation.ROUTE_SPLASH
import com.example.project2.navigation.ROUTE_UPDATEPAYMENT
import com.example.project2.ui.theme.screens.logout.LogOutScreen

//import com.example.mvvmarchitecture.ui.theme.screens.products.AddProductsScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.about.AboutScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.about.Aboutscreen
//import com.vic.mvvmarchitecture.ui.theme.screens.home.HomeScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.login.LoginScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.products.AddProductsScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.products.UpdateProductsScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.products.ViewProductsScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.products.ViewUploadsScreen
//import com.vic.mvvmarchitecture.ui.theme.screens.register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_SPLASH) { WelcomeScreen(navController) }
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
        composable(ROUTE_REGISTER) { RegisterScreen(navController)}
        composable(ROUTE_HOME) { HomeScreen(navController) }
        composable(ROUTE_RESTAURANTS) { RestaurantsScreen(navController) }
        composable(ROUTE_ORDERING) { OrderingScreen(navController) }



        composable(ROUTE_LOGOUT) { LogOutScreen(navController) }
        composable(ROUTE_UPDATEPAYMENT+"/{id}"){
                passedData ->
            UpdateFlightScreen(
                navController,passedData.arguments?.getString("id")!!
            )
        }



//        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
//        composable(ROUTE_VIEW_PRODUCT){ ViewProductsScreen(navController)}

//        composable(ROUTE_VIEW_UPLOAD){ViewUploadsScreen(navController)}
        //        composable(ROUTE_BOOKING_DETAIL) { BookingDetailScreen(navController) }
    }
}

@Composable
fun UpdateFlightScreen(navController: NavHostController, string: String) {

}

@Composable
fun HomeScreen(navController: NavHostController) {

}

@Composable
fun RegisterScreen(navController: NavHostController) {

}

@Composable
fun LoginScreen(navController: NavHostController) {

}

@Composable
fun WelcomeScreen(navController: NavHostController) {

}
