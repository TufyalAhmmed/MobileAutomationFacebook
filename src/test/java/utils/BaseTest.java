package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver driver;


    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", "D:\\MobileAutomationFacebook\\apps\\Taste Movie TV Suggestions_v1.40.1_apkpure.com.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }
    @Test
    public void setDriver() throws MalformedURLException {
        setUp();
    }
}
