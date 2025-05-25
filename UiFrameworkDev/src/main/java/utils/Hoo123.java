
  package utils;
  
  import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType; 
  import org.openqa.selenium.TakesScreenshot; 
  import org.openqa.selenium.WebDriver;
  import org.testng.ITestResult; 
  import org.testng.Reporter; import
  org.testng.annotations.TestInstance;
  
  import core.BaseTest;

  import io.cucumber.java.After; 
  import io.cucumber.java.AfterAll; 
  import io.cucumber.java.Before; 
  import io.cucumber.java.BeforeAll; 
  import io.cucumber.java.Scenario;
  
  public class Hoo123 extends BaseTest {
  
  // private static WebDriver driver;
  
//  @Before(order=1)
//  public void beforeAll()throws Exception {
//	  createreport();
//	  createDriver(); // Inherited from BaseTest driver = getDriver(); // Inherited from BaseTest 
//	  System.out.println("driver============"+driver); 
//	  extent= getReport(); 
//	  System.out.println("extent============"+extent); 
//  }
//  
//  // @Before // public void beforeScenario(Scenario scenario) { 
//	 if (scenario.getName().equals("Some scenario name")) { 
//
//		 Reporter.setCurrentTestResult(null);
//		 .assignAuthor("Author1");
//		 }
//	  }
//  
  // @AfterAll public void setUp1() throws Exception {
  
//  System.out.println("extent============"+extent); }
//  
  @Before
  public static void startTest(Scenario scenario) {
   String scenarioName=scenario.getName();
  // System.out.println("Currently Running Scenario: ====== "+scenarioName);
   System.out.println("TC--- "+ scenarioName +"    Execution in Progress------" );
  }
  
  @After(order=0) 
  public void embedScreenshot(Scenario scenario) 
  {
	  if(scenario.isFailed()) { 
		  try { 
			  
			  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); 
			  
			//  scenario.attach(screenshot, userDir+"\\failedTestcasesScreenshots\\png",testcasename); 
			  scenario.attach(screenshot, "image/png", "Error screenshot"+LocalDateTime.now()); //java.time
			  scenario.log("Failed Test: " + scenario.getName()); 
	
		  }
		  catch (Exception e) { 
			  e.printStackTrace(); }
		   } 
  }
  
  // @After(order=1) public static void before_or_after_all() throws Exception
 // { //endReport(); // Inherited from BaseTest driver.close(); }
  
  
//  // @Before(order=2) public void beforemethod(ITestResult result,Scenario
//  method) { beforemethod(result,method); }
//  
//  // @AfterAll public void afterMethod() { //endReport(); // Inherited from
//  BaseTest }
//  
  
//  public static WebDriver getDriver() { return driver; } 
//  
//  }
  
  }
 