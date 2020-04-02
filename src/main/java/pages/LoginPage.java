package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passField = By.id("passwd");
    private By submitLogin = By.id("SubmitLogin");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String _email){
        driver.findElement(emailField).sendKeys(_email);
    }

    public void setPass(String _pass){
        driver.findElement(passField).sendKeys(_pass);
    }

    public MyAccountPage clickLogin() {
        driver.findElement(submitLogin).click();
        return new MyAccountPage(driver);
    }
}
