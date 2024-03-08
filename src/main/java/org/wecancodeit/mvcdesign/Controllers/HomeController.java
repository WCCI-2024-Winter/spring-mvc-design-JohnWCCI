package org.wecancodeit.mvcdesign.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
   
    @GetMapping("/")
    public String getMethodName() {
       return "home/index";
    }
    
}
