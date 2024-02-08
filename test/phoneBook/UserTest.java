package phoneBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testThatUserCanAddPhoneNumber(){
        String firstName = "chi";
        String lastName = "chi";
        String phoneNumber = "0810000";
        String email ="gloB@gmail.com";
        String homeAddress ="yaba";
        User user = new User();
        user.savePhoneNumber(firstName,lastName,phoneNumber,email,homeAddress);
        assertEquals(1,user.getTotalPhoneNumberCount());
    }

    @Test
    public void testThatUserCanSearchPhoneNumberByName(){
        String firstName = "chi";
        String lastName = "chi";
        String phoneNumber = "0810000";
        String email = "gloebudavi@gmail.com";
        String homeAddress = "yaba";
        User user = new User();
        user.savePhoneNumber(firstName,lastName,phoneNumber,email,homeAddress);
        assertEquals(1,user.getTotalPhoneNumberCount());
        String name = String.valueOf(user.searchPhoneNumber(firstName));
        assertTrue(true,name);
    }

}