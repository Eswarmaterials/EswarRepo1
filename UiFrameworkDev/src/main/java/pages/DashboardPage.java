package pages;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Time']")
	WebElement dashboadLink;


	public void click() {
		dashboadLink.click();
	}
//
//	public void submit() {
//		dashboadLink.submit();
//	}
//
//	public void sendKeys(CharSequence... keysToSend) {
//		dashboadLink.sendKeys(keysToSend);
//	}
//
//	public void clear() {
//		dashboadLink.clear();
//	}
//
//	public String getTagName() {
//		return dashboadLink.getTagName();
//	}
//
//	public @Nullable String getDomProperty(String name) {
//		return dashboadLink.getDomProperty(name);
//	}
//
//	public @Nullable String getDomAttribute(String name) {
//		return dashboadLink.getDomAttribute(name);
//	}
//
//	public @Nullable String getAttribute(String name) {
//		return dashboadLink.getAttribute(name);
//	}
//
//	public @Nullable String getAriaRole() {
//		return dashboadLink.getAriaRole();
//	}
//
//	public @Nullable String getAccessibleName() {
//		return dashboadLink.getAccessibleName();
//	}
//
//	public boolean isSelected() {
//		return dashboadLink.isSelected();
//	}
//
//	public boolean isEnabled() {
//		return dashboadLink.isEnabled();
//	}
//
//	public String getText() {
//		return dashboadLink.getText();
//	}
//
//	public List<WebElement> findElements(By by) {
//		return dashboadLink.findElements(by);
//	}
//
//	public WebElement findElement(By by) {
//		return dashboadLink.findElement(by);
//	}
//
//	public SearchContext getShadowRoot() {
//		return dashboadLink.getShadowRoot();
//	}
//
//	public boolean isDisplayed() {
//		return dashboadLink.isDisplayed();
//	}
//
//	public Point getLocation() {
//		return dashboadLink.getLocation();
//	}
//
//	public Dimension getSize() {
//		return dashboadLink.getSize();
//	}
//
//	public Rectangle getRect() {
//		return dashboadLink.getRect();
//	}
//
//	public String getCssValue(String propertyName) {
//		return dashboadLink.getCssValue(propertyName);
//	}
//	
	

}
