package testMethods;

import core.BaseTest;
import pages.DashboardPage;
import pages.HomePage;

public class DashboardPageMethods extends BaseTest {
	
	public static DashboardPage dashboardPage;
	
	public static void Validate_DashboardLink() {
		
		dashboardPage = new DashboardPage(driver);
		dashboardPage.click();
		
	}

}
