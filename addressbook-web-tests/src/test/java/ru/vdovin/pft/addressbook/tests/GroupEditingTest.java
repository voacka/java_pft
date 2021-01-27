package ru.vdovin.pft.addressbook.tests;

import org.junit.Test;
import org.testng.Assert;
import ru.vdovin.pft.addressbook.model.GroupData;

public class GroupEditingTest extends TestBase {

    @Test
    public void testGroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAnyGroup()) {
            app.getGroupHelper().createGroup(new GroupData("testnew", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editSelectedGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("null", "header123", "null"));
        app.getGroupHelper().submitGroupEditing();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }

}
