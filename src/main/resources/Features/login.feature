#@SmokeScenario

Feature: feature to test login functionality

  @smoketest #Tagusing
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage


#  Scenario Outline: Check login is successful with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the homepage
#
#    Examples:
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |
#