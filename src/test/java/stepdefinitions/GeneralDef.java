package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GeneralDef {

    HomePage homePage = new HomePage();

    @Given("User goes to {string}.")
    public void user_goes_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(homePage.hbLogo.isDisplayed());
    }

    @Given("User closes the browser.")
    public void user_closes_the_browser() {
        Driver.quitDriver();
    }
}
