package tests.day22;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import tests.Pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Hepsi2 {/*
    Hepsiburada sayfasına gidiniz
    Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
    Sayfayı kapatalım
     */
    @Test
    public void test() throws Exception {
        Driver.getDriver().get("https://www.hepsiburada.com/");
        Actions actions = new Actions(Driver.getDriver());
        HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();


        //  Assert.assertTrue(hepsiburadapage.pageTitle.isDisplayed());
        // ReusableMethods.getScreenshot("Hepsiburada "+ hepsiburadapage.pageTitle.getText() + " sayfasi ");
        // Driver.getDriver().navigate().back();
        // }
        // Driver.closeDriver();
        hepsiBuradaPage.hepsiElek.click();
        actions.moveToElement(hepsiBuradaPage.hepsiPC).perform();

        System.out.println("hepsiBuradaPage.childMenuItems.size() = " + hepsiBuradaPage.childMenuItems.size());
        List<WebElement> tum=hepsiBuradaPage.hepsiTum;
     //  hepsiBuradaPage.hepsiElek.click();
     //  actions.moveToElement(hepsiBuradaPage.hepsiPC).perform();
     //  ReusableMethods.waitForVisibility(tum.get(0),3000);
     //  tum.get(0).click();
     //  Assert.assertTrue(hepsiBuradaPage.pageTitle.isDisplayed());
     //  ReusableMethods.getScreenshot("Hepsiburada ");
     //  Driver.getDriver().navigate().back();
        System.out.println(tum.size());
        for (int i = 0; i < tum.size(); i++) {
            hepsiBuradaPage.hepsiElek.click();
            actions.moveToElement(hepsiBuradaPage.hepsiPC).perform();
            ReusableMethods.waitForVisibility(tum.get(i),3000);
            System.out.println("hepsiBuradaPage.hepsiTum.size() = " + hepsiBuradaPage.hepsiTum.size());
            tum.get(i).click();
            Assert.assertTrue(hepsiBuradaPage.pageTitle.isDisplayed());
            ReusableMethods.getScreenshot("Hepsiburada ");
            Driver.getDriver().navigate().back();

        }
       /* for ( WebElement w:tum) {
            hepsiBuradaPage.hepsiElek.click();
            actions.moveToElement(hepsiBuradaPage.hepsiPC).perform();
            ReusableMethods.waitForVisibility(w,3000);
            w.click();
            Assert.assertTrue(hepsiBuradaPage.pageTitle.isDisplayed());
            ReusableMethods.getScreenshot("Hepsiburada ");
            Driver.getDriver().navigate().back();

        }*/

    }

}
