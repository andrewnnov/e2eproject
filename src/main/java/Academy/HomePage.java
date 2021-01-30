package Academy;


import org.testng.annotations.Test;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNavigation() throws IOException {

       driver = initializeDriver();
       driver.get("http://www.qaclickacademy.com");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmailAddress().sendKeys("aaaa@qa.com");
        loginPage.getEmailAddress().sendKeys("bbb");
        loginPage.getLoginBtn().click();
    }
}
