package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;


public class SearchTest extends BaseTests {

    @Test
    public void testSuccessSearch(){
        homePage.setTextSearch("shirt");
        searchResultPage = homePage.clickSearchButton();
        assertEquals(searchResultPage.getNumberResultSearch(), 1, "The search failed");
    }
}
