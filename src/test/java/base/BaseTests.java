package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SearchResultPage;

/**
 * user javiereduardomzpa@gmail.com
 * pass megadeth
 * **/
public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected SearchResultPage searchResultPage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
