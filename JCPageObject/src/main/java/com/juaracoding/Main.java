package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {

        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com");
        DriverSingleton.scroll(500);

        LoginPage loginPage = new LoginPage();
        loginPage.login("aditiyo.nugroho7","welocme@789");


        CartPage cartPage = new CartPage();
        cartPage.cart("black", "medium");

        DriverSingleton.closeObjectInstance();
    }
}