package ru.vdovin.pft.addressbook.tests;


import org.junit.Test;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactEditingTest extends TestBase {

    @Test
    public void testContactEdition() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact("selected[]");
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactFormEdition(new ContactData("Vasya",
                "Vasya",
                "Vasya",
                "Vasya",
                "Vasya",
                "Vasya",
                "Vasya",
                "+Vasya",
                "+Vasya",
                "Vasya@yandex.ru",
                "",
                "",
                "https://vk.com/Vasya/"));
        app.getContactHelper().submitContactEditing();
        app.getNavigationHelper().gotoHomePage();
    }
}