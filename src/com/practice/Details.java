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
    public Contact editContactGivenName(String name)
    {
        int count=0;
        List<Contact>arr1=new ArrayList<Contact>();
        Contact temp=null;
        for(Contact c:addressBook)
        {
            if(c.getFirstName()==name)
            {
                temp=new Contact(c.getFirstName(),c.getLastName(),c.getAddress(),c.getCity(), c.getState(), c.getZip(), c.getPhNum(), c.getEmail());
                count+=1;
            }
        }
        if(count==1)
        {
            return temp;
        }
        else 
        {
            return null;
        }
    }

}
