package ru.vdovin.pft.addressbook.tests;

import org.junit.Test;
import ru.vdovin.pft.addressbook.model.GroupData;

public class GroupEditingTest extends TestBase {

    @Test
    public void testGroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAnyGroup()) {
            app.getGroupHelper().createGroup(new GroupData("testnew", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editSelectedGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("null", "header123", "null"));
        app.getGroupHelper().submitGroupEditing();
        app.getGroupHelper().returnToGroupPage();
    }

}
