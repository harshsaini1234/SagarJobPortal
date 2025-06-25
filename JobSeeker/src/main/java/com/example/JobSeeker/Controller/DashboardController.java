package com.example.JobSeeker.Controller;

import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

    @RequestMapping("/MainDashboard")
    public String maindashboard(){
        return "MainDashboard";
    }

  @RequestMapping("/Login")
    public String login()
  {
      return "Login";
  }
}
