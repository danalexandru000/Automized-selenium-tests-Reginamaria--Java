package Pages;

import Utils.DataItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePage {
    WebDriver driver;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver);
    }

    @FindBy(id = "CybotCookiebotDialogBodyContentTitle")
    private WebElement cookieMessage;
    @FindBy(id = "appointment_selection_option")
    private WebElement appointmentButton;
    @FindBy(xpath = "/html/body/div[1]/a[1]")
    private WebElement cerereProgramare;
    @FindBy(id = "lightboxFrame")
    private WebElement iframe;
    @FindBy(xpath = "/html/body/article/div/div[1]/h2")
    private WebElement cerereProgramareTitle;


   // public HomepagePage(WebDriver driver) {
       // this.driver = driver;
        //PageFactory.initElements(driver, this);
    //}

    public void goToHomePage() { driver.get(DataItems.ENVIROMENT); }

    public String getCookieMessageText() {
        return cookieMessage.getText();
    }
    public void clickOnAppointmentButton() {
        appointmentButton.click();
    }

    public void clickCerereProgramare() {
        driver.switchTo().frame(this.iframe);
        WebDriverWait wait = new WebDriverWait(driver, 5L);
        wait.until(ExpectedConditions.visibilityOf(cerereProgramare));
        cerereProgramare.click();
    }

    public String getCerereProgramareTitle() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5L);
        wait.until(ExpectedConditions.visibilityOf(this.cerereProgramareTitle));
        return cerereProgramareTitle.getText();
    }
}

