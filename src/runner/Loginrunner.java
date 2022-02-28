package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\SeleniumPrjJan\\Ebanking\\src\\feature\\Login.feature",
                  glue="stepdefination",monochrome=true,
                  plugin="pretty")
public class Loginrunner
{

}
