Feature: Login Page
	Background:
	Given Navigate to Home Page
  @Regression
  Scenario: successful Login with valid Credentials
   # Given Navigate to Home Page
    When Verify Home Page title
    When Enter username as "Admin" and password as "admin123" for Login
    
  Scenario: successful Login with inValid Credentials
   # Given Navigate to Home Page
    When Verify Home Page title
    When Enter username as "Admin" and password as "admin124" for Login