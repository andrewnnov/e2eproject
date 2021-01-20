package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public void initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Projects\\e2eproject\\src\\main\\java\\Academy\\data.properties");
        prop.load(file);
        String browserName = prop.getProperty("browser");

        if(browserName == "chrome") {
            System.setProperty("webdriver.chrome.driver", "C:\\Projects\\e2eproject\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

        }else if (browserName == "firefox") {
            System.setProperty("webdriver.firefox.driver", "C:\\Projects\\e2eproject\\driver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

        } else if(browserName == "Edge") {
            System.setProperty("webdriver.edge.driver", "C:\\Projects\\e2eproject\\driver\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

        }
    }


}
