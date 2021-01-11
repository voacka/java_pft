package ru.vdovin.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData) {
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
        click(By.cssSelector("input:nth-child(87)"));
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
        click(By.cssSelector("input:nth-child(86)"));
    }

    public void fillContactFormEdition(ContactData contactData) {
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
    }
}
