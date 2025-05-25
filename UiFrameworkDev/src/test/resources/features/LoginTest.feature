#Feature:
#Rule
#Background: =  Runs before every scenario / Scenario outline
#Scenario:
#Scenario Outline:
#Given = Precondition to the test, which represent with (Given) keyword
#When = Test step execution, which represent with (When) keyword
#Then = Verification of the output with expected result
#And
#But
# * = Instead of Given, when,then ... we can use this symbol
#Example:
#@Regression
Feature: Login Action
  Description: This feature will test a LogIn and LogOut functionality //Description is not a keyword of Gherkin.

  # if we have 10 web pages in the applications we write 10 feature files then using Background to navigate to each web page
  @Regression
  Scenario: successful Login with valid Credentials
    Given User is on Home Page
    When Enter username and password for Login
