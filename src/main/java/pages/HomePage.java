package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage {

    private WebDriver driver;
    private By inputSearch = By.id("search_query_top");
    private By buttonSearch = By.name("submit_search");
    private By shoppingCart = By.xpath("//div[@class='shopping_cart']/a");
    private By signIn = By.cssSelector("a[class='login']");
    private By womenButton = By.xpath("//a[@title='Women']");

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

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(By.xpath("//ul[@id='homefeatured']//li")).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        //figure.findElement(By.xpath("//span[text() = 'Add to cart']")).click();
        return new FigureCaption(figure.findElement(By.xpath("//span[text() = 'Add to cart']")));
    }

    public WomenPage clickWoman(){
        driver.findElement(womenButton).click();
        return new WomenPage(driver);
    }


    public class  FigureCaption{

        private WebElement caption;
        private By addToCartButton = By.xpath("//span[text() = 'Add to cart']");
        private By moreButton = By.xpath("//span[text() = 'More']");
        private By price = By.xpath("//span[@class='price product-price']");

        public FigureCaption (WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public void clickAddToCard(){
            caption.findElement(addToCartButton).click();
        }

        public String getPrice(){
            return caption.findElement(price).getText();
        }
    }
}
