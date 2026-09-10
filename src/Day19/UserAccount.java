package Day19;

public class UserAccount {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount(String firstName, String middleName, String lastName, String address, String email,
    String password){
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setAddress(address);
        setEmail(email);
        setPassword(password);

        System.out.println("User Created");
        System.out.println("Full Name : " + getFirstName() + " " + middleName + " " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") || email.contains(".")){
            this.email = email;
        }else{
            System.out.println("Invalid email");
            this.email = "no@email.com";
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 8){
            System.out.println("password must be 8 characters or above");
            System.out.println("setting the password to 12345678 by default");
            this.password = "12345678";
            return;
        }else {
            this.password = password;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
