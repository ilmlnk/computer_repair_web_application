package com.web.computerservice.controller;

import com.web.computerservice.model.ClientRequest;
import com.web.computerservice.repo.ClientRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ClientRequestController {
    private static final Logger logger = LoggerFactory.getLogger(ClientRequestController.class);

    private final ClientRequestRepository clientRequestRepository;

    public ClientRequestController(ClientRequestRepository clientRequestRepository) {
        this.clientRequestRepository = clientRequestRepository;
    }

    /*
    * Redirecting to home page for the first time.
    * */
    @RequestMapping(value = "/computer_service", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /*
    * Creating new clientRequest in modal window.
    * */
    @RequestMapping(value = "/new_request")
    public String showForm(@Valid ClientRequest clientRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            logger.error("Unable to create new clientRequest.");
            return "/error.ftl";
        }
        clientRequestRepository.save(clientRequest);
        return "index";
    }

    /*
    * Opening log-in page for employees.
    * */
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String employeePage() {
        return "employee";
    }

    /*
    * Opening form for joining team.
    * */
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinTeamPage() {
        return "/join-team.ftl";
    }

}
