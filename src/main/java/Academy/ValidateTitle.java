package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class ValidateTitle extends Base {

    @Test
    private void basePageNavigation() throws IOException {

        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com");

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");



    }
}
