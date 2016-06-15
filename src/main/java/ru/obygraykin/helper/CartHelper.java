package ru.obygraykin.helper;

import org.openqa.selenium.By;
import ru.obygraykin.BaseHelper;
import ru.obygraykin.TestManager;
import ru.obygraykin.pages.PricePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс помошник для работы с корзиной
 * @author: obygraykin on 14.06.2016
 */
public class CartHelper extends BaseHelper {

    private PricePage pricePage;

    public CartHelper(TestManager manager) {
        super(manager);
        pricePage = PageFactory.initElements(manager.getDriver(), PricePage.class);
    }

    /**
     * Проверка добавления значения в корзину и сверка суммы
     * @param money сумма
     * @return CartHelper
     */
    public CartHelper checkAddItemAndCost(String money) {
        assertTrue(money.equals(pricePage.getItems().get(0).findElement(By.className("price-cart__actual-cost")).getText()),
                "В корзине отображается корректное значение", "В корзине отображается некорректное значение");
        assertTrue(money.equals(pricePage.getTotalCost().getText()), "Финальная сумма корректна", "Финальная сумма некорректна");
        return this;
    }

    /**
     * Удаление элемента из корзины
     * @return CartHelper
     */
    public CartHelper delItem() {
        click(pricePage.getItems().get(0).findElement(By.xpath("../span")));
        return this;
    }

}
