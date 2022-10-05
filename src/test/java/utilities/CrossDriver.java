package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
                //Crossbrowser icin bizim gonderdigimiz browser uzerinden calismasi icin
                //buraya parametre olarak girdigimiz degeri yazdik
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new SafariDriver();
                    break;
                default:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { // driver'a değer atanmışsa kapat
            driver.close();
            driver = null; // Kapandıktan sonra sonraki açmaları garanti altına almak için driver'i tekrar null yaptık
        }
    }
    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}

