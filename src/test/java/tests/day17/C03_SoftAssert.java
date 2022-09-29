package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {// Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.
        // Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
        // Hard Assertions'da herhangi bir assertion failed olursa,
        // test method'un çalışmasını durdurur ve kalan kodları yürütmez.(stop execution)

        // Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan
        // sonra obje ismi ile kullanırız, Herhangi bir hata verdiğinde test methodu
        // çalışmaya devam eder, en sonra rapor verir.    baslangıc
        // SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();

        //SORU:CO2 CLASSINI SOFT ASSERT ILE YAPINIZ
        SoftAssert softAssert=new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin                          //Test fail olursa asgidaki mesaji verdirebiliyoruz
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiginiz kelimeyi icermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"WE erisilemez");
        //4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"),"Nutella Icermiyor");
        softAssert.assertAll();
        //****Yani assertAll kadar Faile de olsa kod çalışıyor ve programı durdurmuyor,
        // ve assertAll  a kadar olan tum hataları bize yazdırıyor
        System.out.println("assertAll dan yukarida Hata varsa burasi calismadi ");
    }
}
