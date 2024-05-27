package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/Features/SauceDemo.feature" , glue = "com.StepDefinition")

public class Runner_Class {

}
