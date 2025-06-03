@Parallel
Feature: Data Table example

  @Parallel
  Scenario Outline: scenario outline example
    When enter "<username>" and "<password>"

    Examples: 
      | username | password  |
      | Eswar1   | Eswar@151 |
      | Eswar2   |       152 |
      | Eswar3   | Eswar153  |