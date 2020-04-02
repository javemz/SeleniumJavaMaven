package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By inputSearch = By.id("search_query_top");
    private By buttonSearch = By.name("submit_search");
    private By shoppingCart = By.xpath("//div[@class='shopping_cart']/a");
    private By signIn = By.cssSelector("a[class='login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void setTextSearch(String _text){
        driver.findElement(inputSearch).sendKeys(_text);
    }

    public SearchResultPage clickSearchButton(){
        driver.findElement(buttonSearch).click();
        return new SearchResultPage(driver);
    }

    public LoginPage clickLogin(){
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }
}
