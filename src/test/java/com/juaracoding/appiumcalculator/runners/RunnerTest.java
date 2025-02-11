package com.juaracoding.appiumcalculator.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = {
    "src/test/resources/features/Calculator.feature",
  },
  glue = {
    "com.juaracoding.appiumcalculator.hooks",
    "com.juaracoding.appiumcalculator.steps",
  },
  plugin = {
    "pretty", 
    "html:target/cucumber-reporting-mobile/reporting.html",
    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
  }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
  
}
