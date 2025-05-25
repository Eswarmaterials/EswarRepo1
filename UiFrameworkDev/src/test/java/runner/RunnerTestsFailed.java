package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(tags = "",
        features = "@target/rerun.txt",
        glue = ".testCases",
        plugin =  {
                "pretty"
        }
)
 
public class RunnerTestsFailed extends AbstractTestNGCucumberTests {
}