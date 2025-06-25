package com.example.JobSeeker.Controller;

import com.example.JobSeeker.Entity.experience;
import com.example.JobSeeker.Repository.experienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class experienceController {

    @Autowired
    experienceRepository repository;
    @RequestMapping("/experiencepage")
    public String experience(){
        return "experience";
    }

//    int experience_id;
//
//    private String company_name , job_title;
//    LocalDate start_date;
//    LocalDate end_date;
//    String description;
//    int js_id;



    @PostMapping("/saveexperience")
    public String exp( @RequestParam("company_name") String company_name , @RequestParam("JobTitle") String JobTitle ,@RequestParam("description") String description ,  @RequestParam("sdate") LocalDate sdate , @RequestParam("edate") LocalDate edate) throws Exception
    {
        try {

            experience exp = new experience();
            exp.setCompany_name(company_name);
            exp.setJob_title(JobTitle);
            exp.setDescription(description);
            exp.setStart_date(sdate);
            exp.setEnd_date(edate);
           repository.save(exp);
           return "experience";

        }
        catch (Exception e)
        {
            return "error"+e;
        }
//55555
        catch (Exception e)
        {
            return "error"+e;
        }
//        4555
        

    }
}
