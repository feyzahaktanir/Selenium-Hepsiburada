package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

import java.time.Duration;

public class SignUpDef {

    HomePage homePage = new HomePage();

    @Given("User clicks Giris Yap veya Uye Ol button in homepage.")
    public void user_clicks_giris_yap_veya_uye_ol_button_in_homepage() {
        Actions actions = new Actions(Driver.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.wait(3);
    }
    @Given("User clicks Uye Ol button in homepage.")
    public void user_clicks_uye_ol_button_in_homepage() {
        homePage.signupButton.click();
    }
    @Given("User verify that Uye Ol page title is visible.")
    public void user_verify_that_uye_ol_page_title_is_visible() {
        Assert.assertTrue(homePage.signupTitle.isDisplayed());
    }
    @Given("User goes to sign up page.")
    public void user_goes_to_sign_up_page() {
        Actions actions = new Actions(Driver.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.signupButton.click();
        Assert.assertTrue(homePage.signupTitle.isDisplayed());
    }
}
