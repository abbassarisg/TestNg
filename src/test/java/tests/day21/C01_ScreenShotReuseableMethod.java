package tests.day21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import tests.Pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReuseableMethod {
    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");
        //Sayfayi kapatiniz
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage=new AmazonPage();

        //Nutella aratiniz
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //arama sonuc yazisi WebElementinin resmini aliniz
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amznPage.aramaSonucuWE);


    }
}
