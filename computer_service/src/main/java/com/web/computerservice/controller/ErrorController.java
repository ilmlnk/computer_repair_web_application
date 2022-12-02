package com.web.computerservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping(value = "/404")
    public String unreachedPage(Model model) {
        model.addAttribute("error", "Error 404");
        return "error";
    }

    @RequestMapping(value = "/500")
    public String internalServerErrorPage(Model model) {
        model.addAttribute("error", "Error 500");
        return "error";
    }
}
