package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "resources"
,glue={"stepdefinition"}
//,tags={"@location"}
//,tags={"@invalidlocation"}
,tags={"@login"}
)


public class Testrunner {

}

