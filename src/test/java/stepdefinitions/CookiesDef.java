package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

import javax.swing.*;

public class CookiesDef {
    HomePage homePage = new HomePage();

    @Given("User verifies that Cookies popup is visible.")
    public void user_verifies_that_cookies_popup_is_visible() {
        Assert.assertTrue(homePage.cookiesField.isDisplayed());
    }
    @Given("User accesses the cookie policy.")
    public void user_accesses_the_cookie_policy() {
        homePage.cookiePolicy.click();
    }
    @Given("User verify access to cookie policy page.")
    public void user_verify_access_to_cookie_policy_page() {
        Assert.assertTrue(homePage.cookiePolicyTitle.isDisplayed());
    }

    @Given("User clicks cookies setting.")
    public void user_clicks_cookies_setting() {
        homePage.cookieSettings.click();
    }
    @Given("User verifies that Cookies Settings popup is visible.")
    public void user_verifies_that_cookies_settings_popup_is_visible() {
        Assert.assertTrue(homePage.cookieSettingsTitle.isDisplayed());
    }

    @Given("User clicks Daha Fazla Bilgi button.")
    public void user_clicks_daha_fazla_bilgi_button() {
        homePage.otherWindow(homePage.cookieMoreInfo);
    }
    @Given("User verify cookies policy page in new tab.")
    public void user_verify_cookies_policy_page_in_new_tab() {
        Assert.assertTrue(homePage.cookiePolicyTitle.isDisplayed());
    }
    @Given("User closes cookies policy tab.")
    public void user_closes_cookies_policy_tab() {
        homePage.closeWindow();
        homePage.wait(3);
    }
    @Given("User clicks on Hedefleme Amacli Tanimlama Bilgileri field.")
    public void user_clicks_on_hedefleme_amacli_tanimlama_bilgileri_field() {
        homePage.cookieNotNecessary.click();
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertFalse(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User turns on Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_on_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertTrue(homePage.cookieNotNecessaryAccept.isDisplayed());
    }
    @Given("User turns off Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_off_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertTrue(homePage.cookieNotNecessaryDecline.isDisplayed());
    }
    @Given("User clicks on Zorunlu Tanimlama Bilgileri field.")
    public void user_clicks_on_zorunlu_tanimlama_bilgileri_field() {
        homePage.cookieNecessary.click();
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertTrue(homePage.cookieNecessaryFalse.isDisplayed());
    }
    @Given("User clicks cerez Ayarlarimi Kaydet button.")
    public void user_clicks_cerez_ayarlarimi_kaydet_button() {
        homePage.cookieSettingsAccept.click();
    }
    @Given("User verify that Cookies Settings popup is not visible.")
    public void user_verify_that_cookies_settings_popup_is_not_visible() {
        Assert.assertFalse(homePage.cookieSettingsTitle.isDisplayed());
    }
    @Given("User verify that Cookies popup is not visible.")
    public void user_verify_that_cookies_popup_is_not_visible() {
        Assert.assertFalse(homePage.cookiesField.isDisplayed());
    }

}
