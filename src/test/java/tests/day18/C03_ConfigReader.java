package tests.day18;

import org.testng.annotations.Test;
import tests.Pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {
//        Bir Class olustur : PositiveTest
//        2) Bir test method olustur positiveLoginTest()
//        https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage login=new HmcPage();
        login.Login.click();
//        test data username: manager ,  test data password : Manager1!
//        Degerleri girildiginde sayfaya basarili sekilde girilebildigini  test et
    }
}
