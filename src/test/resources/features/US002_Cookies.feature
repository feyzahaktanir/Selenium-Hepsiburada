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
    * User clicks cookies setting.
    * User verifies that Cookies Settings popup is visible.
    * User clicks Daha Fazla Bilgi button.
    * User verify cookies policy page in new tab.
    * User closes cookies policy tab.
    * User clicks on Hedefleme Amacli Tanimlama Bilgileri field.
    * User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been opened.
    * User clicks on Hedefleme Amacli Tanimlama Bilgileri field.
    * User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been closed.
    * User turns on Hedefleme Amacli Tanimlama Bilgileri cookie.
    * User turns off Hedefleme Amacli Tanimlama Bilgileri cookie.
    * User clicks on Zorunlu Tanimlama Bilgileri field.
    * User verify that Zorunlu Tanimlama Bilgileri field detail has been opened.
    * User clicks on Zorunlu Tanimlama Bilgileri field.
    * User verify that Zorunlu Tanimlama Bilgileri field detail has been closed.
    * User clicks cerez Ayarlarimi Kaydet button.
    * User verify that Cookies Settings popup is not visible.
    * User verify that Cookies popup is not visible.
    * User closes the browser.

