package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.text.BreakIterator;

public class AmazonPage {

    public BreakIterator aramaSonucWE;
    public org.testng.Assert Assert;

    public AmazonPage() {//Constructor olusturup public yapmamiz gerekir

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuWE;
}
