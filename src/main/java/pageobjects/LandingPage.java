package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;
    By signIn = By.xpath("//span[text()='Login']");

    By title = By.xpath("//div[@class='text-center']/h2");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signIn);
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }


}
