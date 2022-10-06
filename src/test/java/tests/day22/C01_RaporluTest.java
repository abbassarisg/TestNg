package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Pages.BrcPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {
      /*  extentTest=extentReports.createTest("Test ismi", "Tanim");
        extentTest.info("Aciklama");
        extentTest.pass()*/
        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");

//  -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bRentUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
//  -login butonuna bas
        BrcPages brc=new BrcPages();
        brc.brcLogin.click();
        extentTest.info("Login butonuna basildi");
    //  -test data user email: customer@bluerentalcars.com ,
        brc.brcUserEmail.sendKeys(ConfigReader.getProperty("bRentUserEmail"));
        Actions actions=new Actions(Driver.getDriver());

        //  -test data password : 12345 dataları girip login e basın
        //  -login butonuna tiklayin
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("bRentPass")).sendKeys(Keys.ENTER).perform();

        extentTest.info("Dogru kullanici ve password girildi ve login yapildi");
    // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName=brc.brcBasariliGiris.getText();
        String expectedUserName="John Walker";
        Assert.assertEquals(expectedUserName,actualUserName);
        extentTest.info("Sayfa test sonuclari PASSED");
    }
}
