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
    Given User goes to homepage.
    * User goes to log in page.

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
    |username                 |password     |allert           |
    |f.kurubas.95@hotmail.comk|selinatabak  |Wrong username   |
    |f.kurubas.95@hotmail.com |selinatabakk |Wrong password   |
    |f.kurubas.95@hotmail.com |selinatabak  |Successful login |