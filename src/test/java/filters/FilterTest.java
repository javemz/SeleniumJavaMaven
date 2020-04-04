package filters;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class FilterTest extends BaseTests {

    @Test
    public void testFilterRangePriceSlider()
    {
        womenPage = homePage.clickWoman();
        womenPage.setPriceRange(30);
        String price = womenPage.getRangeOfPrices();
        assertEquals(womenPage.getRangeOfPrices(), "$20.44 - $53.00","The price is not match");
    }
}
