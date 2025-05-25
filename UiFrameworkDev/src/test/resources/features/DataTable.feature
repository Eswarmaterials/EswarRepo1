@Smoke @Regression
Feature: Data Table example

  Background: 
    Given the user is logged in
 	  #And goes to landing page
  @Smoke
  Scenario: Successful Login with Valid Credentials
    When User enters username as "Admin" and password as "admin123"

  Scenario Outline: scenario outline example
    When enter "<username>" and "<password>"

    Examples: 
      | username | password  |
      | Eswar1   | Eswar@151 |
      | Eswar2   |       152 |
      | Eswar3   | Eswar153  |

  Scenario: Data Table example
    When Data table example as List
      | Fields                 | Values              |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              |                  01 |

  Scenario: Data Table example
    When Data table example as Map
      | Username | Password  |
      | Eswar1   | Eswar@151 |
      | Eswar2   | Eswar@152 |
      | Eswar3   | Eswar@153 |
