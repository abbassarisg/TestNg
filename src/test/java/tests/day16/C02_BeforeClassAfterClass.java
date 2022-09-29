package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    //TestNG de beforeclass v after class i kullanirken static(degisken methodu) yapmaya gerek yok
    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechProEd() {
        driver.get("https://www.techproeducation.com");
    }
}
