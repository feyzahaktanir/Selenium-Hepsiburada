package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.Driver;

import javax.swing.*;
import java.time.Duration;

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
        homePage.wait(5);
    }
    @Given("User verifies that Cookies Settings popup is visible.")
    public void user_verifies_that_cookies_settings_popup_is_visible() {homePage.wait(5);
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
    }
    @Given("User clicks on Hedefleme Amacli Tanimlama Bilgileri field.")
    public void user_clicks_on_hedefleme_amacli_tanimlama_bilgileri_field() {
        try {
            homePage.cookieNotNecessary.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNotNecessary);
        }
        homePage.wait(3);
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertFalse(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User clicks Hedefleme Amacli Tanimlama Bilgileri cookie button.")
    public void user_clicks_hedefleme_amacli_tanimlama_bilgileri_cookie_button() {
        try {
            homePage.cookieNotNecessaryButton.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNotNecessaryButton);
        }
        homePage.wait(3);
    }
    @Given("User turns on Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_on_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertTrue(homePage.cookieNotNecessaryButton.isSelected());
    }
    @Given("User turns off Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_off_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertFalse(homePage.cookieNotNecessaryButton.isSelected());
    }
    @Given("User clicks on Zorunlu Tanimlama Bilgileri field.")
    public void user_clicks_on_zorunlu_tanimlama_bilgileri_field() {
        try {
            homePage.cookieNecessary.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNecessary);
        }
        homePage.wait(3);
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Tumunu Kabul et button is not visible.")
    public void user_verify_that_tumunu_kabul_et_button_is_not_visible() {
        Assert.assertFalse(homePage.cookieAcceptAll.isDisplayed());
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertFalse(homePage.cookieNecessaryTrue.isDisplayed());
    }
    @Given("User clicks cerez Ayarlarimi Kaydet button.")
    public void user_clicks_cerez_ayarlarimi_kaydet_button() {
        homePage.cookieSettingsAccept.click();
        homePage.wait(3);
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
