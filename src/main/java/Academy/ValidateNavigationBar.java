package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavigationBar extends Base {

    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    private void basePageNavigation() throws IOException {

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
        Assert.assertTrue(landingPage.getTitleMenu().isDisplayed());
        log.info("Navigation bar is displayed");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

}
