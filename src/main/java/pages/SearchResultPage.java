package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    private WebDriver driver;
    private By titleSearch = By.xpath("//span[@class='lighter']");
    private By productList = By.xpath("//ul[@class='product_list grid row']/li");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public int getNumberResultSearch(){
        return driver.findElements(productList).size();
    }
}
