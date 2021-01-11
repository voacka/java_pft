package ru.vdovin.pft.addressbook.tests;


import org.junit.Test;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactEditingTest extends TestBase {

    @Test
    public void testContactEdition() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactFormEdition(new ContactData("Victor",
                "Vladimirovich",
                "Vdovin",
                "Voacka",
                "LFC",
                "Moscow",
                "Zhuk",
                "+888888",
                "+888888",
                "vdovin91@yandex.ru",
                "",
                "",
                "https://vk.com/"));
        app.getContactHelper().submitContactEditing();
//        app.getNavigationHelper().gotoHomePage();
    }
}
