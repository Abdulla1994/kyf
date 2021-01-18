package az.kyf.web.controller;

import az.kyf.web.form.RequestForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public  String index(){
        return "index";
    }


      @GetMapping("/register-request")
         public ModelAndView registerRequest(){
         ModelAndView mav =new ModelAndView("register-request");
          RequestForm form=new RequestForm();
          form.setName("Refili");
          form.setSurname("Abdulla");
          mav.addObject("form",form);
        return mav;




      }


}
