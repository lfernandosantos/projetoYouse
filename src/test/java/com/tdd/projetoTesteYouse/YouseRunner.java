package com.tdd.projetoTesteYouse;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty", "html:target/cucumber"},
			features = "src/tests/resource"
			)
public class YouseRunner {

}
