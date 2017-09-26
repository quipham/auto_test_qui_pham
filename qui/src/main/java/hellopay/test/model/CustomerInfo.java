package hellopay.test.model;

public class CustomerInfo {

    private String gender;

    private String name;

    private String email;

    private String dateOfBirth;

    private String monthOfBirth;

    private String yearOfBirth;

    private String password;

    public String getGender() {
        return gender;
    }

    public CustomerInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public CustomerInfo setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public CustomerInfo setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
        return this;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public CustomerInfo setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CustomerInfo setPassword(String password) {
        this.password = password;
        return this;
    }
}
