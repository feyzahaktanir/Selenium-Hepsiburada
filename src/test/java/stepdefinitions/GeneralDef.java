package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GeneralDef {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.driver);

    @Given("User goes to homepage.")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
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
