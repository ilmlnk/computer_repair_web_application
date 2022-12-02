package com.web.computerservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/computer_service")
public class EmployeeLoginController {

    @RequestMapping(value = "/employee/login", method = RequestMethod.GET)
    public String employeeLoginPage() {
        return "login";
    }

}
