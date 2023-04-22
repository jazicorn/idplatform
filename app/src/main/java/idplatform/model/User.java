package idplatform.model;

import java.util.UUID;

/**
 * User Modelfor UUID Generation
 * 
 */
public class User<T> {
    // required parameters
    private T userId; // generic so that admin can decide on id type
    private String email;
    private String passcode;
    // optional parameters
    private String firstName;
    private String lastName;
    private String phone;

    // generate uuid
    UUID uuidAccountCreation = UUID.randomUUID();

    // Constructor
    public User(
            T userId,
            String email,
            String uuidAccountCreationAsString,
            String firstName,
            String lastName,
            String phone) {
        this.email = email;
        this.userId = userId;
        this.passcode = uuidAccountCreationAsString == null ? uuidAccountCreation.toString()
                : uuidAccountCreationAsString;
        this.firstName = firstName == null ? null : firstName;
        this.lastName = lastName == null ? null : lastName;
        this.phone = phone == null ? null : phone;
    }

    // userId
    public T getUserId() {
        return userId;
    }

    public void setUserId(T userId) {
        this.userId = userId;
    }

    // email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // passcode

    public String passcode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    // firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
