package tests.Practice.day07;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Pages.WebUniversityPage;
import utilities.Driver;

import java.util.List;

public class P02 {



    @Test

    public void test01() throws InterruptedException {

        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage=new WebUniversityPage();
        Actions actions=new Actions(Driver.getDriver());

       actions.click(webUniversityPage.addTo).sendKeys("Kahvaltıyı hazırla",Keys.ENTER).
              sendKeys("Bulaşıkları yıka"+Keys.ENTER).
               sendKeys("Bebekle ilgilen"+Keys.ENTER).
               sendKeys("Selenyum çalış"+Keys.ENTER).
               sendKeys("Çocuğunun ödevine yardım et"+Keys.ENTER).
               sendKeys("Uyu"+Keys.ENTER).perform();
//Tüm yapılacakların üzerini çiz.
        List<WebElement> cizilecekler=webUniversityPage.cizilecekler;
        cizilecekler.forEach(t->t.click());

//Tüm yapılacakları sil.
List<WebElement> silici=webUniversityPage.siliciler;
        webUniversityPage.siliciler.forEach(t->t.click());
//Tüm yapılacakların silindiğini doğrulayın.

Thread.sleep(3000);// islem cik hizli gectigi icin size'in sifir olasini gormesini saglamak amaciyla koyduk
Assert.assertEquals(0,silici.size());
        System.out.println(silici.size());

    }

}
