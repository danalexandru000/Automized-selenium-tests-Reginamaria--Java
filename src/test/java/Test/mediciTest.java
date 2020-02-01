package Test;

import Pages.MediciPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mediciTest extends testBase {
    @Test
    public void medici() {
        MediciPage mediciPage = new MediciPage(driver);
        mediciPage.goToMediciPage();
        mediciPage.searchForDoctor("stingu");
        Assert.assertTrue(mediciPage.getFirstDoctorName().contains("stingu"));
    }
}
