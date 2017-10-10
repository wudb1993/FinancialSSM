package com.ssm.controller;

import com.ssm.pojo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class UserController {

    @ResponseBody
    @RequestMapping(value="/userTest" ,method= RequestMethod.GET)
    public ModelAndView userTest(User user){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",user.getName());
        mv.addObject("age",user.getAge());

        return mv;
    }

}
