package purchases;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PurchasesTest extends BaseTests {

    @Test
    public void testPurchasesWithOutLogin(){
        var caption = homePage.hoverOverFigure(1);
        assertEquals(caption.getPrice(),"$16.51");
        caption.clickAddToCard();
    }

    @Test
    public void testPurchasesWithLogin(){
        loginPage = homePage.clickLogin();
        loginPage.setEmail("javiereduardomzpa@gmail.com");
        loginPage.setPass("megadeth");
        myAccountPage = loginPage.clickLogin();
        String name = myAccountPage.getUserName();
        assertEquals(myAccountPage.getUserName(), "Pepe Gonzalez", "The name not match with the user");

        homePage = myAccountPage.clickToGotoMainPage();
        var caption = homePage.hoverOverFigure(1);
        assertEquals(caption.getPrice(),"$16.51");
        caption.clickAddToCard();
    }

}
