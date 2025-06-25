package com.example.JobSeeker.Service;

import com.example.JobSeeker.Entity.companies;
import com.example.JobSeeker.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Service
public class CompanyService {


    @Autowired
   CompanyRepository companyrepository;


    public  companies save(MultipartFile file, String contact, String name, String email, String address, String description, String password, LocalDate joining_date, String status) throws Exception{
        companies com = new companies();
        com.setContact(contact);
        com.setName(name);
        com.setEmail(email);
        com.setAddress(address);
        com.setDescription(description);
        com.setPassword(password);
        com.setJoining_date(joining_date);
        com.setStatus(status);
        com.setCompany_logo(file.getBytes());
        return companyrepository.save(com);

    }
}
