package core;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	private static int count=0;
	private static int maxReTry=0;

	public boolean retry(ITestResult result) {

           if(count<maxReTry) {
        	   count++;
        	   return true;
        	   
           }
		return false;
	}
}
