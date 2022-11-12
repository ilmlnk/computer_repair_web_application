package com.web.computerservice.controller;

import com.web.computerservice.model.Employee;
import com.web.computerservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("/join_our_team")
public class JoinTeamController {
    public static final Logger logger = LoggerFactory.getLogger(JoinTeamController.class);
    private final EmployeeService employeeService;

    public JoinTeamController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*
     * Opening page for joining team.
     * */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String joinTeamPage() {
        return "join-team";
    }

    /*
    * Beginning of the registration process.
    * */
    @RequestMapping(value = "/new_employee", method = RequestMethod.POST)
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee, UriComponentsBuilder ucBuilder) {
        logger.info("Creating new Employee {}", employee);
        employeeService.saveEmployee(employee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/join_our_team/new_employee/{id}")
                .buildAndExpand(employee.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
