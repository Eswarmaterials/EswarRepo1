package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		//this.driver=derriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='oxd-form-actions orangehrm-login-action']/child::button")
	WebElement loginButton;
	
	public WebElement getUserName() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

}
