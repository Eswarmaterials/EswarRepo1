Feature: Dashboard Page
  @Regression
  Scenario: Dashboard Page -Click on Dashboard link
    Given Navigate to Home Page
    When Verify Home Page title
    When Enter username as "Admin" and password as "admin123" for Login
    When Click on Dashboard Link
