package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginDef {

    HomePage homePage = new HomePage();

    @Given("User clicks Giris Yap button in homapage.")
    public void user_clicks_giris_yap_button_in_homapage() {
        homePage.loginButton.click();
    }
    @Given("User verify that Giris Yap Title is visible.")
    public void user_verify_that_giris_yap_title_is_visible() {
        Assert.assertTrue(homePage.loginTitle.isDisplayed());
    }
    @Given("User goes to log in page.")
    public void user_goes_to_log_in_page() {
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
        Actions actions = new Actions(Driver.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.wait(3);
        homePage.loginButton.click();
    }
    @Given("User {string} enters in Username textbox.")
    public void user_enters_in_username_textbox(String string) {
        homePage.loginUsernameText.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User {string} enters in Password textbox.")
    public void user_enters_in_password_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User sees an alert that {string}.")
    public void user_sees_an_alert_that(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
