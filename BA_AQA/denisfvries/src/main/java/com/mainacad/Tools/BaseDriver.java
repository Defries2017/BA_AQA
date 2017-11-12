package com.mainacad.Tools;

import org.openqa.selenium.WebDriver;

public class BaseDriver {
    private static WebDriver  currentDriver;
    public static WebDriver getDriver() {
        return currentDriver;
    }

    public static void setDriver(WebDriver driver) {
        currentDriver  = driver;
    }
}
