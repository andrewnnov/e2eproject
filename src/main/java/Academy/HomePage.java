package Academy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {

    public WebDriver driver;

    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();

    }

    @Test(dataProvider = "getData")
    private void basePageNavigation(String userName, String password, String text) {
        driver.get(prop.getProperty("url"));

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmailAddress().sendKeys(userName);
        loginPage.getUserPassword().sendKeys(password);
        loginPage.getLoginBtn().click();
        log.info(text);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][3];
        data[0][0] = "nonrestricteduser@qa.com";
        data[0][1] = "12345";
        data[0][2] = "Restricted user";

        data[1][0] = "restricted@qa.com";
        data[1][1] = "6789";
        data[1][2] = "Non restricted user";

        return data;
    }


}
