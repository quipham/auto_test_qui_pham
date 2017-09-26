Feature: Sample HelloPay Entry Test framework

  Scenario: Verify create customer exception case - Existed Customer
    Given I am at Lazada Register Page
    When I register with the info of existed customer
    Then I saw the error message for existed customer exception

  Scenario: Verify search result is correct
    Given I am at Lazada Search Page
    When I search with keyword "spinner"
    Then I saw list of correct result