package ru.vdovin.pft.addressbook;// Generated by Selenium IDE

import org.junit.Test;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDelete() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
