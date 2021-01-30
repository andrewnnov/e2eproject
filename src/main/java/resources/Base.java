package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {


        prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Projects\\e2eproject\\src\\main\\java\\resources\\data.properties");
        prop.load(file);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Projects\\e2eproject\\driver\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Projects\\e2eproject\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if(browserName.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Projects\\e2eproject\\driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }




}
