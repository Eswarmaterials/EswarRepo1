package testCases;

import io.cucumber.java.en.When;
import testMethods.DashboardPageMethods;

public class DashboardPageTest {
	
	@When("Click on Dashboard Link")
	public void click_on_dashboard_link() {
	  
		DashboardPageMethods.Validate_DashboardLink();
	}

}
