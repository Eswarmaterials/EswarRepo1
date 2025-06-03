package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTest;

public class Waits extends BaseTest{

	public void explicitWait(By element) {
		
		FluentWait<WebDriver> wait = new WebDriverWait(driver,Duration.ofMillis(1000))
				.withTimeout(Duration.ofMillis(1000))          
				.pollingEvery(Duration.ofMillis(1000))          
				.ignoring(NoSuchElementException.class)
				//.ignoreAll(null)
				.withMessage(testcasename);
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));		
	}
	
	public static void clickOn(WebDriver driver, WebElement locator, Duration timeout)
	 {
	        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	        locator.click();

	  }
}
