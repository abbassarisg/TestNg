package tests.Practice.day05;

import org.testng.annotations.Test;
import utilities.Driver;

public class P01 {
    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
// ikinci emojiye tıklayın (hayvan emojisini seçin)
// tüm hayvan emojilerine tıklayın
// formu doldurun (dilediğinizi yazabilirsiniz)
// apply butonuna tıklayın

    @Test

    public void test01(){
        Driver.getDriver().get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
    }
}
