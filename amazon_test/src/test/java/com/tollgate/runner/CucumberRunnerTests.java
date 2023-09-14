package com.tollgate.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Features",
					glue= {"StepDefinations"},
					monochrome=true
				)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
