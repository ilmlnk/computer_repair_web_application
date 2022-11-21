package com.web.computerservice.controller;

import com.web.computerservice.exceptions.ErrorDto;
import com.web.computerservice.model.Employee;
import com.web.computerservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*
     * Verification control for employees.
     * */
    @RequestMapping(value = "/employee/", method = RequestMethod.POST)
    public String employeeVerification() {

        return "employee";
    }

    /*
     * Opening employee log-in page.
     * */

    @RequestMapping(value = "/employee/", method = RequestMethod.GET)
    public String employeePage() {
        return "employee";
    }


    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") long id) {
        logger.info("");

        Employee employee = employeeService.findEmployeeById(id);
        if (employee == null) {
            logger.error("Unable to delete Employee. Employee with id  " + id + " was not found.");
            return new ResponseEntity<>(
                    new ErrorDto("Unable to delete Employee. Employee with id " + id + " was not found."),
                    HttpStatus.NOT_FOUND
            );
        }
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
