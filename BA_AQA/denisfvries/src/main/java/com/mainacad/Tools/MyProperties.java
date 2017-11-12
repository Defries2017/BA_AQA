package com.mainacad.Tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {

    private static String PROPERTIES_PATH = "src/test.properties";
    private static String BROWSER_NAME;

    public MyProperties( ) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.BROWSER_NAME= properties.getProperty("browserName");
    }



    public static String getBrowserName() {
        return BROWSER_NAME;
    }

    {

    }
}
