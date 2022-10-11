package tests.Practice.day06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.Pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {

    @Test
    public void test01() {

        //Goto Url: "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();

        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.washingthon, dhtmlgoodiesPage.unitedState).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).
                dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).build().perform();

        Driver.closeDriver();

        /*
        frameworkler buyudukce karmasiklasir  bu kapsamda uzmanlar,reusable,maintable,rahat manipule edilebilir
        bir patern de POM da karar kilmislar;

        1)driver class
        2)Page class
        3)Test class
        4)Utlities



         */
    }
}
