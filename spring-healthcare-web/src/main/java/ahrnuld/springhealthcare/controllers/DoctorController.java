package ahrnuld.springhealthcare.controllers;

import ahrnuld.springhealthcare.services.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/doctors")
@Controller
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listDoctors(Model model){

        model.addAttribute("doctors", doctorService.findAll());

        return "doctors/index";
    }
}
