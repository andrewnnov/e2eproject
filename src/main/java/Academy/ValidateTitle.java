package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class ValidateTitle extends Base {

    public WebDriver driver;

    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        log.info("Driver is initialized");
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        log.info("Navigate to homepage");
    }

    @Test
    private void basePageNavigation() throws IOException {

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES123");
        log.info("Successfully validated text message");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
