package com.juaracoding.appiumcalculator.hooks;

import java.net.MalformedURLException;

import com.juaracoding.appiumcalculator.drivers.DriverSingleton;
import com.juaracoding.appiumcalculator.drivers.utils.TargetEnvironment;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
  @BeforeAll
  public static void initialize() throws MalformedURLException {
    DriverSingleton.getDriver(TargetEnvironment.GOOGLE_CALCULATOR);
  }

  @AfterAll
  public static void finalTeardown() {
    DriverSingleton.closeDriver();
  }
}
