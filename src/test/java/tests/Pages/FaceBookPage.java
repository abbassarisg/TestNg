package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {
    public FaceBookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='pass']")
    public WebElement pass;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;

    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement emailYanlisGirisYapilamadi;

    @FindBy(xpath = "//*[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")
    public WebElement kisiTeyitGirisYapilamadi;

    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement sifreYanlisGirisYapilamadi;





}
