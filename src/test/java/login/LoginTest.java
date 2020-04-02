package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest  extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        loginPage = homePage.clickLogin();
        loginPage.setEmail("javiereduardomzpa@gmail.com");
        loginPage.setPass("megadeth");
        myAccountPage = loginPage.clickLogin();
        String name = myAccountPage.getUserName();
        assertEquals(myAccountPage.getUserName(), "Pepe Gonzalez", "The name not match with the user");
    }

}
