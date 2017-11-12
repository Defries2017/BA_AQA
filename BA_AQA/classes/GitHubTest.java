package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitHubTest {

    @Test
    public void testSuccessLogin() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://github.com");

        driver.findElement(By.cssSelector("div[class='d-lg-flex'] span a")).click();

        driver.findElement(By.id("login_field")).sendKeys("blablablabl");

        //TODO: 1) implement input credentials; 2) verify login
    }
}
