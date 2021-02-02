package ru.vdovin.pft.addressbook.tests;


import org.junit.Test;
import org.testng.Assert;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactEditingTest extends TestBase {

    @Test
    public void testContactEdition() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAnyContact()) {
                app.getContactHelper().createContact(new ContactData("New contact",
                        "New contact",
                        "New contact",
                        "New contact",
                        "New contact",
                        "test1"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().editSelectedContact("//img[@alt='Edit']", before - 2);
        app.getContactHelper().fillContactForm(new ContactData("Edited correctly",
                "Edited correctly",
                "Edited correctly",
                "Edited correctly",
                "Edited correctly",
                null), false);
        app.getContactHelper().submitContactEditing();
        app.getNavigationHelper().gotoHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}
