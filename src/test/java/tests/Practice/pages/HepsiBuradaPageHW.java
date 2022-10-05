package tests.Practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPageHW {


    public HepsiBuradaPageHW(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronik;

    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement pcTablet;

    @FindBy(xpath = "//a[contains(@href,'tablet-c-3008012')]")
    public List<WebElement> tabletList;

}
//