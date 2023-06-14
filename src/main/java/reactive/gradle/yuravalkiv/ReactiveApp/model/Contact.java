package reactive.gradle.yuravalkiv.ReactiveApp.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Contact {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private String email;
    private Long client_id;
    private Long deal_id;

    public Contact() {
    }

    public Contact(Long id, String firstName, String lastName, String position, String phoneNumber, String email, Long client_id, Long deal_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.client_id = client_id;
        this.deal_id = deal_id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(Long deal_id) {
        this.deal_id = deal_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getFirstName(), contact.getFirstName()) && Objects.equals(getLastName(), contact.getLastName()) && Objects.equals(getPosition(), contact.getPosition()) && Objects.equals(getPhoneNumber(), contact.getPhoneNumber()) && Objects.equals(getEmail(), contact.getEmail()) && Objects.equals(getClient_id(), contact.getClient_id()) && Objects.equals(getDeal_id(), contact.getDeal_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPosition(), getPhoneNumber(), getEmail(), getClient_id(), getDeal_id());
    }
}
