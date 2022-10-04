package tests.Practice.day07;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Practice.pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.

    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla,
        // Bulaşıkları yıka,
        // Bebekle ilgilen,
        // Çocuğunun ödevine yardım et,
        // Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage=new WebUniversityPage();


        List<String> worklist=new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Selenyum çalış","Uyu"));
        //manuel tek tek todo liste eklemek yerine list direk ekledik

        Actions actions=new Actions(Driver.getDriver());
        for (String w:worklist) {
            actions.click(webUniversityPage.adNewToDo).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }

        //Tüm yapılacakların üzerini çiz.
        List<WebElement> toDos=webUniversityPage.toDos;

        for (WebElement w:toDos) {
            w.click();

        }

        //Tüm yapılacakları sil.
        List<WebElement> deleteL=webUniversityPage.delete;

        deleteL.forEach(t->t.click());//lambdayla
Thread.sleep(2000);
        //Tüm yapılacakların silindiğini doğrulayın.

        List<WebElement> newToDos=webUniversityPage.newToDos;
        Assert.assertEquals(0,newToDos.size());

    }
}
