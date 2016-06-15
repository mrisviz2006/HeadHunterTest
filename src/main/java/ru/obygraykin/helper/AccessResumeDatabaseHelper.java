package ru.obygraykin.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.obygraykin.BaseHelper;
import ru.obygraykin.TestManager;
import ru.obygraykin.pages.AccessResumeDatabasePage;
import ru.obygraykin.pages.dialog.Region;

/**
 * Класс помошник для работы с вкладкой Доступ к базе резюме
 * Created by Obygraykin on 15.06.2016.
 */
public class AccessResumeDatabaseHelper extends BaseHelper {

    AccessResumeDatabasePage databasePage;

    Region region;

    public AccessResumeDatabaseHelper(TestManager manager) {
        super(manager);
        databasePage = PageFactory.initElements(manager.getDriver(), AccessResumeDatabasePage.class);
    }

    /**
     * Проверка работы страницы
     * @return AccessResumeDatabaseHelper
     */
    public AccessResumeDatabaseHelper checkDatabasePage() {
        // Проверяем возможность выбора региона из списка
        checkSelectRegion();
        // TODO Аналогичным образом проверяем работу с диалогом выбора проф. области
        checkSelectProf();
        checkAddToCartServices();
        return this;
    }

    /**
     * Проверка добавления услуги
     */
    private void checkAddToCartServices() {
        for (int i = 0; i < databasePage.getListExpress().size(); i++) {
            WebElement element = databasePage.getListExpress().get(i);
            String price = databasePage.getListExpress().get(i).findElement(By.className("money")).getText();
            click(element);
            assertTrue(price.equals(databasePage.getPrice().getText()), "Отображается корректная сумма", "Оторажается некорректная сумма");
            click(databasePage.getAddCart());
            manager.getPriceHelper()
                    .checkAddItemAndCost(price)
                    .delItem();
        }
    }

    /**
     * Проверка выбора проф. области
     */
    private void checkSelectProf() {
        // Empty
    }

    /**
     * Проверка выбора региона
     */
    private void checkSelectRegion() {
        String addRegion = "Санкт-Петербург и Ленинградская область";
        click(databasePage.getRegionBtn());
        region = PageFactory.initElements(manager.getDriver(), Region.class);
        assertTrue(region.isOnThisDialog(), "Открылся диалог выбора региона", "Диалог выбора региона не открылся");
        System.out.println();
        for (WebElement element : region.getListRegion()) {
            if (addRegion.equals(element.findElement(By.xpath("span")).getText())) {
                click(element);
                click(region.getSelectBtn());
                break;
            }
        }
        checkAddValue(addRegion, databasePage.getListSelectedRegion());
    }

}
