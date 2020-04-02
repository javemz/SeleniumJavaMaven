package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By userName = By.xpath("//a[@class='account']");

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getUserName(){
        return driver.findElement(userName).getText();
    }
}
