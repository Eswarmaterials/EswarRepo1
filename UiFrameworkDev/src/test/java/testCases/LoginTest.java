package testCases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testMethods.LoginTestMethods;

public class LoginTest {

	LoginTestMethods login=new LoginTestMethods();
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws InterruptedException {
		
		System.out.println("Home Page----");	
	}
	
    @When("Enter username and password for Login")
	public void enter_username_and_password_for_login() throws InterruptedException {

		login.enter_userName();
		login.enter_password();
		Thread.sleep(30000);	
	}
}
