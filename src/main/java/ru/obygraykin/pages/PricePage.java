package ru.obygraykin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author: obygraykin on 14.06.2016
 */
public class PricePage extends Page {

    @FindBy(className = "HH-PriceCart")
    private WebElement cart;

    @FindBy(className = "price-cart__item-wrapper")
    private List<WebElement> items;

    @FindBy(xpath = "//*[@class = 'price-cart__total-cost']/strong")
    private WebElement totalCost;

    public WebElement getCart() {
        return cart;
    }

    public List<WebElement> getItems() {
        return items;
    }

    public WebElement getTotalCost() {
        return totalCost;
    }
}
