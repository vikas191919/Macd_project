package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
features = "resources"
,glue={"stepdefinition"}
,tags={"@location"}
//,tags={"@invalidlocation"}
//,tags={"@test"}
)


public class Testrunner {

}

