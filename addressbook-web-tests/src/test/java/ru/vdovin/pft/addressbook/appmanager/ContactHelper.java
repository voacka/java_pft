package ru.vdovin.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.vdovin.pft.addressbook.model.ContactData;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("email"), contactData.getEmail1());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomepage());
        click(By.name("bday"));
        {
            click(By.xpath("//option[. = '1']"));
        }
        click(By.name("bmonth"));
        {
            click(By.xpath("//option[. = 'January']"));
        }
        type(By.name("byear"), "2000");
        {
            click(By.xpath("//option[. = 'test1']"));
        }
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void confirmDeletion() {
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        driver.switchTo().alert().accept();
    }

    public void deleteSelectedContact() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }


}
