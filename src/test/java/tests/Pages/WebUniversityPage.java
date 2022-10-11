package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {


    public WebUniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(css = ("input[placeholder='Add new todo']"))
    public WebElement addTo;

    @FindBy(xpath = "//div[@id='container']//li") // @FindBy(xpath = "//li")
    public List<WebElement> cizilecekler;

    @FindBy(css = ("i[class='fa fa-trash']"))
    public List<WebElement> siliciler;




}
