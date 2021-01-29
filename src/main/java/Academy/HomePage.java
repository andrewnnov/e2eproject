package Academy;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNavigation() throws IOException {

       driver = initializeDriver();
       driver.get("https://www.google.com/imghp?hl=EN");

    }
}
