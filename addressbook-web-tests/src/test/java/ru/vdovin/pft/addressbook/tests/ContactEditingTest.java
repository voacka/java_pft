package ru.vdovin.pft.addressbook.tests;


import org.junit.Test;
import org.testng.Assert;
import ru.vdovin.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactEditingTest extends TestBase {

    @Test
    public void testContactEdition() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAnyContact()) {
                app.getContactHelper().createContact(new ContactData(0,
                        "New contact",
                        "New contact",
                        "New contact",
                        "edit@edit.edit",
                        "77777",
                        "test1"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().editSelectedContact(before.size() - 2);
        app.getContactHelper().fillContactForm(new ContactData(0,
                "Edited correctly",
                "Edited correctly",
                "Edited correctly",
                "edit@edit.edit",
                "88888",
                null), false);
        app.getContactHelper().submitContactEditing();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());
    }
}
