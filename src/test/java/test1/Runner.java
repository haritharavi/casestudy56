package test1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/feature2.feature",glue="test1", //plugin="json:target/jsonreport.json",
plugin="junit:target/xmlreport.xml")
//tags={"~@log"})
public class Runner {

}
