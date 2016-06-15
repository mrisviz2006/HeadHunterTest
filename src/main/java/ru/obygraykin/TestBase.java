package ru.obygraykin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * @author: obygraykin on 14.06.2016
 */
public class TestBase {

    protected TestManager app;

    private WebDriver driver;

    @Before
    public void setUpBase() {
        if (app == null) {
            app = new TestManager();
        }
        driver = app.getDriver();
    }

    @After
    public void endTest() {
        System.out.println("Завершение теста");
        app.getDriver().close();
    }

}
