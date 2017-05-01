package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hesha on 2017/5/1.
 */
@Controller
@RequestMapping(value="/hello",method = RequestMethod.GET)
public class HelloController {

    @RequestMapping(value="",method = RequestMethod.GET)
    public String printHello(Model model){

        model.addAttribute("msg","hello world!");
        return "hello";
    }
}
