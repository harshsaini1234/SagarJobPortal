package com.example.JobSeeker.Service;

import com.example.JobSeeker.Entity.job_seeker;
import com.example.JobSeeker.JobSeekerApplication;
import com.example.JobSeeker.Repository.Job_seeker_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class job_seeker_Servive {

    @Autowired
    Job_seeker_Repository job_seeker_repository;

    public job_seeker save( MultipartFile file , MultipartFile file2 , String name , String email , String contact ,String address , String password , String skill) throws Exception {
        job_seeker job = new job_seeker();
        job.setName(name);
        job.setEmail(email);
        job.setContact(contact);
        job.setAddress(address);
        job.setPassword(password);
        job.setSkill(skill);
        job.setProfile_picture(file.getBytes());
        job.setRusume(file2.getBytes());
       return job_seeker_repository.save(job);



    }
}
