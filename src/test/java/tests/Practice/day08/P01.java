package tests.Practice.day08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.Pages.HerokuappPage;
import utilities.Driver;

public class P01 {

    HerokuappPage herokuappPage;
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
        herokuappPage=new HerokuappPage();
        //clean code olasi icin objeyi yukarida tanimlayim bu bolumde deger atadik

        herokuappPage.onblur.click();
        herokuappPage.onclick.click();//onblur asamasini gectik

        herokuappPage.onclick.click();//click butonuna tikladik

        actions.contextClick(herokuappPage.oncontextmenu).
                doubleClick(herokuappPage.ondoubleclick).
                click(herokuappPage.onfocus).
                click(herokuappPage.onkeydown).sendKeys(Keys.ENTER).
                click(herokuappPage.onkeyup).sendKeys(Keys.ENTER).
                click(herokuappPage.onkeypress).sendKeys(Keys.SPACE).sendKeys(Keys.ENTER).
                moveToElement(herokuappPage.onmouseover).
                moveToElement(herokuappPage.onmouseleave).
                moveToElement(herokuappPage.onmouseover).
                click(herokuappPage.onmousedown).perform();

                        //oncontextmenuyu tikladik




        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
    }
}
