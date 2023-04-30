package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseTest {
    protected WebDriver chrome;
    protected WebDriver firefox;

    @Before
    public void setup() {

        //  WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        int timeout = 30;
        String url = "https://www.useinsider.com/";

        chrome.manage().timeouts().implicitlyWait(timeout, SECONDS);
        // firefox.manage().timeouts().implicitlyWait(timeout, SECONDS);

        chrome.get(url);
        // firefox.get(url);
        //firefox = new FirefoxDriver();
    }


}

