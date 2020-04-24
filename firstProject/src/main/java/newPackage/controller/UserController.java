package newPackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {  //we  can make any function we want
    @RequestMapping("/hellospring")
    @ResponseBody
    public String helloWorld()
    {
        return "hello World";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String homeRequest()
    {
        return "home Request";
    }

}
