package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {
        //amazona gidelim
        //facebook a gidelim

        String url=ConfigReader.getProperty("amznUrl");
        String urlFace=ConfigReader.getProperty("faceUrl");

        Driver.getDriver().get(url);
       Driver.getDriver().get(urlFace);
        Driver.closeDriver();


    }
}
