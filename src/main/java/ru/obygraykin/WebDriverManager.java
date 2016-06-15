package ru.obygraykin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * @author: obygraykin on 14.06.2016
 */
public class WebDriverManager {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
