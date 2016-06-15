package ru.obygraykin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Obygraykin on 15.06.2016.
 */
public class AccessResumeDatabasePage extends Page {

    @FindBy(className = "price-resume-access")
    private WebElement priseResume;

    @FindBy(xpath = "//*[@class = 'price-resume-access']/div[3]/div[2]/span")
    private WebElement regionBtn;

    @FindBy(xpath = "//*[@class = 'price-resume-access']/div[3]/div[1]/span")
    private List<WebElement> listSelectedRegion;

    @FindBy(xpath = "//*[@class = 'HH-Price-ResumeAccess-Period_short']//label")
    List<WebElement> listExpress;

    @FindBy(xpath = "//*[@class = 'HH-Price-ResumeAccess-Period_medium']//label")
    List<WebElement> listMedium;

    @FindBy(xpath = "//*[@class = 'HH-Price-ResumeAccess-Period_long']//label")
    List<WebElement> listLong;

    @FindBy(xpath = "//*[@class = 'HH-Price-ResumeAccess-Cost']/..")
    WebElement price;

    @FindBy(xpath = "//*[@class = 'price-resume-access__summary']//button")
    WebElement addCart;

    public WebElement getPriseResume() {
        return priseResume;
    }

    public WebElement getRegionBtn() {
        return regionBtn;
    }

    public List<WebElement> getListSelectedRegion() {
        return listSelectedRegion;
    }

    public List<WebElement> getListExpress() {
        return listExpress;
    }

    public List<WebElement> getListMedium() {
        return listMedium;
    }

    public List<WebElement> getListLong() {
        return listLong;
    }

    public WebElement getPrice() {
        return price;
    }

    public WebElement getAddCart() {
        return addCart;
    }
}
