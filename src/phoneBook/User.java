package phoneBook;

import java.util.ArrayList;

public class User {

    ArrayList<Contact> myContacts = new ArrayList<>();
    int totalPhoneNumberCount;


    public Contact savePhoneNumber(String firstName, String lastName, String phoneNumber,String email,String homeAddress){
        Contact contact = new Contact(firstName,lastName,phoneNumber,email,homeAddress);
        totalPhoneNumberCount++;
        myContacts.add(contact);
        return contact;

    }

    public ArrayList<Contact> searchPhoneNumber(String firstName ){
        Contact contact1 = new Contact(firstName);

        for (Contact contact:myContacts){
            if (myContacts.equals(contact)) {System.out.println(contact);
    }
        }
        return myContacts;
    }



    public int getTotalPhoneNumberCount(){
        return totalPhoneNumberCount;
    }
}
