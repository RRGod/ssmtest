package cn.nextinnovation.test.controller;/*
*
*@author Administrator houxuan
*@create 2017/10/15
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {

    @RequestMapping("hello")
    public ModelAndView toHello(){
        ModelAndView mv = new ModelAndView("hello111");
        return mv;
    }
}
