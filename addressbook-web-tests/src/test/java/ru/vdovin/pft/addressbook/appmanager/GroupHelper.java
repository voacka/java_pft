package ru.vdovin.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.vdovin.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void fillGroupForm(GroupData groupData) {
        clearAndType(By.name("group_name"), groupData.getName());
        clearAndType(By.name("group_header"), groupData.getHeader());
        clearAndType(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.cssSelector("input:nth-child(9)"));
    }

    public void selectGroup() {
        click(By.cssSelector(".group:nth-child(6) > input"));
    }

    public void editSelectedGroup() {
        click(By.name("edit"));
    }

    public void submitGroupEditing() {
        click(By.name("update"));
    }
}
