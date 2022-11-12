package com.web.computerservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping(value = "/404", method = RequestMethod.HEAD)
    public String unreachedPage(Model model) {
        model.addAttribute("Error 404");
        return "error";
    }
}
