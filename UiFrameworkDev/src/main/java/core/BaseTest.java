package core;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import config.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;

	SoftAssert softAssert= new SoftAssert();
	
	public static Wait<WebDriver> wait;
	
	public static JavascriptExecutor js;

	protected static String testcasename;
	
	ConfigFileReader config=new ConfigFileReader();

	@BeforeSuite
	public static WebDriver createDriver() throws Exception {
		
		if(driver==null){
			ConfigFileReader config=new ConfigFileReader();
			//String browser=ConfigFileReader.getBrowser();
			String browser=config.getBrowser();
			//System.out.println("BROWSER Name:   "+browser);
			
			if(browser.equals("chrome")) {
				
			     WebDriverManager.chromedriver().setup();
			     ChromeOptions options = new ChromeOptions();
			     options.addArguments("--remote-allow-origins=*");
			     //options.addArguments("--headless");  // Run in headless mode (optional)
			     //options.addArguments("--start-maximized");
			     
			     //How to handle Chrome's change password popup in Selenium
			     //To handle Chrome's "Save password" or "Change password" popup in Selenium with Java, you must disable the Chrome password manager, because these are browser-level popups and not part of the HTML DOM, so Selenium cannot interact with them directly.
			     
			         //Solution:Recommended Approach: Disable the Popup or Disable Chrome password manager
			       /** 
			        Map<String, Object> prefs = new HashMap<>();
			        prefs.put("credentials_enable_service", false);
			        prefs.put("profile.password_manager_enabled", false);

			        ChromeOptions options = new ChromeOptions();
			        options.setExperimentalOption("prefs", prefs);
			        
			        "credentials_enable_service": false disables Chrome's credential saving service.

					"profile.password_manager_enabled": false disables the password manager.
			        
			        */
			     
		         driver = new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		         wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		         
		         js = (JavascriptExecutor) driver;
		         
		         driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");		        
			}
		}	
		
		 return driver;
	}
	
	public static void closeDriver() throws IOException {
		
		System.out.println("close driver =====   "+driver);
		
		driver.quit();

     }	
	
	/**
	Here's how OOP concepts are applied in a Selenium project:
	Abstraction:
		Hides complex implementation details from the user, exposing only the necessary functionality. 
		In Selenium, this can be achieved through the Page Object Model (POM) design pattern, where each web page is represented by a class, hiding the locator implementation details from test scripts. 
		Example: WebDriver driver = new ChromeDriver() initializes the Chrome browser using the WebDriver interface, abstracting the browser-specific implementation details. 
	
	Inheritance:
		Allows classes to inherit properties and methods from their parent classes, promoting code reusability. 
		In Selenium, a base class can be created to handle common functionalities like WebDriver initialization, waits, and configuration. Other classes (test classes, utility classes) can then extend the base class to inherit these functionalities, reducing code duplication. 
	
	Polymorphism:
		Enables objects of different classes to be treated as objects of a common type, allowing for flexible and dynamic behavior. 
		Method overloading and overriding are examples of polymorphism in Selenium. Method overloading allows a class to have multiple methods with the same name but different parameters (e.g., implicit wait with different time units in Selenium).
		Method overriding allows subclasses to provide their own implementation of methods inherited from their parent class (e.g., the get() method in different browser drivers). 
	
	Encapsulation:
		Bundles code and data together within a single unit, controlling access to them. 
		In Selenium, Page Object Model classes encapsulate locators and methods related to a specific page, ensuring that the data is accessed and modified through defined interfaces. 
		Example: In a POM class, data members (locators) are declared using @FindBy and initialized using a constructor, making them accessible to methods within the class but not directly from test scripts. 

*/
}
