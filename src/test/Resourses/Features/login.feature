Feature: User wants to sign in OrangeHRM successfully.

  Scenario: User should be able to sign in with valid credential.
    Given user is on OrangeHRM login page when enters URL as 'https://opensource-demo.orangehrmlive.com/'.
    When user enters valid username as 'Admin'
    And enters valid password as 'admin123'
    And user clicks on log in button.
    Then user should be logged in and able to see welcome message.

  Scenario Outline: User should not be able to sign in with invalid credential.
    Given user is on OrangeHRM login page when enters URL as 'https://opensource-demo.orangehrmlive.com/'.
    When user enters username as <username>
    And enters password as <password>
    And user clicks on log in button.
    Then user should not be logged in and able to see error message.
    Examples:
      | username | password |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
      |          | valid    |
      |          | invalid  |
      | invalid  |          |
      | valid    |          |
