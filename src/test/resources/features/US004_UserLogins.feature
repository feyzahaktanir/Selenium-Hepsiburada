Feature: US004 - User Logins

  @US004TC01 @US004
  Scenario: TC01 - User should be able to access the user login page.
    Given User goes to homepage.

  @US004TC02 @US004
  Scenario: TC02 - User cannot login with wrong username.
    Given User goes to homepage.

  @US004TC03 @US004
  Scenario: TC03 - User cannot login with wrong password.
    Given User goes to homepage.

  @US004TC04 @US004
  Scenario: TC04 - User can login successfully with correct user informations.
    Given User goes to homepage.

  @US004TC05 @US004
  Scenario Outline: TC05 - User cannot login with wrong user informations, can only login successfully with correct user informations.
    Given User goes to homepage.

    Examples: