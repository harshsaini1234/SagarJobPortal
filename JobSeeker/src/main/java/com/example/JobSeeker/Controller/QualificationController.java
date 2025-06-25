package com.example.JobSeeker.Controller;

import com.example.JobSeeker.Entity.qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class QualificationController {
    @Autowired
    qualification Qualification;
    @RequestMapping("/qualificationpage")
    public String qualification(){
        return "Qualification";
    }

//    int ql_id;
//    String degree;
//    String institution;
//    LocalDate yearofpassing;
//    String categries;
//    String grade;


    @PostMapping("savedqualification")
    public String quali( String degree ,String institution  , LocalDate yearofpassing  , String categries, String grade){

          try {

              qualification quali = new qualification();
              quali.setDegree(degree);
              quali.setInstitution(institution);
              quali.setYearofpassing(yearofpassing);
              quali.setCategries(categries);
              quali.setGrade(grade);
              Qualification.save(quali);

              return "Qualification";

          } catch (Exception e) {
              return "error"+e;

          }
    }





}
