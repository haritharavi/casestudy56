package casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucum_casestudy/casestudy4.feature",glue="casestudy",
plugin="html:target/htmlreport.html")
public class Runner1 {


}
