package com.web.computerservice.controller;

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
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
