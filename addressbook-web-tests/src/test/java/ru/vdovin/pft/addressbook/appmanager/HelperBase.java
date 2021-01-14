package ru.vdovin.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void clear(By locator) {
        driver.findElement(locator).clear();
    }

    protected void clearAndType(By locator, String text) {
        click(locator);
        if (text != null) {
            clear(locator);
            driver.findElement(locator).sendKeys(text);
        }
    }
}
