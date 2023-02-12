package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
   @GetMapping("/")
   public String testModel (Model model, ModelMap modelMap){
      model.addAttribute("message", "hello cac ban");
      modelMap.addAttribute("modelMap", "Hello ModelMap");
      return "index";
   }

   @GetMapping("/modelAndView")
   public ModelAndView testModelAndView(){
      ModelAndView modelAndView = new ModelAndView("index","modelAndView", "Hello Model And View");
      return modelAndView;
   }
}
