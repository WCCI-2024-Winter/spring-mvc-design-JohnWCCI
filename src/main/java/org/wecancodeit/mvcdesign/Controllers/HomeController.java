package org.wecancodeit.mvcdesign.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.mvcdesign.Models.EmployeeModel;
import org.wecancodeit.mvcdesign.Services.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
   
    @Autowired
    private EmployeeService employees; 
    
    @GetMapping({"/","/index"})
    public String getMethodName(Model model) {
        Iterable<EmployeeModel> arrayEmployess = employees.getAllEmployees();
        model.addAttribute("employees", arrayEmployess);
       return "home/index";
    }
    
    @GetMapping("/details/{id}")
   public String getEmployee(@PathVariable Long id, Model model){
        EmployeeModel employee = employees.getEmployee(id);
        model.addAttribute("employee", employee);
        return "home/details";

   }
   @GetMapping("/delete/{id}")
   public String deleteEmployee(@PathVariable Long id){
        employees.deleteEmployee(id);
        return "redirect:/index";

   }
}
