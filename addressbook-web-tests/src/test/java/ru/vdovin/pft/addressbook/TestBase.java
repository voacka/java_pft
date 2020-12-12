package ru.vdovin.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class TestBase {


    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.manage().window().setSize(new Dimension(1936, 1056));
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    protected void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    protected void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void deleteSelectedGroups() {
      driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    }

    protected void selectGroup() {
      driver.findElement(By.cssSelector(".group:nth-child(6) > input")).click();
    }
}
