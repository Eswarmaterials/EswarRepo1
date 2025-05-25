package testMethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import core.BaseTest;
import pages.LoginPage;
import pages.VerifyHeaderPage;
import testData.Constants;
//import utils.Hoo123;

public class LoginTestMethods extends BaseTest{
	
	LoginPage loginPage;
	
	VerifyHeaderPage verifyHeaderPage=new VerifyHeaderPage(driver);
	
	public void veryTitle() {
		
		//verifyHeaderPage=new VerifyHeaderPage(driver);
		
		//String title=verifyHeaderPage.verifyTitle();

		String title=driver.getTitle();
		
		System.out.println("title  ---" +title);
		
		assertEquals("Selenium Practice - Login", title);
	}

	
	public void veryHeader() {
		
		String header=verifyHeaderPage.verifyHeader();
		
		System.out.println("header  ---" +header);
		
		assertEquals("Selenium - Automation Practice Form", header);
	}

	public void enter_userName() {
		
	loginPage=new LoginPage(driver);
		
	System.out.println(Constants.policyName);
	
	loginPage.enetrUserName(Constants.userName);
	
	}

	public void enter_password() {
		
	//LoginPage loginPage=new LoginPage(driver);
		
	loginPage.enetrPassword(Constants.password);
	
	}
}
