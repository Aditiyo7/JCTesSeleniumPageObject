package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath= "//a[normalize-space()='My Account']")
    WebElement btnAcc;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    public void login(String username, String password){
        btnAcc.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
        DriverSingleton.delay(2);
        System.out.println("Login Succeed");
    }
}
