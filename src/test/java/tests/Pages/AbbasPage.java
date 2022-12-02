package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AbbasPage {
  public   AbbasPage(){PageFactory.initElements(Driver.getDriver(),this);}
  @FindBy(id= "account-menu")
  public WebElement loginIcon;

  @FindBy(xpath = "(//span[text()='Register'])[1]")
  public WebElement register;

  @FindBy(css="h1#register-title")
  public WebElement registrationTitle;

  @FindBy(css = "input#firstPassword")
  public WebElement newPassword;

  @FindBy(css="input#secondPassword")
  public WebElement confirmPassword;

  @FindBy(xpath = "//li[@class='point']")
  public List<WebElement> passwordStrength;

  @FindBy(xpath = "//div[text()='Your password is required to be at least 4 characters.']")
  public WebElement least4CharWarning;


  @FindBy(xpath = "//input[@id='firstName']")
  public WebElement firstName;

  @FindBy(xpath = "//input[@value='guii']")
  public WebElement valueDegeri;

  @FindBy(xpath = "//div[@class='invalid-feedback']")
  public WebElement ssn;

  @FindBy(xpath="//input[@name='ssn']")
  public WebElement ssnBox;

  @FindBy(xpath="//input[@class='is-touched is-dirty av-valid form-control']")
  public WebElement valid;

  @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
  public WebElement rollBarTwo;
  @FindBy(css="#firstPassword")
  public WebElement warningSymbol;

  @FindBy(css="input#email")
  public WebElement email;

  @FindBy (css="#ssn")
  public WebElement ssn2;



}
