package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class day02_C01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01(){
        // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abbas");
//fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SARI");
//check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
//check the experience
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
//fill the date
        driver.findElement(By.xpath("//input[@id='datepicker'")).sendKeys("11.11.2022");
//choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
//choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
//choose your continent -> Antartica
        WebElement continents= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(continents);
        select.selectByVisibleText("Antartica");
//choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();
//click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();



    }
}
