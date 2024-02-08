package phoneBook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String homeAddress;

    public Contact(String firstName, String lastName, String phoneNumber,String email,String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
    }
    public Contact(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                first Name: %s
                last Name; %s
                Phone Number: + 234 %s
                email: @gmail.com
                homeAddress: yaba
                """,firstName,lastName,phoneNumber,email,homeAddress);
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public String getHomeAddress() {
        return homeAddress;
    }


}
