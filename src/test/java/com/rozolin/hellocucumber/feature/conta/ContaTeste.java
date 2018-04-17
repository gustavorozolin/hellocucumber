package com.rozolin.hellocucumber.feature.conta;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@ContaTeste", monochrome = true, dryRun = false)
public class ContaTeste {
}