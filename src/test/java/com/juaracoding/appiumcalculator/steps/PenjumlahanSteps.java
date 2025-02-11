package com.juaracoding.appiumcalculator.steps;

import org.testng.Assert;

import com.juaracoding.appiumcalculator.drivers.DriverSingleton;
import com.juaracoding.appiumcalculator.screens.CalculatorGoogleScreen;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PenjumlahanSteps {
  private AndroidDriver driver;
  private CalculatorGoogleScreen calculatorScreen;

  @Before
  public void setup() {
    driver = DriverSingleton.getDriver();
    calculatorScreen = new CalculatorGoogleScreen(driver);
  }

  @Given("saya menekan tombol clear")
  public void clickButtonClear() {
    calculatorScreen.clickClear();
  }

  @And("saya menekan tombol nilai pertama")
  public void clickButtonFive() {
    calculatorScreen.clickFive();
  }

  @And("saya menekan tombol plus")
  public void clickButtonPlus() {
    calculatorScreen.clickPlus();
  }

  @And("saya menekan tombol nilai kedua")
  public void clickButtonNine() {
    calculatorScreen.clickNine();
  }

  @When("saya menekan tombol sama dengan")
  public void clickButtonEqual() {
    calculatorScreen.clickEqual();
  }

  @Then("saya mendapatkan hasil {string}")
  public void getResult(String expected) {
    Assert.assertEquals(calculatorScreen.getResult(), expected);
  }

  @And("saya menekan tombol nilai {string}")
  public void clickButtonNumber(String number) {
    for (char charArray : number.toCharArray()) {
      switch (charArray) {
        case '1':
          calculatorScreen.clickOne();
          break;
        case '2':
          calculatorScreen.clickTwo();
          break;
        case '3':
          calculatorScreen.clickThree();
          break;
        case '4':
          calculatorScreen.clickFour();
          break;
        case '5':
          calculatorScreen.clickFive();
          break;
        case '6':
          calculatorScreen.clickSix();
          break;
        case '7':
          calculatorScreen.clickSeven();
          break;
        case '8':
          calculatorScreen.clickEight();
          break;
        case '9':
          calculatorScreen.clickNine();
          break;
        default:
          calculatorScreen.clickZero();
          break;
      }
    }
  }
}
