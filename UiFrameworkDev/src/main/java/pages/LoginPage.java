package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
//	@FindBy(xpath = "//*[contains(title,'Selenium Practice - Login')]")
//	WebElement Header;
	
   //@FindBy(id ="email")
	@FindBy(xpath="//*[@id='email']")
	WebElement userName;
	
	@FindBy(xpath ="//*[@name='password1']")
	WebElement password;
	
//	@FindByAll(partialLinkText ="//*[text()='Checkboxes']")
//	WebElement un;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	//This initElements method will create all WebElements	
	}
	
	
	public void enetrUserName(String un) {
		userName.sendKeys(un);//(Constants.policyName);	
	}	
	
	public void enetrPassword(String password) {
		this.password.sendKeys(password);			
	}	
}
