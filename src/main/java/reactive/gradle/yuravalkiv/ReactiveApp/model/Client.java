package reactive.gradle.yuravalkiv.ReactiveApp.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

//Entity class
@Table(name = "client")
public class Client {

    @Id
    @Column(value = "id")
    private Long id;
    @NotEmpty(message = "First name is required")
    @Size(max = 50, message = "First name cannot exceed 50 characters")
    @Column(value = "firstname")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    @Column(value = "lastname")
    private String lastName;

    @NotEmpty(message = "Address is required")
    @Size(max = 100, message = "Address cannot exceed 100 characters")
    @Column(value = "address")
    private String address;

    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be a 10-digit number")
    @Column(value = "phonenumber")
    private String phoneNumber;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(value = "email")
    private String email;

    //getters and setters

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, String address, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(getFirstName(), client.getFirstName()) && Objects.equals(getLastName(), client.getLastName()) && Objects.equals(getAddress(), client.getAddress()) && Objects.equals(getPhoneNumber(), client.getPhoneNumber()) && Objects.equals(getEmail(), client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAddress(), getPhoneNumber(), getEmail());
    }
}
