package ru.obygraykin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author: obygraykin on 14.06.2016
 */
public class Page {

    @FindBy(xpath = "//*[@class='nopaddings']/ul/a[1]")
    private WebElement tabRec;

    @FindBy(className = "form-box-flagged__flag-title")
    WebElement titleRec;

    @FindBy(xpath = "//*[@class='nopaddings']/ul/a[2]")
    private WebElement tabData;

    @FindBy(className = "price-resume-access__title")
    WebElement titleData;

    @FindBy(xpath = "//*[@class='nopaddings']/ul/a[3]")
    private WebElement tabPublic;

    @FindBy(className = "flat-tabs__body")
    WebElement publicContent;

    @FindBy(xpath = "//*[@class='nopaddings']/ul/a[4]")
    private WebElement tabEval;

    @FindBy(className = "price-countable-service-info")
    WebElement serviceInfo;

    @FindBy(xpath = "//*[@class='nopaddings']/ul/a[5]")
    private WebElement tabCond;

    @FindBy(className = "price-countable-service__content")
    WebElement serviceContent;

    public WebElement getTabRec() {
        return tabRec;
    }

    public String getTitleRec() {
        return titleRec.getText();
    }

    public WebElement getTabDatabase() {
        return tabData;
    }

    public String getTitleData() {
        return titleData.getText();
    }

    public WebElement getTabPublication() {
        return tabPublic;
    }

    public WebElement getPublicContent() {
        return publicContent;
    }

    public WebElement getTabEvaluation() {
        return tabEval;
    }

    public String getServiceInfo() {
        return serviceInfo.getText();
    }

    public WebElement getTabServices() {
        return tabCond;
    }

    public WebElement getServiceContent() {
        return serviceContent;
    }

}
