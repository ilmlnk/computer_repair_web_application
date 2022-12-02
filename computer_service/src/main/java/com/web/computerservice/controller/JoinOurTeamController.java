package com.web.computerservice.controller;

import com.web.computerservice.model.Employee;
import com.web.computerservice.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/computer_service")
public class JoinOurTeamController {

    private EmployeeService employeeService;

    public JoinOurTeamController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = {"/join_team", "/join_team/main"}, method = RequestMethod.GET)
    public String joinOurTeamPage() {
        return "/join-team.ftl";
    }

    @RequestMapping(value = "/join_team", method = RequestMethod.POST)
    public String employeeRegistration(@Valid @ModelAttribute("employee") Employee employee,
                                       BindingResult result, Model model) {
        Employee existingEmployee = employeeService.findEmployeeByEmail(employee.getEmail());

        if (existingEmployee != null && existingEmployee.getEmail() != null
                && !existingEmployee.getEmail().isEmpty()) {
            result.rejectValue("email", null,"There is already " +
                    "registered employee with the same email.");
        }

        if (existingEmployee != null && existingEmployee.getPhoneNumber() != null
                && !existingEmployee.getPhoneNumber().isEmpty()) {
            result.rejectValue("phoneNumber", null, "There is already " +
                    "registered employee with the same phone number.");
        }

        if (result.hasErrors()) {
            model.addAttribute("employee", employee);
            return "/join-team.ftl";
        }
        employeeService.saveEmployee(employee);
        return "redirect:/join_team?success";
    }
}
