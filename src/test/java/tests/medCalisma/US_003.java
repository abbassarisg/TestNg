package tests.medCalisma;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.Pages.AbbasPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.*;

public class US_003 extends TestBaseRapor {
    AbbasPage abbasPage=new AbbasPage();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor executor=(JavascriptExecutor)Driver.getDriver();

    @Test
    public void testMed1() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("123456a");

     // List<WebElement> passwordStrength=abbasPage.passwordStrength;

     // String expectedBarTwo="background-color: rgb(255, 153, 0);";
     // String actualBarTwo=passwordStrength.get(1).getAttribute("style");
     // System.out.println(actualBarTwo);

     // assertEquals(expectedBarTwo,actualBarTwo);
        String expectedRollBarTwo=abbasPage.rollBarTwo.getAttribute("style");
        System.out.println("expectedRollBarTwo = " + expectedRollBarTwo);


    }
    @Test
    public void testMed2() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("123456A");

        List<WebElement> passwordStrength=abbasPage.passwordStrength;

        String expectedBarTwo="background-color: rgb(255, 153, 0);";
        String actualBarTwo=passwordStrength.get(1).getAttribute("style");
        System.out.println(actualBarTwo);

        assertEquals(expectedBarTwo,actualBarTwo);


    }
    @Test
    public void testMed3() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("aaaaaa1");

        List<WebElement> passwordStrength=abbasPage.passwordStrength;

        String expectedBarTwo="background-color: rgb(255, 153, 0);";
        String actualBarTwo=passwordStrength.get(1).getAttribute("style");
        System.out.println(actualBarTwo);

        assertEquals(expectedBarTwo,actualBarTwo);


    }

    @Test
    public void testMed4() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("aaaaaa*");

        List<WebElement> passwordStrength=abbasPage.passwordStrength;

        String expectedBarTwo="background-color: rgb(255, 153, 0);";
        String actualBarTwo=passwordStrength.get(1).getAttribute("style");
        System.out.println(actualBarTwo);

        assertEquals(expectedBarTwo,actualBarTwo);


    } @Test
    public void testMed5() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("aaaA1*");

        List<WebElement> passwordStrength=abbasPage.passwordStrength;

        String expectedBarOne="background-color: rgb(255, 0, 0);";
        String actualBarOne=passwordStrength.get(0).getAttribute("style");
        System.out.println(actualBarOne);

        assertEquals(expectedBarOne,actualBarOne);


    }

