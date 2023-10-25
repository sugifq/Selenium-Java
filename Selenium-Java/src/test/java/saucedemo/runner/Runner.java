package saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/saucedemo/features",
        glue = {"src/test/java/saucedemo/stepDef"},
//        monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports/cucumber.html",

        }
)
public class Runner {

}
