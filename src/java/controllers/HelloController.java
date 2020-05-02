package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String one(ModelMap map){
        map.addAttribute("InitMessage", "Welcome to Spring MVC");
        return "index";
    }
}