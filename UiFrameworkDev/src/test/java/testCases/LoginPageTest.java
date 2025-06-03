package testCases;

import io.cucumber.java.en.When;
import testMethods.LoginPageMethods;

public class LoginPageTest {
	
	LoginPageMethods loginMethods=new LoginPageMethods();
	
	@When("Enter username as {string} and password as {string} for Login")
	public void enter_username_as_and_password_as_for_login(String un, String pwd) throws Exception {
		
		loginMethods.login(un, pwd);
		
	}

}
