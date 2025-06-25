package com.example.JobSeeker.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "companies")
public class companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int company_id;
    String contact,name ,email,address, description , password , status;
    LocalDate joining_date;
    byte[] company_logo;

    public companies(int company_id, String contact, String name, String email, String address, String description, String password, String status, LocalDate joining_date, byte[] company_logo) {
        this.company_id = company_id;
        this.contact = contact;
        this.name = name;
        this.email = email;
        this.address = address;
        this.description = description;
        this.password = password;
        this.status = status;
        this.joining_date = joining_date;
        this.company_logo = company_logo;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(LocalDate joining_date) {
        this.joining_date = joining_date;
    }

    public byte[] getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(byte[] company_logo) {
        this.company_logo = company_logo;
    }

    public companies() {

    }
}
