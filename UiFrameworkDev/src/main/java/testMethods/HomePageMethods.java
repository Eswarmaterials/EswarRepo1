package testMethods;

import static org.testng.Assert.assertEquals;

import core.BaseTest;
import pages.HomePage;

public class HomePageMethods extends BaseTest{
	
	public HomePage homePage;
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public void validate_HomePage() throws Exception {
		
		//homePage=new HomePage(driver);
	
		homePage=new HomePage(BaseTest.createDriver());
	
		driver.navigate().to(url);
		assertEquals(driver.getTitle(),"OrangeHRM");
		
		//js.executeAsyncScript("arguments[0].scrollIntoView(true);", homePage.Verify_copyRightLink()); //org.openqa.selenium.ScriptTimeoutException: script timeout
		System.out.println(homePage.Verify_copyRightLink().getText());
				
	}
	
	public void validate_HomePage_Title() {

		driver.navigate().to(url);
		assertEquals(driver.getTitle(),"OrangeHRM");
		
		//js.executeAsyncScript("arguments[0].scrollIntoView(true);", homePage.Verify_copyRightLink()); //org.openqa.selenium.ScriptTimeoutException: script timeout
		System.out.println(homePage.Verify_copyRightLink().getText());
				
	}
	
	
	
}
