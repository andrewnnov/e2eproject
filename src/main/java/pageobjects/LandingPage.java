package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;
    By signIn = By.xpath("//span[text()='Login']");
    //By signIn = By.xpath("//i[@class='fa fa-lock fa-lg']");

    By title = By.xpath("//div[@class='text-center']/h2");
    By titleMenu = By.xpath("//a[text()='Contact']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signIn);
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public WebElement getTitleMenu() {
        return driver.findElement(titleMenu);
    }


}
