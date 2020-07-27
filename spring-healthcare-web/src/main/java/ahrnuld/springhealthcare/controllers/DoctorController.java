package ahrnuld.springhealthcare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/doctors")
@Controller
public class DoctorController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listDoctors(){
        return "doctors/index";
    }
}
