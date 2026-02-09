Feature: WordPress Automation
  Scenario: Verify WordPress Navigation and Photo Search
    Given User launches WordPress application
    Then Verify page title of the page
    When  User mouse over on Extend and clicks Get WordPress
    Then Verify Get WordPress text is displayed
    When User clicks on Community and Photo Directory
    And User searches for a photo
    Then Verify images are displayed
