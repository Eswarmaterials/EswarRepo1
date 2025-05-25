package testCases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testMethods.LoginTestMethods;

public class VerifyHeader {
	
	LoginTestMethods login=new LoginTestMethods();
	
    @Given("Verify Title")
	public void veryTitle() {
		
    	login.veryTitle();
	}
    
    @When("Verify Header")
   	public void veryHeader() {
   		
       	login.veryHeader();
   	}

}
