Feature: Login Negative

  @Login
  Scenario: Verify Login Negative case
    Given User is on Practice page
    When User click on sign in link
    And User enter email address
      | email     |
      | hbfhbbfbb |
    And User enter password
      | password    |
      | hrfbhbchnxh |
    And User click on login button
    Then User verified validation message visible