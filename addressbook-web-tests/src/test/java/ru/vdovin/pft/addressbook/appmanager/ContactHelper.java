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
        clearAndType(By.name("address"), contactData.getAddress());
        clearAndType(By.name("home"), contactData.getHome());
        clearAndType(By.name("mobile"), contactData.getMobilePhone());
        clearAndType(By.name("work"), contactData.getWorkPhone());
        clearAndType(By.name("email"), contactData.getEmail1());
        clearAndType(By.name("email2"), contactData.getEmail2());
        clearAndType(By.name("email3"), contactData.getEmail3());
        clearAndType(By.name("homepage"), contactData.getHomepage());
        click(By.name("bday"));
        {
            click(By.xpath("//option[. = '1']"));
        }
        click(By.name("bmonth"));
        {
            click(By.xpath("//option[. = 'January']"));
        }
        clearAndType(By.name("byear"), "2000");
        {
            click(By.xpath("//option[. = '1']"));
        }
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("[none]");
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void confirmDeletion() {
        driver.switchTo().alert().accept();
    }

    public void deleteSelectedContact() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void selectContact(String name) {
        click(By.name(name));
    }

    public void editSelectedContact() {
        click(By.cssSelector(".center:nth-child(8) img"));
    }

    public void submitContactEditing() {
        click(By.name("update"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact, true);
        submitContactCreation();
    }

    public boolean isThereAnyContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
