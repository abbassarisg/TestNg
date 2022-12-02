package tests.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPage { public HepsiBuradaPage() {
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy (xpath = "//span[text()='Elektronik']")
    public WebElement Elektronik;
    @FindBy (xpath = "//a[text()='Bilgisayar/Tablet']")
    public WebElement BilgisayarTabletLink;
    @FindBy (xpath = "//a[starts-with(@class,'sf-ChildMenuItems-OIXGN6gTcuAXz_dkh8Yv')]/span")
    public List<WebElement> childMenuItems;

    @FindBy(xpath = "//ul[@class='sf-ChildMenuItems-a4G0z3YJJWkQs7qKKuuj sf-ChildMenuItems-a_VIB2qnmn0WqX_Xa3DN']//a")
   public List<WebElement> hepsiTum;

    @FindBy(xpath = "//a[text()='Bilgisayar/Tablet']")
    public WebElement hepsiPC;

    @FindBy(xpath = "//span[text()='Elektronik']")
    public WebElement hepsiElek;

    @FindBy (xpath = "//h1")
    public WebElement pageTitle;
}
