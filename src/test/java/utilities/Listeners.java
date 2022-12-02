package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext arg) {
        //beforeclass method gibi
        System.out.println("onStart - Tum testlerden ONCE bir(10 tane method varsada toplmada  1 kere) sefer cagrilir =>"+arg.getName());

    }

    @Override
    public void onFinish(ITestContext arg) {
        System.out.println("onFinish - Tum testlerden sonra 1 seferligine => "+arg.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        //before method gibi
        System.out.println("onTestStart - Her bir @Test annotation dan once bir kez calisir => "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - PASS olan Method sayisi kadar calisir.(7 tane metod varsa 7 metottan sonra calisir) => "+result.getName());

        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       // System.out.println("onTestSkipped - Skipped edilen Method sayisi kadar ve skipped edilen methgolardan SONRA bir kez calisir => "+result.getName());

        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // System.out.println("onTestFailure - FAiled edilen method sayisi kadar ve FAILED edilen metodlardan sonra 1 kez calisir => "+result.getName());

        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
