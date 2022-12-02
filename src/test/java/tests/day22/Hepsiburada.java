package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class Hepsiburada {
    @Test
    public void hepsiBurada() throws InterruptedException {
        Driver.getDriver().get("https://www.hepsiburada.com/");

        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i <66; i++) {
            HepsiBuradaPage hepsiburadapage = new HepsiBuradaPage();
            System.out.println(hepsiburadapage.childMenuItems.size());
            hepsiburadapage.Elektronik.click();
            actions.moveToElement(hepsiburadapage.BilgisayarTabletLink).perform();
            hepsiburadapage.childMenuItems.get(i).click();
            Assert.assertTrue(hepsiburadapage.pageTitle.isDisplayed());
            try {
                ReusableMethods.getScreenshot("Hepsiburada "+ hepsiburadapage.pageTitle.getText() + " sayfasi ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Driver.getDriver().navigate().back();
        }
        Driver.closeDriver();


    }
}
