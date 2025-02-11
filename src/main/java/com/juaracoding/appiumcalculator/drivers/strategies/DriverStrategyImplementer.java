package com.juaracoding.appiumcalculator.drivers.strategies;

import java.net.MalformedURLException;

import com.juaracoding.appiumcalculator.drivers.managers.AndroidCalculatorManager;
import com.juaracoding.appiumcalculator.drivers.managers.AndroidEcommerceManager;
import com.juaracoding.appiumcalculator.drivers.managers.AndroidGoogleCalculatorManager;
import com.juaracoding.appiumcalculator.drivers.utils.TargetEnvironment;

import io.appium.java_client.android.AndroidDriver;

public class DriverStrategyImplementer {
  public AndroidDriver setStrategy(String strategy) throws MalformedURLException {
    switch (strategy) {
      case TargetEnvironment.CALCULATOR:
        return AndroidCalculatorManager.make();
      case TargetEnvironment.ECOMMERCE:
        return AndroidEcommerceManager.make();
        case TargetEnvironment.GOOGLE_CALCULATOR:
        return AndroidGoogleCalculatorManager.make();
      default:
        return AndroidCalculatorManager.make();
    }
  }
}