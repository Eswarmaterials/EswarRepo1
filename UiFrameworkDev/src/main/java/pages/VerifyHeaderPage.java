package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHeaderPage {
	
	WebDriver driver;
	
	public VerifyHeaderPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//title[contains(text(),'Selenium Practice - Login')]")
	WebElement title;
	
	
	@FindBy(xpath = "//*[contains(h1,'Selenium - Automation Practice Form')]")
	WebElement header;
	
	public String verifyTitle() {
		
	title.findElement(By.id(null));
	title.click();	
		return title.getText();
		
	}	
	
	public String verifyHeader() {
		
		return header.getText();
	}	
		
}
