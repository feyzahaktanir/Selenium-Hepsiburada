package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

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
    @Given("User verify access to cookie policy page in new tab.")
    public void user_verify_access_to_cookie_policy_page_in_new_tab() {
        Assert.assertTrue(homePage.cookiePolicyTitle.isDisplayed());
    }
}
