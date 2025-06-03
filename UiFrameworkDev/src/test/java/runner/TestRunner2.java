package runner;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import core.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Use only for JUnit
@CucumberOptions(tags = "@Smoke or ~@Regression",
		// tags="@Smoke or @Regression",
		 features = "src/test/resources/features",
		// features = "src/test/resources/features/ParallelExecution.feature",
		// features = "src/test/resources/features/VerifyHeader.feature:3", //Running
		// particular scenario
		// glue={"testCases"},
		// glue="com.Multi",
		// extraGlue = {"stepDefinition","dataTable","hooks"},
		extraGlue = { "testCases", "dataTable", "utils" },
		plugin = {
				"pretty",
				"html:target/cucumber-reports.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/rerun.txt", //To Rerun failed scenarios
				"timeline:target/Timelineplugin.html" },//Show Running threads in Parallel exe
		monochrome = true, // Print output in Readable format
		dryRun = true,
		// Cucumber dry run is basically used to compile cucumber feature files and step
		// Definitions.
		// true=For example if you want to check whether all feature file steps have
		// corresponding step definitions
		// Note: Dry run=true mode skip the execution of @Before or @After annotations
		// (hooks).
		publish = true

)

public class TestRunner2 extends AbstractTestNGCucumberTests { // Run through testNG

	// Parallel Execution -IF we wants parallel exe then only add below Method
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeSuite
	public void beforeSuite() throws Exception {

		System.out.println("====== Before Suite  ========");

		try {

			BaseTest.createDriver();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			// System.out.println("finally");
		}
	}

	@AfterSuite
	public void afterSuite() throws IOException {

		System.out.println("====== After Suite  ========");

		BaseTest.closeDriver();
	}

}
