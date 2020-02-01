package Pages;

import Utils.DataItems;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediciPage {
        WebDriver driver;
        @FindBy(id = "edit-medic")
        private WebElement searchField;
        @FindBy(xpath = "//*[@id=\"items_list\"]/ul/li[1]/div/div[2]/div/h2/a")
        private WebElement firstDoctor;

        public MediciPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void goToMediciPage() {
            driver.get(DataItems.ENVIROMENT + "medici");
        }

        public void searchForDoctor(String nameOfDoctor) {
            searchField.sendKeys(nameOfDoctor);
            searchField.sendKeys(Keys.RETURN);
        }

        public String getFirstDoctorName() {
            return firstDoctor.getText().toLowerCase();
        }
    }



