package com.mainacad.PAgeObject;

import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePageObject{

    private String loginFieldID = "login_field";

    public  void loginFieldFill (String loginName){
        id(loginFieldID).sendKeys (loginName);
    }
}
