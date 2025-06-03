package testCases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testMethods.HomePageMethods;

public class HomePageTest {
	
	HomePageMethods homeMethods=new HomePageMethods();
	
	@Given("Navigate to Home Page")
	public void navigate_To_HomePage() throws Exception {
	
		homeMethods.validate_HomePage();
		
	}
	
	@When("Verify Home Page title")
	public void verify_Home_Paage_Title() {
	
		homeMethods.validate_HomePage_Title();
		
	}

}
