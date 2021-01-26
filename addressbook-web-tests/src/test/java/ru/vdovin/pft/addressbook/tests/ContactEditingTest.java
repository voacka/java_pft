package ru.vdovin.pft.addressbook.tests;


import org.junit.Test;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactEditingTest extends TestBase {

    @Test
    public void testContactEdition() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAnyContact()) {
                app.getContactHelper().createContact(new ContactData("test",
                        "test",
                        "test",
                        "test",
                        "LFC",
                        "Moscow",
                        "test",
                        "+7-926-777-77-77",
                        "+7-495-777-77-77",
                        "test@test.ru",
                        "test@yandex.ru",
                        "test@gmail.ru",
                        "https://vk.com/",
                        null));
        }
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(new ContactData("Vasya",
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
                "https://vk.com/Vasya/",
                null), false);
        app.getContactHelper().submitContactEditing();
        app.getNavigationHelper().gotoHomePage();
    }
}
