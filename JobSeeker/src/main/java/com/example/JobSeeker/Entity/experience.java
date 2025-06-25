package com.example.JobSeeker.Entity;

import jakarta.persistence.*;
import org.apache.catalina.users.GenericRole;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int experience_id;

    private String company_name , job_title;
    LocalDate start_date;
    LocalDate end_date;
    String description;
    int js_id;

    public experience(int experience_id,  String company_name, String job_title, LocalDate start_date, LocalDate end_date, String description, int js_id) {
        this.experience_id = experience_id;

        this.company_name = company_name;
        this.job_title = job_title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.description = description;
        this.js_id = js_id;
    }

    public int getExperience_id() {
        return experience_id;
    }

    public void setExperience_id(int experience_id) {
        this.experience_id = experience_id;
    }





    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getJs_id() {
        return js_id;
    }

    public void setJs_id(int js_id) {
        this.js_id = js_id;
    }

    public experience() {
    }
}
