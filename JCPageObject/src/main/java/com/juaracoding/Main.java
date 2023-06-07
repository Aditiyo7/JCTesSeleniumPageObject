package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {

        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com");
        DriverSingleton.scroll(500);

//        LoginPage loginPage = new LoginPage();
//        loginPage.login("aditiyo.nugroho7","welocme@789");


        CartPage cartPage = new CartPage();
        cartPage.cart("Black", "M");
//        String a = cartPage.txtAddedToCart();
//        System.out.println(a);

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.checkout("Aditiyo","Nugroho","ID","Jl Citra Villa","JB","Bekasi","17510","08998219581","john.boljug@gmail.com");
//        String b = checkoutPage.validCheck();
//        System.out.println(b);
        DriverSingleton.closeObjectInstance();
    }
}