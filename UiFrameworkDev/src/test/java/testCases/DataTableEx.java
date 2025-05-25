package testCases;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
	
public class DataTableEx {
	
	 @Given("the user is logged in")
	 public void backgoundEx(){
		  System.out.println("Background ---");
	 }
	
	 //Data Table as List
	  @When("Data table example as List") 
	  public void enterData(DataTable table) { 
		  System.out.println("Data table example as List: ");
		 
		//Initialize data table 
		 List<List<String>> data = table.asLists();
		
		//	System.out.println(data.get(1)); //[First Name, Tom]
		//	System.out.println(data.get(1).get(1)); //Tom
		  
		 System.out.println("<data.size() ===" +data.size());
		  
		 for(int i=1; i<data.size(); i++) {
			
		    System.out.println(data.get(i).get(1)); 
		  }
	   } 
	 
		//Data table as Map 
		@When("Data table example as Map") 
		public void enterDataMap(DataTable table){
		  System.out.println("Data table example as Map: ");
		  //Initialize data table 
		  List<Map<String,String>> data1 = table.asMaps();
		 
		 //System.out.println(data1.get(1)); 	      
		 //System.out.println(data1.get(1).get(1));    
		  
		  for(int i=0; i<data1.size(); i++) {
				
			System.out.println("Username = "+data1.get(i).get("Username")); 
			
			System.out.println("Password = "+data1.get(i).get("Password"));
				      
		  }
	   } 
	
		//Scenario outline example	 
		 @When("enter {string} and {string}") 
		 public void scenarioOutlineExample(String username, String password) throws Exception{ 
		   
		    System.out.println(username  + " =  "+ password); 
		 
		 } 
		   
		 //Scenario single row through Data table
		 @When("User enters username as {string} and password as {string}")
		 public void goToHomePage(String userName, String passWord) {
		
			System.out.println("Data Parameterisation1:  "+ userName +" = "+passWord);
		 }
 	 
}
