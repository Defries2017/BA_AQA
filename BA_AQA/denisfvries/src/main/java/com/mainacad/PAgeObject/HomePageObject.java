package com.mainacad.PAgeObject;

public class HomePageObject extends BasePageObject {
    private static String URL ="https://github.com";
    private  String SignInButtonCSS="div[class='d-lg-flex'] span a";

    public void openGitHub(){
        navigateToPage( URL );
    }

    public LoginPageObject signInButtonClick( ){
        cssSelector(SignInButtonCSS).click();
        return new LoginPageObject();


    }
}
