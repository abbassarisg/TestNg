package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
   public WebElement Login;

    @FindBy(xpath="//*[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath="//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilmadi;



}
