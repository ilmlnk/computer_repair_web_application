package com.web.computerservice.controller;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RequestController {
    private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

    private final RequestRepository requestRepository;

    public RequestController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    /*
    * Redirecting to home page for the first time.
    * */
    @RequestMapping(value = "/computer_service", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /*
    * Creating new request in modal window.
    * */
    @RequestMapping(value = "/new_request", method = RequestMethod.POST)
    public String showForm(@RequestParam String name, @RequestParam String surname, @RequestParam String phone) {
        logger.info("Creating new Request.");

        Request request = new Request();
        request.setName(name);
        request.setSurname(surname);
        request.setPhoneNumber(phone);

        requestRepository.save(request);
        return "index";
    }

    /*
    * Open page for employees
    * */
    @RequestMapping(value = "/employee")
    public String openEmployeePage() {
        return "employee";
    }

}
