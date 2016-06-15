package ru.obygraykin.tests;

import org.junit.Before;
import org.junit.Test;
import ru.obygraykin.TestBase;

/**
 * Created by Obygraykin on 14.06.2016.
 */
public class Test2 extends TestBase {

    @Before
    public void setUp() {
        System.out.println("Проверка вкладки - Доступ к базе резюме");
    }

    @Test
    public void checkPriceTabsTest() {
        app.getBaseHelper().openPricePage();
        app.getTabsHelper().openAccessResumeDatabaseTab();
        app.getDatabaseHelper().checkDatabasePage();
    }
}
