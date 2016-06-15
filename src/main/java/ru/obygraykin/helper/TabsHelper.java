package ru.obygraykin.helper;

import org.openqa.selenium.support.PageFactory;
import ru.obygraykin.BaseHelper;
import ru.obygraykin.TestManager;
import ru.obygraykin.pages.Page;

/**
 * Класс помошник для навигации по вкладкам
 * Created by Obygraykin on 15.06.2016.
 */
public class TabsHelper extends BaseHelper {

    private Page page;

    public TabsHelper(TestManager manager) {
        super(manager);
        page = PageFactory.initElements(manager.getDriver(), Page.class);
    }

    public TabsHelper openRecomendetTab() {
        System.out.println("Переходим на вкладку - Рекомендуемое");
        click(page.getTabRec());
        checkOpenTabs("Подарки при первой покупке".equals(page.getTitleRec()));
        separator();
        return this;
    }

    public TabsHelper openAccessResumeDatabaseTab() {
        System.out.println("Переходим на вкладку - Доступ к базе резюме");
        click(page.getTabDatabase());
        checkOpenTabs("Доступ к базе резюме1".equals(page.getTitleData()));
        separator();
        return this;
    }

    public TabsHelper openPublicationVacanciesTab() {
        System.out.println("Переходим на вкладку - Публикации вакансий");
        click(page.getTabPublication());
        checkOpenTabs(page.getPublicContent().isDisplayed());
        separator();
        return this;
    }

    public TabsHelper openTalentEvaluationTab() {
        System.out.println("Переходим на вкладку - Оценка талантов");
        click(page.getTabEvaluation());
        checkOpenTabs(page.getServiceInfo().contains("Услуги для определения аналитических способностей"));
        separator();
        return this;
    }

    public TabsHelper openAdditionalServicesTab() {
        System.out.println("Переходим на вкладку - Дополнительные услуги");
        click(page.getTabServices());
        checkOpenTabs(page.getServiceContent().isDisplayed());
        separator();
        return this;
    }

    private void checkOpenTabs(boolean equals) {
        assertTrue(equals, "Вкладка открылась", "Вкладка не открылась");
    }
}
