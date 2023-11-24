package com.firstProject.firstProjectSpringBooot.springBootCurso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParametersControl {
    @GetMapping("/parameter")
    public String parameter(@RequestParam String value, Model model){
        model.addAttribute("tittle", "Parameter");
        model.addAttribute("parameter", value);
        return "parameter";
    }
}
