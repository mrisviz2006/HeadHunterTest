package ru.obygraykin.tests;

import ru.obygraykin.TestBase;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: obygraykin on 14.06.2016
 */
public class Test1 extends TestBase {

    @Before
    public void setUp() {
        System.out.println("Проверка открытия вкладок с услугами");
    }

    @Test
    public void checkPriceTabsTest() {
        app.getBaseHelper().openPricePage();
        app.getTabsHelper().openRecomendetTab()
                .openAccessResumeDatabaseTab()
                .openPublicationVacanciesTab()
                .openTalentEvaluationTab()
                .openAdditionalServicesTab();
    }

}
