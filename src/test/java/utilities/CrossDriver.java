package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {

    private CrossDriver() {
    }

    static WebDriver driver;

    /*
Testleri calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu icin yeni
bir pencere (driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
bir kere driver'i calistir diyerek bir kere if icini calistiracak ve driver artik bir kere
 calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
 ayni pencerede (driver) uzerinde calisacak

 */


    public static WebDriver getDriver(String browser) {
        //Eger browser'a bir deger atanmamissa properties dosyasindaki browser calisir .
        browser=browser==null ? ConfigReader.getProperty("browser"):browser;


        //Testlerimizi xml file'dan farkli browserlar ile calistirabilmek icin getDriver() methoduna
        //  parametre atmamiz geekir
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "opera" :
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { // driver'a de??er atanm????sa kapat
            driver.close();
            driver = null; // Kapand??ktan sonra sonraki a??malar?? garanti alt??na almak i??in driver'i tekrar null yapt??k
        }
    }
    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}

