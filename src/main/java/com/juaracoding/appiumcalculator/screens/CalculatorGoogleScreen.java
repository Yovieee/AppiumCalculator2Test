package com.juaracoding.appiumcalculator.screens;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.appiumcalculator.drivers.utils.TimeDuration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class CalculatorGoogleScreen {
  private final AndroidDriver driver;
  private final WebDriverWait wait;

  private final By buttonClear = AppiumBy.accessibilityId("kosongkan");
  private final By buttonNine = AppiumBy.accessibilityId("9");
  private final By buttonPlus = AppiumBy.accessibilityId("tambah");
  private final By buttonFive = AppiumBy.accessibilityId("5");
  private final By buttonEqual = AppiumBy.accessibilityId("sama dengan");
  private final By textEdit = AppiumBy.id("com.google.android.calculator:id/result_final");
  private final By buttonZero = AppiumBy.accessibilityId("0");
  private final By buttonOne = AppiumBy.accessibilityId("1");
  private final By buttonTwo = AppiumBy.accessibilityId("2");
  private final By buttonThree = AppiumBy.accessibilityId("3");
  private final By buttonFour = AppiumBy.accessibilityId("4");
  private final By buttonSix = AppiumBy.accessibilityId("6");
  private final By buttonSeven = AppiumBy.accessibilityId("7");
  private final By buttonEight = AppiumBy.accessibilityId("8");

  public CalculatorGoogleScreen(AndroidDriver driver) {
    this.driver = driver;
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeDuration.FIVE));
    this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
  }

  private void clickButton(By locator) {
    try {
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
      element.click();
    } catch (Exception e) {
      System.out.println("Gagal mengklik tombol: " + locator.toString());
      e.printStackTrace();
    }
  }

  public void clickClear() {
    clickButton(buttonClear);
  }

  public void clickFive() {
    clickButton(buttonFive);
  }

  public void clickZero() {
    clickButton(buttonZero);
  }

  public void clickOne() {
    clickButton(buttonOne);
  }

  public void clickTwo() {
    clickButton(buttonTwo);
  }

  public void clickThree() {
    clickButton(buttonThree);
  }

  public void clickFour() {
    clickButton(buttonFour);
  }

  public void clickSix() {
    clickButton(buttonSix);
  }

  public void clickSeven() {
    clickButton(buttonSeven);
  }

  public void clickEight() {
    clickButton(buttonEight);
  }

  public void clickPlus() {
    clickButton(buttonPlus);
  }

  public void clickNine() {
    clickButton(buttonNine);
  }

  public void clickEqual() {
    clickButton(buttonEqual);
  }

  public String getResult() {
    try {
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(textEdit));
      return element.getText();
    } catch (Exception e) {
      System.out.println("Gagal mengambil hasil kalkulasi.");
      e.printStackTrace();
      return "";
    }
  }
}
