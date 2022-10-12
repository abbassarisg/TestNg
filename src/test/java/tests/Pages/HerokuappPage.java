package tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {


    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
        @FindBy(css = ("#onblur"))
        public WebElement onblur;

        @FindBy(css = ("#onclick"))
        public WebElement onclick;

        @FindBy(css = ("#oncontextmenu"))
        public WebElement oncontextmenu;

        @FindBy(css = ("#ondoubleclick"))
        public WebElement ondoubleclick;

        @FindBy(css = ("#onfocus"))
        public WebElement onfocus;

        @FindBy(css = ("#onkeydown"))
        public WebElement onkeydown;

        @FindBy(css = ("#onkeyup"))
        public WebElement onkeyup;

        @FindBy(css = ("#onkeypress"))
        public WebElement onkeypress;

        @FindBy(css = ("#onmouseover"))
        public WebElement onmouseover;

        @FindBy(css = ("#onmouseleave"))
        public WebElement onmouseleave;

        @FindBy(css = ("#onmousedown"))
        public WebElement onmousedown;

}
