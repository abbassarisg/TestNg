package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    @Test(priority = 1)//test onceligini priority le belirledik
                       //priority eatamak yapmazsak default olarak "0" atar


    public void testYoutube() {
        driver.get("https://www.youtube.com");
    }

    @Test(priority = 3)
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }
}
