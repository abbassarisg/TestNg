package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import tests.Pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {

    @Test
    public void test01() {

        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }
}
