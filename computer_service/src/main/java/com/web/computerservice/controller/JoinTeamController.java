package com.web.computerservice.controller;

import com.web.computerservice.model.Employee;
import com.web.computerservice.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/join_our_team")
public class JoinTeamController {
    public static final Logger logger = LoggerFactory.getLogger(JoinTeamController.class);
    private final EmployeeRepository employeeRepository;

    public JoinTeamController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /*
     * Opening page for joining team.
     * */
    @RequestMapping(value = "/join_us", method = RequestMethod.GET)
    public String joinTeamPage() {
        return "join-team";
    }

    /*
    * Beginning of the registration process.
    * Receiving data from fields.
    * */
    @RequestMapping(value = "/new_employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestParam String name, @RequestParam String surname,
                                   @RequestParam String phone, @RequestParam String email,
                                   @RequestParam String login, @RequestParam String password) {
        logger.info("Creating new Employee.");

        /* Code chunk dedicated to create new Employee */
        

        /* Code chunk dedicated to encrypt password */

        Employee employee = new Employee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setPhoneNumber(phone);
        employee.setEmail(email);
        employee.setLogin(login);
        employee.setEncryptedPassword(password.toCharArray());

        return employee;
    }

    /*Employee employeeEntityByLogin = employeeRepository.findByLogin(externalEmployee.getLogin());

        if (employeeEntityByLogin != null) {
            throw new RuntimeException("Login already exists.");
        }

        Employee employeeEntity = new Employee();
        BeanUtils.copyProperties(externalEmployee, employeeEntity);
        return employeeEntity;*/
}
