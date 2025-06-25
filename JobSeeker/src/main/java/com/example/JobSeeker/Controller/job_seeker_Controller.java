package com.example.JobSeeker.Controller;

import com.example.JobSeeker.Repository.Job_seeker_Repository;
import com.example.JobSeeker.Service.job_seeker_Servive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class job_seeker_Controller {
   @Autowired
    job_seeker_Servive jobSeekerServive;



    @RequestMapping("/jobseeker")
    public String jonseeker(){
        return "jobseeker";
    }

    @PostMapping("/savedData")
    public String job(@RequestParam("pic") MultipartFile file , @RequestParam("resume") MultipartFile file2 , @RequestParam("username")String name , @RequestParam("email") String email, @RequestParam("contact") String contact , @RequestParam("address") String address , @RequestParam("password") String password , @RequestParam("skill") String skill)
    {
        try{
            jobSeekerServive.save(file,file2,name , email , contact , address , password , skill);
            return "LoginPage";

        }

        catch ( Exception e)
        {
            return "error"+e;

        }
    }

}
