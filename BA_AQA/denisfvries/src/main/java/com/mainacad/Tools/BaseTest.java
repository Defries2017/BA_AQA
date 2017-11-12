package com.mainacad.Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {


    MyProperties properties = new MyProperties();
    WebDriver driver;

    @BeforeTest
    public void init() {
        if (properties.getBrowserName().equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        if (properties.getBrowserName().equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
            BaseDriver.setDriver(driver);
    }


//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    @AfterTest
    public void tearDown() {
        BaseDriver.getDriver().quit();
    }
}
