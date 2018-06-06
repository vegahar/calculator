Feature: Add two numbers
  Calculator calculates two numbers

  Scenario: Add two integers
    Given integers 1 and 2
    When I add the numbers
    Then I should get 3