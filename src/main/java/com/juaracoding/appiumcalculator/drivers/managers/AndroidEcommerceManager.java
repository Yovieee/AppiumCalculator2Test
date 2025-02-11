package com.juaracoding.appiumcalculator.drivers.managers;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidEcommerceManager {
  public static AndroidDriver make() throws MalformedURLException {
    UiAutomator2Options options = new UiAutomator2Options();
    options.setCapability("platformName", "Android");
    options.setCapability("appium:deviceName", "Y5P7PVR8KRHEQKCI");
    options.setCapability("appium:automationName", "UiAutomator2");
    // options.setCapability("appium:appPackage",
    // "com.sec.android.app.popupcalculator");
    // options.setCapability("appium:appActivity",
    // "com.sec.android.app.popupcalculator.Calculator");

    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    return driver;
  }
}
