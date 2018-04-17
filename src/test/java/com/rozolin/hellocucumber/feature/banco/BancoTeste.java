package com.rozolin.hellocucumber.feature.banco;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@BancoTeste", monochrome = true, dryRun = false)
public class BancoTeste {
}