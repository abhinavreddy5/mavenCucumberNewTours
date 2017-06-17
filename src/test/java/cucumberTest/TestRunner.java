package cucumberTest;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features", 
glue="com.jpmc.stepDefinitions",
format={"pretty","html:target/cucumber"},
tags={"@newtours"})
public class TestRunner {

}
