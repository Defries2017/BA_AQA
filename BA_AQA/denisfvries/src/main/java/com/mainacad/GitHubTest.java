package com.mainacad;

import com.mainacad.PAgeObject.HomePageObject;
import com.mainacad.PAgeObject.LoginPageObject;
import com.mainacad.Tools.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitHubTest extends BaseTest {

    @Test
    public void testSuccessLogin() {

       // driver.get("https://github.com");
        HomePageObject homePage= new HomePageObject();
        homePage.openGitHub();

      //  driver.findElement(By.cssSelector("div[class='d-lg-flex'] span a")).click();
        homePage.signInButtonClick();

      //  driver.findElement(By.id("login_field")).sendKeys("blablablabl");

        LoginPageObject loginPage= new LoginPageObject();
        loginPage.loginFieldFill ("blablablabl");

        String checked= "Entre";

        // assertEquals( checked,homePage.getLoginLinkText(),"SDSDSD");

         //Assert.assertEquals ("Name exit link invalid"checked,homePage.getLoginLinkText());


        //TODO: 1) implement input credentials; 2) verify login
    }
}
