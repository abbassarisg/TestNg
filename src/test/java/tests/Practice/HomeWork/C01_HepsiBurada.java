package tests.Practice.HomeWork;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_HepsiBurada {


    //Hepsiburada sayfasına gidiniz

    @Test
    public void test01() {
    Driver.getDriver().get(ConfigReader.getProperty("hpsBrdUrl"));


    }


//Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
//Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
//Sayfayı kapatalım
}
