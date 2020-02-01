package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class testBase {

    public WebDriver driver;
    @BeforeMethod
    public void setUp(){

                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex Chiru\\Desktop\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void  tearDown() {driver.quit();}
}
