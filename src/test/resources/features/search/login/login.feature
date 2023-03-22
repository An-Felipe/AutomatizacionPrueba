Feature: Login into the application

  Scenario: Successful login
    Given pepito has an active account
    When he sends their valid credentials
    Then he should add to cart
