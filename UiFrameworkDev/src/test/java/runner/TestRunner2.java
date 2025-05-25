package runner;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import core.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Use only for JUnit
@CucumberOptions(
		//tags="@Smoke or ~@Regression",
		 tags="@Smoke or @Regression",
		//features = "src/test/resources/features",
		features = "src/test/resources/features/VerifyHeader.feature:3",
//				features = {
//				“src/test/resources/features/HighPriority.feature”,
//			    “src/test/resources/features/MediumPriority.feature”
//		 		}
		//glue={"testCases"},
		//glue="com.Multi",
		//extraGlue = {"stepDefinition","dataTable","hooks"},
		extraGlue = {"testCases","dataTable","utils"},
		plugin = {
				"pretty", 
				"html:target/cucumber-reports.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/rerun.txt"},
		monochrome = true,
		dryRun = false //Cucumber dry run is basically used to compile cucumber feature files and step Definitions. If there is any compilation errors it will show when we use dry run
				//For example if you want to check whether all feature file steps have corresponding step definitions, you can specify it like this: @CucumberOptions(dryRun=true)		
				//Note: Dry run mode does not skip the execution of @Before or @After annotations (hooks). 
		//strict = false,
		//extraGlue=false,
		//tags = "@Smoke and @Sanity"
		//publish=true
		//uuidGenerator=true
		)

public class TestRunner2 extends AbstractTestNGCucumberTests{ //Running from TestNg
	
	//Parallel Execution
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
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			//System.out.println("finally");
		}
	}

	  @AfterSuite 
	  public void afterSuite() throws IOException {
		 
		  System.out.println("====== After Suite  ========");
		  
	  	  BaseTest.closeDriver();
	  }

}
