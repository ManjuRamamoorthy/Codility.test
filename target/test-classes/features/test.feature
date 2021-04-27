Feature: Test Main Page

  Scenario: Check if query input and search button are on the main screen of the application
    Given I navigated to the website
    Then I can see query input field is displayed
    And I can also see search button is displayed
    And I verify to use an empty query "Provide some query" error message is displaying
    When I querying for "castle"
    Then I verify "No results" message is displaying
    When I querying for "Port Royal"
    Then I verify "Port Royal" message is displaying
    