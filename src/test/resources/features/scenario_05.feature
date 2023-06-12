Feature:
  @SC05
  Scenario: Scenario_05
    Given user navigates to the specified URL
    And user clicks on the login button
    And user enters the Username in the username textbox on the login page
    And user enters the Password in the password textbox on the login page
    And user clicks the login button on the login page
    And user clicks the pattern button on the home page
    And user clicks the View All text on the home page
    And user clicks the Sales part on the home page
    And user clicks the Contacts tab on the home page
    And user clicks the First name on the contact page
    And user clicks the Email section on the contact page
    And user Verify that the From section is not blank
    And user Type a valid email address to the To section
    And user Enter subject as “Test Email”
    And user On the email’s body section, type “Test Body”
    And user clicks on Attach file under Body area of the email
    And user Select one of the files previously uploaded
    And user clicks add button
    And user Verify that the file is attached
    And user clicks send button
    And user Verify that the email is sent with a success message
