package Test;

import Pages.HomepagePage;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HomepageTests extends testBase {
    @Test
    public void checkCookiesOnHomepage() {
        HomepagePage homepagePage = new HomepagePage(driver);
        homepagePage.goToHomePage();
        Assert.assertEquals(homepagePage.getCookieMessageText(),"Acest site utilizează cookie-uri");
    }

    @Test
    public void cereOProgramareTest() throws InterruptedException {
        HomepagePage homepagePage = new HomepagePage(this.driver);
        homepagePage.goToHomePage();
        homepagePage.clickOnAppointmentButton();
        homepagePage.clickCerereProgramare();
        Assert.assertEquals(homepagePage.getCerereProgramareTitle(), "CERE O PROGRAMARE");
    }

}


