package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.support.PageFactory;

import java.net.URI;

public class PageObject {
    protected static AppiumDriver driver;

    public PageObject() {
        PageFactory.initElements(driver, this);
    }

    public void initAndroid() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 Pro")
                .setPlatformVersion("13")
                .setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main");

        driver = new AndroidDriver(new URI("http://0.0.0.0:4723").toURL(), options);
    }

    public void initIOS() throws Exception {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 14 Pro Max")
                .setPlatformVersion("16.4")
                .setBundleId("com.apple.mobilesafari");

        driver = new IOSDriver(new URI("http://0.0.0.0:4723").toURL(), options);
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
