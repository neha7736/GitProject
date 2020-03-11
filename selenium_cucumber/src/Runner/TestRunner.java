package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="E:\\hibernateWork\\SelTest\\selenium_cucumber\\Features" , glue= {"stepDefinition"})
public class TestRunner {

	
	
}
