package com.example.JobSeeker.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "job_seeker")
public class job_seeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int js_id;
    String name , email , contact , address , password ,skill;
    @Column(name= "resume")
    byte[] rusume;
    byte [] profile_picture;

    public job_seeker(int js_id, String name, String email, String contact, String address, String password, String skill, byte[] rusume, byte[] profile_picture) {
        this.js_id = js_id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.password = password;
        this.skill = skill;
        this.rusume = rusume;
        this.profile_picture = profile_picture;
    }

    public int getJs_id() {
        return js_id;
    }

    public void setJs_id(int js_id) {
        this.js_id = js_id;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public byte[] getRusume() {
        return rusume;
    }

    public void setRusume(byte[] rusume) {
        this.rusume = rusume;
    }

    public byte[] getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(byte[] profile_picture) {
        this.profile_picture = profile_picture;
    }

    public job_seeker() {
    }
}
