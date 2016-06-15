package ru.obygraykin.pages.dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Obygraykin on 15.06.2016.
 */
public class Region {

    @FindBy(className = "popup-container g-perspective")
    private WebElement dialog;

    @FindBy(className = "popup-header-text")
    private WebElement titleDialog;

    @FindBy(xpath = "//*[@class = 'popup-container g-perspective']//label")
    private List<WebElement> listRegion;

    @FindBy(xpath = "html/body/div[7]/div/div[2]/div[3]/input")
    private WebElement selectBtn;

    public boolean isOnThisDialog() {
        return "Введите город".equals(titleDialog.getText());
    }

    public List<WebElement> getListRegion() {
        return listRegion;
    }

    public WebElement getSelectBtn() {
        return selectBtn;
    }
}
