package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPages {

    public BrcPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement brcLogin;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement brcUserEmail;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement brcBasariliGiris;


}