@Test
public void testMed6() {

    Driver.getDriver().get("https://medunna.com/");

    abbasPage.loginIcon.click();
    abbasPage.register.click();
   // abbasPage.newPassword.sendKeys("aaaaA1*");

    SoftAssert softAssert=new SoftAssert();


    String a;

    for (int i = 1; i <179; i++) {

        for (int j = 2; j < 52; j++) {
             List<WebElement> passwordStrength=abbasPage.passwordStrength;

             String expectedBarTwo="background-color: rgb(221, 221, 221);";
             String actualBarTwo=passwordStrength.get(4).getAttribute("style");
            System.out.println("actualBarTwo = " + actualBarTwo);
            String b=""+(char)i;
            abbasPage.newPassword.sendKeys(b);
            System.out.println(b);
           assertEquals("yanlis password",expectedBarTwo,actualBarTwo);
            //softAssert.assertAll("dongu bitti");
        }
         a=""+(char)i;
        abbasPage.newPassword.sendKeys(a);
        System.out.println(a);

    }


   // List<WebElement> passwordStrength=abbasPage.passwordStrength;

  // String expectedBarFive="background-color: rgb(0, 255, 0);";
  // String actualBarFive=passwordStrength.get(4).getAttribute("style");
  // System.out.println(actualBarFive);

  // assertEquals(expectedBarFive,actualBarFive);


}

    @Test
    public void test7() {
        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("A1*");
        abbasPage.least4CharWarning.isDisplayed();

    }

    @Test
    public void testdeneme() {
        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        
        String a;
        List<String> asciiToString = new ArrayList<>();
        for (int i =0; i <178 ; i++) {
            a=""+(char)i;
            //a=Character.toString(i);
            asciiToString.add(a);
                   }
        System.out.println("asciiToString = " + asciiToString);

            List<String> passworList=new ArrayList<>();
            String b="";
            String c="";
            String d="";
            String e="";
            String f="";


        for (int i = 0; i <176 ; i++) {


           //abbasPage.newPassword.sendKeys(asciiToString.get(i));


            if(i>1 && i<25){
                b=b.concat(asciiToString.get(i));
               // System.out.println("b = " + b);
               if(i==24){
                   passworList.add(b);
               }

            }else if (i>26 && i<50){
                c=c.concat(asciiToString.get(i));
               // System.out.println("c = " + c);

                if(i==49){
                    passworList.add(c);
                }

            }
            else if (i>50 && i<=75){
                d=d.concat(asciiToString.get(i));
                //System.out.println("d = " + d);
                if(i==75){
                    passworList.add(d);}


            }else if (i>128 && i<=150){
                e=e.concat(asciiToString.get(i));
                //System.out.println("e = " + e);
                if(i==149){
                    passworList.add(e);
                }

            }else if (i>151 && i<175) {
                f = f.concat(asciiToString.get(i));
                //System.out.println("f= " + f);
                if (i==174){
                    passworList.add(f);
                }

            }


        }
        System.out.println("passworList = " + passworList);

      //  List<String> abc=new ArrayList<>();
      //  abc.add("as");
      //  abc.add("asdasd");
      //  abbasPage.newPassword.sendKeys(abc.get(0));
     abbasPage.newPassword.sendKeys(passworList.get(4));
     abbasPage.email.sendKeys(passworList.get(4));
      System.out.println("PaswordList Size= "+passworList.size());

      List<WebElement> passwordStrength=abbasPage.passwordStrength;

      String expectedBarOne="background-color: rgb(0, 255, 0);";
      String actualBarOne=passwordStrength.get(4).getAttribute("style");
      System.out.println(actualBarOne);

      assertEquals(expectedBarOne,actualBarOne);







   // public static String  getValueWithJs(String elementId){
   //     JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
   //     String value=js.executeScript("return document.getElementById('"+elementId+"').value").toString();
   //     return value;
    }
    @Test
    public void testMed7() {

        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.firstName.sendKeys("guii");
        actions.sendKeys(Keys.ENTER).perform();
         String valueninIcindeki=abbasPage.valueDegeri.getAttribute("value");
        System.out.println("valueninIcindeki = " + valueninIcindeki);

       // getValueWithJs("firstName");
        System.out.println("valueninIcindeki = " + valueninIcindeki);




    }
    @Test
    public  void testMed8(){
        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();

        abbasPage.ssnBox.sendKeys("62-45-4642",Keys.ENTER);

        String actualSsnBlueBoxcolor=abbasPage.ssnBox.getCssValue("background-image");
        System.out.println("ssnBoxcolor = " + actualSsnBlueBoxcolor);

       // assertTrue(actualSsnBlueBoxcolor.contains("0, 140, 186"));
        String valid=abbasPage.valid.getAttribute("class").toString();
        System.out.println("valid = " + valid);
        String expectedValid="is-touched is-dirty av-valid form-control";

       // assertEquals(expectedValid,valid);


        //assertTrue(abbasPage.valid.isDisplayed());

    }

    @Test
    public void test9() {
        Driver.getDriver().get("https://medunna.com/");

        abbasPage.loginIcon.click();
        abbasPage.register.click();
        abbasPage.newPassword.sendKeys("A1*",Keys.ENTER);

   //    String actualWarningImage= abbasPage.warningSymbol.getCssValue("background-image");
   //    System.out.println("actualWarningImage = " + actualWarningImage);

   //  String expectedWarningImage= ConfigReader.getProperty("warningImg");
   //  assertEquals(expectedWarningImage,actualWarningImage);

      String actualShadow=abbasPage.warningSymbol.getCssValue("box-shadow");
      System.out.println("actualShadow = " + actualShadow);
      String expectedShadow="rgba(240, 65, 36";

      assertTrue(actualShadow.contains(expectedShadow));
    }
}
