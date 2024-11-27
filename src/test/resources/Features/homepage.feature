Feature: QTrip Dynamic Home Page
  As a user
  I want to verify the homepage of QTrip Dynamic
  So that I can ensure the main elements are present

  Scenario: Verify homepage title and main elements
    Given I navigate to the QTrip Dynamic homepage
    When I check the page title
    Then the title should be "QTrip Dynamic"
    And I should see the search box
    And I should see the navbar
    And
    And
    