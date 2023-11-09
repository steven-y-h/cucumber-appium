package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook extends PageObject {
    @Before("@Android")
    public void setUpAndroid() throws Exception {
        initAndroid();
    }

    @Before("@IOS")
    public void setUpIOS() throws Exception {
        initIOS();
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
