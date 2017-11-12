package com.mainacad.PAgeObject;

import com.mainacad.Tools.BaseDriver;
import org.openqa.selenium.WebDriver;

public class BasePageObject extends Selectors  {

        public void navigateToPage(String url){
           BaseDriver.getDriver().get(url);

        }
    }

