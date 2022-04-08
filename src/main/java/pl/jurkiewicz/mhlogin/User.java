package pl.jurkiewicz.mhlogin;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_EMAIL", nullable = false, unique = true, length = 32)
    private String email;
    @Column(name="USER_PASSWORD", nullable = false, length = 64)
    private String password;
    @Column(name = "USER_NAME", nullable = false, unique = true, length = 32)
    private String login;
    @Column(name = "USER_FIRST_NAME",nullable = false, length = 32)
    private String firstName;
    @Column(name = "USER_LAST_NAME",nullable = true, length = 32)
    private String lastName;
    @Column(name = "USER_PHONE_NUMBER", nullable = false, precision = 9, scale = 0)
    private String phoneNumber;
    @Column(name= "USER_CITY", nullable = false, length = 32)
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }



}
