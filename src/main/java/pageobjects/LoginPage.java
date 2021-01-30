package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    By emailAddress = By.id("user_email");
    By userPass = By.id("user_password");
    By loginBtn = By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getEmailAddress() {
        return driver.findElement(emailAddress);
    }

    public WebElement getUserPassword() {
        return driver.findElement(userPass);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(loginBtn);
    }
}
