package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenPage {

    WebDriver driver;
    By priceRangeSlider = By.xpath("//div[@id='layered_price_slider']/a[1]");
    By priceRangeText = By.xpath("//span[@id='layered_price_range']");

    public WomenPage (WebDriver driver){
        this.driver = driver;
    }

    public void setPriceRange(int start) {
        WebElement slidePriceRange = driver.findElement(priceRangeSlider);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slidePriceRange, start,0).perform();
    }

    public String getRangeOfPrices(){
        return driver.findElement(priceRangeText).getText();
    }
}
