package com.mainacad.PAgeObject;

import com.mainacad.Tools.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectors {

     private WebDriver driver;

    public Selectors() {
        this.driver = BaseDriver.getDriver();

    }

    public WebElement id(String locator) {
        return driver.findElement(By.id(locator));
    }

    public WebElement cssSelector(String locator) {
        return driver.findElement(By.cssSelector(locator));
    }

    public WebElement className(String locator) {
        return driver.findElement(By.className(locator));
    }

    public WebElement name(String locator) {
        return driver.findElement(By.name(locator));
    }
}
