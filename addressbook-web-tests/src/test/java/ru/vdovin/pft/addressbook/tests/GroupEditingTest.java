package ru.vdovin.pft.addressbook.tests;

import org.junit.Test;
import org.testng.Assert;
import ru.vdovin.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupEditingTest extends TestBase {

    @Test
    public void testGroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAnyGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().editSelectedGroup();
        GroupData group = new GroupData(before.get(before.size() - 1).getId(), "test1", null, null);
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupEditing();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
