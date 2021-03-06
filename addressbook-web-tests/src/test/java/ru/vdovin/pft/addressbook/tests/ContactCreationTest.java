package ru.vdovin.pft.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;
import org.testng.Assert;
import ru.vdovin.pft.addressbook.model.ContactData;
import ru.vdovin.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData(0,
                "New contact",
                "New contact",
                "New contact",
                "12@ya.ru",
                "6666",
                "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
