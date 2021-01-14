package ru.vdovin.pft.addressbook.tests;

import org.junit.Test;
import ru.vdovin.pft.addressbook.model.GroupData;

public class GroupEditingTest extends TestBase {

    @Test
    public void testGroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editSelectedGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("Group 1", null, null));
        app.getGroupHelper().submitGroupEditing();
        app.getGroupHelper().returnToGroupPage();

    }

}
