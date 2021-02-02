package ru.vdovin.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        clearAndType(By.name("firstname"), contactData.getFirstname());
        clearAndType(By.name("middlename"), contactData.getMiddlename());
        clearAndType(By.name("lastname"), contactData.getLastname());
        clearAndType(By.name("nickname"), contactData.getNickname());
        clearAndType(By.name("company"), contactData.getCompany());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact, true);
        submitContactCreation();
    }

    public void confirmDeletion() {
        driver.switchTo().alert().accept();
    }

    public void deleteSelectedContact() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void selectContact(String name, int index) {
        driver.findElements(By.name(name)).get(index).click();
    }

    public void editSelectedContact(String name, int index) {
        driver.findElements(By.xpath(name)).get(index).click();
    }

    public void submitContactEditing() {
        click(By.name("update"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public boolean isThereAnyContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return driver.findElements(By.xpath("//img[@alt='Edit']")).size();
    }
}
