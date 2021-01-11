package ru.vdovin.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.vdovin.pft.addressbook.model.GroupData;


public class GroupEditingTest extends TestBase {

    @Test
    public void testGroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editSelectedGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("test4", "test5", "test6"));
        app.getGroupHelper().submitGroupEditing();
        app.getGroupHelper().returnToGroupPage();

    }

}
