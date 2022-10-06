package tests.day23;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tests.Pages.BrcPages;
import utilities.ConfigReader;
import utilities.Driver;
public class C02_DataProvider {
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"abbas@gmail.com","12345"},{"sari@gmail.com","45678"},{"ahmet@gmail.com","98765"}};
    }
    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bRentUrl"));
        //login butonuna bas
        BrcPages brc=new BrcPages();
        brc.brcLogin.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brc.brcUserEmail.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.ikinciLogin.isDisplayed());
    }
}

