package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    private WebDriver driver;
    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[normalize-space()='Orders']")
    WebElement orders;

    @FindBy(xpath="//a[@class='woocommerce-Button button']")
    WebElement browseProduct;

    @FindBy(xpath="//div[6]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
    WebElement product;

    @FindBy(id="pa_color")
    WebElement menuColor;

    @FindBy(id="pa_size")
    WebElement menuSize;

    @FindBy(xpath="//button[normalize-space()='Add to cart']")
    WebElement addCart;

    @FindBy(xpath = "//a[@class='button wc-forward wp-element-button']")
    WebElement viewCart;



    public void cart(String color, String size){
        orders.click();
        browseProduct.click();
        DriverSingleton.delay(2);
        DriverSingleton.scroll(1000);
        product.click();
        DriverSingleton.scroll(700);
        Select select = new Select(menuColor);
        Select select1 = new Select(menuSize);
        select.selectByValue(color);
        select1.selectByValue(size);
        addCart.click();
        DriverSingleton.delay(3);
        viewCart.click();
        DriverSingleton.scroll(500);
        DriverSingleton.delay(3);
        System.out.println("Product Selected and Add to Cart");
    }

}
