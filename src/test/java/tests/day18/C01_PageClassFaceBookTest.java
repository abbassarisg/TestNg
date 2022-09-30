package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Pages.FaceBookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {
    @Test
    public void test01() {
/*
//        https://www.facebook.com/ adresine gidin
 */
        Driver.getDriver().get("https://facebook.com");
//        POM’a uygun olarak email, sifre kutularini ve giris yap
//        butonunu locate edin
        FaceBookPage faceBookPage=new FaceBookPage();
//        Faker class’ini kullanarak email ve pass degerlerini
        Faker faker=new Faker();
        faceBookPage.email.sendKeys(faker.internet().emailAddress());
        faceBookPage.pass.sendKeys(faker.internet().password());

      //        yazdirip, giris butonuna basin
        faceBookPage.login.click();


   //      Basarili giris yapilamadigini test edin

//       Assert.assertTrue(faceBookPage.emailYanlisGirisYapilamadi.isDisplayed());
//       Assert.assertTrue(faceBookPage.kisiTeyitGirisYapilamadi.isDisplayed());
//       Assert.assertTrue(faceBookPage.sifreYanlisGirisYapilamadi.isDisplayed());

//        facebookPage.email.sendKeys(faker.internet().emailAddress());
//        facebookPage.sifre.sendKeys(faker.internet().password());
//        facebookPage.login.click();
//        //Basarili giris yapilamadigini test edin
//        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());

       Boolean mail=faceBookPage.emailYanlisGirisYapilamadi.isDisplayed();
       Boolean kisi=faceBookPage.kisiTeyitGirisYapilamadi.isDisplayed();
       Boolean sifre=faceBookPage.sifreYanlisGirisYapilamadi.isDisplayed();
        System.out.println(sifre);
        System.out.println(kisi);
        System.out.println(mail);

       if (mail){Assert.assertTrue(faceBookPage.emailYanlisGirisYapilamadi.isDisplayed());
       }
       else if (kisi) {Assert.assertTrue(faceBookPage.kisiTeyitGirisYapilamadi.isDisplayed());

       } else if (sifre) {Assert.assertTrue(faceBookPage.sifreYanlisGirisYapilamadi.isDisplayed());

       }

       /*
       // Basarili giris yapilamadigini test edin
        try {
            String actualText = facebookPage.girisYapilamadi.getText();
            Assert.assertTrue(actualText.contains("Facebook"));
        } catch (Exception e) {
            String acturalText2 = facebookPage.getGirisYapilamadiEvetBendim.getText();
            Assert.assertTrue(acturalText2.contains("Evet, Devam Et"));
        }
        */


    }
}
