package testMethods;

import core.BaseTest;
import pages.LoginPage;

public class LoginPageMethods extends BaseTest{
	
	LoginPage loginPage;
	
	public void login(String un,String pwd) throws Exception {
		
		loginPage= new LoginPage(BaseTest.createDriver());
		
		loginPage.getUserName().sendKeys(un);
		loginPage.getPassword().sendKeys(pwd);
		loginPage.getLoginButton().click();;
	}

}
