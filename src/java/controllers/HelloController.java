package controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String one(ModelMap map){
        map.addAttribute("InitMessage", "Spring MVC");
        return "index";
    }
    
    
    @RequestMapping(value = "/welcome/{country}/{name}", method = RequestMethod.GET)
    public String two(ModelMap map, @PathVariable Map<String, String> pathvars){
        map.addAttribute("InitMessage", "Hellow "+ pathvars.get("name")+" you're from " + pathvars.get("country"));
        return "index";
    }
}