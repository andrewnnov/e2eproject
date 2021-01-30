package Academy;


import org.testng.annotations.Test;
import pageobjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNavigation() throws IOException {

       driver = initializeDriver();
       driver.get("http://www.qaclickacademy.com");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();

    }
}
