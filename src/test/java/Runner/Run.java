package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/features/package.feature",
        glue ={"stepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {

}
