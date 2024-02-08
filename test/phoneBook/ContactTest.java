package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact myContact;
    @BeforeEach
            public void testThisFirst() {
         myContact = new Contact("chi","chi","0810000","gloB@gmail.com","yaba");
    }
    @Test
    public void TestForFirstName(){
        assertEquals("chi",myContact.getFirstName());
    }

    @Test
    public void TestForLastName(){
        assertEquals("chi",myContact.getLastName());
    }
    @Test
    public void TestForPhoneNumber(){
        assertEquals("0813399999",myContact.getPhoneNumber());
    }

}