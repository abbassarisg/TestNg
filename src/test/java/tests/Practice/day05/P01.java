package tests.Practice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button

    @Test
    public void test01() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));

        firstname.sendKeys("Abbas"+ Keys.ENTER);
        actions.sendKeys(Keys.TAB).sendKeys("SARI",Keys.ENTER).//lastname
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).//gender
                sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).//experience
                sendKeys(Keys.TAB).sendKeys("01.11.1987").//date
                perform();

        driver.findElement(By.xpath("//input[@id='profession-1']")).click();//automation tester
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();//selenium webdriver

        //driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
         WebElement dropDownContinent= driver.findElement(By.xpath("//select[@id='continents']"));
         Select select=new Select(dropDownContinent);
         select.selectByVisibleText("Antartica");


       //driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();

        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
