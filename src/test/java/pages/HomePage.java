package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//img[@alt=\"Desktop-Logo\"]")
    public WebElement hbLogo;

    //Cookies definitions ---------------------------------------------------------

        //@homepage
    @FindBy(id = "onetrust-group-container")
    public WebElement cookiesField;
    @FindBy(id = "onetrust-pc-btn-handler")
    public WebElement cookieSettings;
    @FindBy(xpath = "//a[text()=\"Çerez Politikası\"]") //TODO: handle gerekli
    public WebElement cookiePolicy;
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookieAccept;
    @FindBy(xpath = "//a[text()=\"Daha Fazla Bilgi\"]") //TODO: handle gerekli
    public WebElement cookieMoreInfo;
    @FindBy(id = "accept-recommended-btn-handler")
    public WebElement cookieAcceptAll;
    @FindBy(xpath = "//button[@aria-labelledby=\"ot-header-id-C0004\"][@aria-expanded=\"false\"]")
    public WebElement cookieNotNecessaryFalse;
    @FindBy(xpath = "//button[@aria-labelledby=\"ot-header-id-C0004\"][@aria-expanded=\"true\"]")
    public WebElement cookieNotNecessaryTrue;
    @FindBy(xpath = "//button[@id=\"accept-recommended-btn-handler\"][@style=\"display: inline-block;\"]")
    public WebElement cookieNotNecessaryDecline;
    @FindBy(xpath = "//button[@id=\"accept-recommended-btn-handler\"][@style=\"display: none;\"]")
    public WebElement cookieNotNecessaryAccept;
    @FindBy(xpath = "//button[@aria-labelledby=\"ot-header-id-C0001\"][@aria-expanded=\"false\"]")
    public WebElement cookieNecessaryFalse;
    @FindBy(xpath = "//button[@aria-labelledby=\"ot-header-id-C0001\"][@aria-expanded=\"true\"]")
    public WebElement cookieNecessaryTrue;
    @FindBy(xpath = "//button[text()=\"Çerez ayarlarımı kaydet\"]")
    public WebElement cookieSettingsAccept;

        //@cookiespolicypage
    @FindBy(xpath = "//h2[text()=\"Çerez Politikası\"]")
    public WebElement cookiePolicyTitle;

    //-----------------------------------------------------------------------------



    //Wait Class ------------------------------------------------------------------
    public void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------



    //Connection Privacy Error ----------------------------------------------------
    @FindBy(id = "details-button")
    public WebElement AdvancedButton;
    @FindBy(id = "proceed-link")
    public WebElement ProceedtoSite;

    public void connectionPrivacy(){
        try {
            if(AdvancedButton.isDisplayed()){
                AdvancedButton.click();
                ProceedtoSite.click();
            }
        } catch (NoSuchElementException ex){
            if ( !(ex instanceof NoSuchElementException) ) {throw ex; }
        }
    }
    //-----------------------------------------------------------------------------



    //WindowHandle Class ----------------------------------------------------------
    public void otherWindow ( WebElement webElement) {
        String originalWindow = Driver.driver.getWindowHandle();
        assert Driver.driver.getWindowHandles().size() == 1;
        webElement.click();

        for (String windowHandle : Driver.driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                Driver.driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    //-----------------------------------------------------------------------------



}
