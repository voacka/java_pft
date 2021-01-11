package ru.vdovin.pft.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import ru.vdovin.pft.addressbook.appmanager.ApplicationManager;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
