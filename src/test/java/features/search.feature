Feature:Verify that the results match the search criteria
  Scenario: Test Search Functionality
    Given User exist in website
    When Select Rome, Italy
    And Pick check in after a one a week from current date
    And Pick check in after a one a week from check in date
    And Select two adults and one a child
    And Click a search button
    Then Search is successfully



