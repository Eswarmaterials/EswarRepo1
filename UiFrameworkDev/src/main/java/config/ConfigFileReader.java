package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader  {
	
	static String browser;
	static String env;
	static String instanceURI;
	
	static Properties properties;
	
	public ConfigFileReader(){
		  	
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/java/config/EnvConfig.properties"));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getBrowser(){
		String browser = properties.getProperty("browser");
		
		if(browser!= null)
			return browser;
		
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");		
	}
	
}