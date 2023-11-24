package com.firstProject.firstProjectSpringBooot.springBootCurso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExampleApplication {
    @GetMapping(value = "/")
    public String index(Model model){
            model.addAttribute("tittle" , "I am tittle");
            model.addAttribute("greeting" , "I am greeting");
            model.addAttribute("show" , false);
            //List<String> series = List.of("Dexter", "Game of thrones", "Vikings");
            //model.addAttribute("series" , series);
            return "index";
        }

        @GetMapping(value = "/index-mv")
        public ModelAndView indexMV(ModelAndView mv){
                mv.addObject("tittle", "I am tittle mv");
                mv.addObject("greeting", "I am greeting mv");
                mv.addObject("show", true);
                //List<String> series = List.of("Dexter", "Game of thrones", "Vikings");
                //mv.addObject("series" , series);
                mv.setViewName("index");
        return mv;
        }
    @ModelAttribute("series")
    public List<String> getSeries(){
        return List.of("Dexter", "Game of thrones", "Vikings" , "Flash" , "The Last of Us");
    }
    @RequestMapping(value = "/index-req-mapping", method = RequestMethod.GET)
    public String indexRequestMapping(){
        return "index";
    }
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String errorPage() {
        return "error";
    }

}
