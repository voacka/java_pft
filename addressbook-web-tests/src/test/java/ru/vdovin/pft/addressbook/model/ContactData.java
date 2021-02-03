package ru.vdovin.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String email;
    private final String mobile;
    private String group;
    private int id;

    public ContactData(int id,
                       String firstname,
                       String lastname,
                       String address,
                       String email,
                       String mobile,
                       String group) {
        this.id = id;
        this.firstname = firstname;
        this.address = address;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, address, email, mobile, group, id);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + mobile + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

}
