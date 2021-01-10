package ru.vdovin.pft.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;
import ru.vdovin.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Victor", "Vladimirovich", "Vdovin", "Voacka", "Afina LLC", "Moscow", "Zhuk", "+7-926-777-77-77", "+7-495-777-77-77", "vdovin@afina-pet.ru", "vdovin91@yandex.ru", "vdovin91@gmail.ru", "https://vk.com/id11120154"));
        app.getContactHelper().returnToHomePage();
    }

}
