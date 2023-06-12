Feature:
  @SC04
  Scenario: Scenario_04
    Given user navigates to the specified URL
    And user clicks on the login button
    And user enters the Username in the username textbox on the login page
    And user enters the Password in the password textbox on the login page
    And user clicks the login button on the login page
    And user clicks the pattern button on the home page
    And user clicks the View All text on the home page
    And user clicks the Sales part on the home page
    And user clicks the Account tab on the sales page
    And user clicks the First Account name on the account page
    And user upload files on the account page
    Then user downloads, verifies and deletes all the files one by one
