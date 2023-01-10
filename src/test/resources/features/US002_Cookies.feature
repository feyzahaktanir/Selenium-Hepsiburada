Feature: US002 - User can accept or reject cookies.

  @US002TC01
  Scenario: TC01 - User should be able to access the cookie policy.
    Given User goes to homepage.
    * User verifies that Cookies popup is visible.
    * User accesses the cookie policy.
    * User verify access to cookie policy page.
    * User closes the browser.

  @US002TC02
  Scenario: TC02 - User should be able to access the cookie settings.
    Given User goes to homepage.
    * User closes the browser.

