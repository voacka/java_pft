package ru.vdovin.pft.addressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class ApplicationManager {

    WebDriver driver;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    JavascriptExecutor js;
    private Map<String, Object> vars;

    public void init() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://localhost/addressbook/");
        contactHelper = new ContactHelper(driver);
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper () {
        return contactHelper;
    }

}
