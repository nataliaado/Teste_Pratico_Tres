package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public WebDriver Webdriver() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver( options );
        driver.get("https://advantageonlineshopping.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}