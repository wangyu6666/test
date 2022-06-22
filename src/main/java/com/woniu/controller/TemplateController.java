package com.woniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @RequestMapping("/showTemplate")
    public String showTemplate(Model model) {
        Model model1 = model.addAttribute("hello", "hello showTemplate springboot thymeleaf");
        return "index";

    }

}
