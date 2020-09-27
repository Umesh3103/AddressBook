package com.practice;
import java.util.*;

public class Details {
    private List<Contact> addressBook=new ArrayList<Contact>();
    public List<Contact>getAddressBook()
    {
        return addressBook;
    }
    public void setPhoneBook(List<Contact>addressBook)
    {
        this.addressBook=addressBook;
    }
    public void addContact(Contact contactObj)
    {
        addressBook.add(contactObj);
    }

}
