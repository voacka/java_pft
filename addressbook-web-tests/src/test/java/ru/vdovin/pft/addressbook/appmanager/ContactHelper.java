package ru.vdovin.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.vdovin.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        clearAndType(By.name("firstname"), contactData.getFirstname());
        clearAndType(By.name("lastname"), contactData.getLastname());
        clearAndType(By.name("address"), contactData.getAddress());
        clearAndType(By.name("mobile"), contactData.getMobile());
        clearAndType(By.name("email"), contactData.getEmail());
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

    public void editSelectedContact(int index) {
        driver.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
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

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : elements) {
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
            String lastname = element.findElement(By.xpath("td[2]")).getText();
            String firstname = element.findElement(By.xpath("td[3]")).getText();
            String address = element.findElement(By.xpath("td[4]")).getText();
            String email = element.findElement(By.xpath("td[5]")).getText();
            String phone = element.findElement(By.xpath("td[6]")).getText();

            ContactData contact = new ContactData(id, lastname, firstname, address, email, phone, null);
            contacts.add(contact);
        }
        return contacts;
    }
}
