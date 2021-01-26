package ru.vdovin.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String address;
    private final String home;
    private final String mobilePhone;
    private final String workPhone;
    private final String email1;
    private final String email2;
    private final String email3;
    private final String homepage;
    private String group;

    public ContactData(String firstname,
                       String middlename,
                       String lastname,
                       String nickname,
                       String company,
                       String address,
                       String home,
                       String mobilePhone,
                       String workPhone,
                       String email1,
                       String email2,
                       String email3,
                       String homepage,
                       String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getGroup() {
        return group;
    }
}
