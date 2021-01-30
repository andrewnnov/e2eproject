package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavigationBar extends Base {

    @Test
    private void basePageNavigation() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
        Assert.assertTrue(landingPage.getTitleMenu().isDisplayed());



    }
}
