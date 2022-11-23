Feature: Parabank login functionality

  Scenario: Login using valid credentials
   Given users is navigated to the parabank url
   When usernames and password are valid
    And click on login button
    Then display the user home pages
    And close the application