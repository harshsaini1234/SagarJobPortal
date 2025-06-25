package com.example.JobSeeker.Controller;

import com.example.JobSeeker.Repository.CompanyRepository;
import com.example.JobSeeker.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Controller
public class CompanyController {
    @Autowired
    CompanyService companyService;





    @RequestMapping("/companypage")
    public String company(){
        return "company";


      }



    @PostMapping("/savedata")
    public String comp(@RequestParam ("company_logo") MultipartFile file , @RequestParam("name") String name , @RequestParam("contact") String contact , @RequestParam("email") String email , @RequestParam("address") String address , @RequestParam("password") String password , @RequestParam("description") String description , @RequestParam("status") String status , @RequestParam("joining_date")LocalDate joining_date) {
        try{
            companyService.save(file,contact,name,email,address,description,password,joining_date,status);
               return "LoginPage";
        }
        catch (Exception e)
        {
           return "error"+e;
        }

    }


}
