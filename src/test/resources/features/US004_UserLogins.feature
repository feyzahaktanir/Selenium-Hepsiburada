Feature: US004 - User Logins

  @US004TC01 @US004
  Scenario: TC01 - User should be able to access the user login page.
    Given User goes to homepage.
    * User clicks Giris Yap veya Uye Ol button in homepage.
    * User clicks Giris Yap button in homapage.
    * User verify that Giris Yap Title is visible.
    * User closes the browser.

  @US004TC02 @US004
  Scenario: TC02 - User cannot login with wrong username.
    Given User goes to log in page.
    * User "WrongUsername" enters in Username textbox.

    * User "ValidPassword" enters in Password textbox.

    * User sees an alert that "alert".
    * User closes the browser.

  @US004TC03 @US004
  Scenario: TC03 - User cannot login with wrong password.
    Given User goes to log in page.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in login page.
    * User "WrongPassword" enters in Password textbox.

    * User sees an alert that "alert".
    * User closes the browser.

  @US004TC04 @US004
  Scenario: TC04 - User can login successfully with correct user informations.
    Given User goes to log in page.
    * User "ValidUsername" enters in Username textbox.

    * User "ValidPassword" enters in Password textbox.

    * User sees an alert that "alert".
    * User closes the browser.

  @US004TC05 @US004
  Scenario Outline: TC05 - User cannot login with wrong user informations, can only login successfully with correct user informations.
    Given User goes to log in page.
    * User "<username>" enters in Username textbox.
    * User "<password>" enters in Password textbox.
    * User clicks enter button.
    * User sees an alert that "<alert>".
    * User closes the browser.

    Examples:
    |username                 |password     |alert            |
    |test                     |selinatabak  |Wrong username   |
    |f-kurubas-95@hotmail.com |test         |Wrong password   |
    |f-kurubas-95@hotmail.com |selinatabak  |Successful login |

  @US004TC06 @US004
  Scenario: TC06 - User can reach Hepsiburada when they needs help.
    Given User goes to log in page.
    * User clicks Yardima Ihtiyacim Var button in login page.
    * User verify that help page title is visible.
    * User vrify
