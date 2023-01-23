Feature: Energy Australia Invalid Registration
  I want to register in the Energy Australia app


  Scenario: Registration with Invalid details
    Given I click on the Register Button 
    When I enter the account no
    And I enter the postcode
    And I click on the Next Button    
    Then I click on Ok on the Incorrect details pop-up
    And I click on Cancel button
