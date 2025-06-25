package com.example.JobSeeker.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "qualification")
public class qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ql_id;
    String degree;
    String institution;
    LocalDate yearofpassing;
    String categries;
    String grade;

    public qualification(int ql_id, String degree, String institution, LocalDate yearofpassing, String categries, String grade) {
        this.ql_id = ql_id;
        this.degree = degree;
        this.institution = institution;
        this.yearofpassing = yearofpassing;
        this.categries = categries;
        this.grade = grade;
    }

    public int getQl_id() {
        return ql_id;
    }

    public void setQl_id(int ql_id) {
        this.ql_id = ql_id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public LocalDate getYearofpassing() {
        return yearofpassing;
    }

    public void setYearofpassing(LocalDate yearofpassing) {
        this.yearofpassing = yearofpassing;
    }

    public String getCategries() {
        return categries;
    }

    public void setCategries(String categries) {
        this.categries = categries;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public qualification() {
    }
}

