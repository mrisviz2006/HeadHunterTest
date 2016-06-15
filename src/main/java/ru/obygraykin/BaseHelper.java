package ru.obygraykin;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: obygraykin on 14.06.2016
 * @spec_id:
 * @overview:
 * @goal:
 * @setup_and_info:
 */
public class BaseHelper{

    protected TestManager manager;

    public BaseHelper(TestManager manager) {
        this.manager = manager;
    }

    protected void click(WebElement element) {
        System.out.println("Кликаем по элементу " + element.getText());
        element.click();
        System.out.println("Клик произведен");
    }

    public void openPricePage() {
        manager.getDriver().get("http://hh.ru/price");
        manager.getDriver().manage().window().maximize();
    }

    protected void assertTrue(boolean flag, String messageTrue, String messageFalse) {
        if (flag) {
            System.out.println(messageTrue);
        } else {
            System.err.println(messageFalse);
        }
    }

    protected void checkAddValue(String value, List<WebElement> list) {
        boolean flag = true;
        for (WebElement element : list) {
            if (element.getText().startsWith(value)) {
                System.out.println("Значение присутствует в списке " + value);
                return;
            }
        }
        if (flag) {
            System.err.println("Значение отсутствует в списке " + value);
        }
    }

    protected List<String> getValuesElements(List<WebElement> elements) {
        List<String> list = new ArrayList<String>();
        for (WebElement element : elements) {
            list.add(element.getText());
        }
        return list;
    }

    protected void separator() {
        System.out.println("");
    }
}
